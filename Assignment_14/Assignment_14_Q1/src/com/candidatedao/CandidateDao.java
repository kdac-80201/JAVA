package com.candidatedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Dbpackage.DbUtil;
import com.candidate.Candidate;
import com.partyvotespackage.PartyVotes;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// add new candidate
	
	public int addCandidate(int id,String name,String party, int votes) throws SQLException {
		String sql = "Insert into candidates values(?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, party);
			stmt.setInt(4, votes);
			
			return stmt.executeUpdate();
		}
	}
	
	
	
	// delete given candidate
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} //stmt.close();
	}
	
	// update candidate
	
	public int updateCandidate(int id,String name,String party, int votes) throws SQLException {
		
		String sql = "update candidates set name=?,party=?,votes=? where id =?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, votes);
			stmt.setInt(4, id);
			int cnt = stmt.executeUpdate();
			System.out.println("Rows inserted. "+cnt);
			return cnt;
		}
	}
	
	// get all candidates
	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}
	
	// increment candidate vote
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt; 
		} //stmt.close();
	}
	
	// get all candidates of given party
	public List<Candidate> findByParty(String givenParty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}
	
	
	public List<PartyVotes> getPartywiseVotes() throws SQLException {
		List<PartyVotes> list = new ArrayList<>();
		String sql = "select party,sum(votes) as partywisevotes from candidates group by party";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					String party = rs.getString("party");
					int partyvotes = rs.getInt("partywisevotes");
					PartyVotes c = new PartyVotes(party, partyvotes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}

}






