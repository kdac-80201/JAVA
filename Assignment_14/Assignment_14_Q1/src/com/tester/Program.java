package com.tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.candidate.Candidate;
import com.candidatedao.CandidateDao;
import com.partyvotespackage.PartyVotes;


public class Program {
	
	
	static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("0. EXIT ");
		System.out.println("1. Add Candidate ");
		System.out.println("2. Delete Candidate");
		System.out.println("3. Display All candidate ");
		System.out.println("4. Find by party ");
		System.out.println("5. vote with id ");
		System.out.println("6. Update Candidate ");
		System.out.println("7. total votes party wise ");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int choice;
		
		while((choice = menu())!=0) {
		
			switch (choice) {
			
			case 1:
				try(CandidateDao dao = new CandidateDao()){	
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter your name ");
					String name = sc.next();
					System.out.println("Enter Party ");
					String party = sc.next();
					System.out.println("Enter votes ");
					int votes = sc.nextInt();
					
					int cnt = dao.addCandidate(id,name,party,votes);
					System.out.println("Rows affected "+cnt);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
				break;
			case 2:
				try(CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter candidate id to be deleted: ");
					int id = sc.nextInt();
					int cnt = dao.deleteById(id);
					System.out.println("Candidates deleted: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case 3:
				try(CandidateDao dao = new CandidateDao()) {
					List<Candidate> list = dao.findAll();
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try(CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter party: ");
					String party = sc.next();
					List<Candidate> list = dao.findByParty(party);
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try(CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter candidate id (to vote): ");
					int candidateId = sc.nextInt();
					int cnt = dao.incrementVote(candidateId);
					System.out.println("Rows updated: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			case 6:
				try(CandidateDao dao = new CandidateDao()){	
					System.out.println("Enter candidate id ");
					int id = sc.nextInt();
					System.out.println("Enter your name ");
					String name = sc.next();
					System.out.println("Enter Party ");
					String party = sc.next();
					System.out.println("Enter votes ");
					int votes = sc.nextInt();

					int cnt = dao.updateCandidate(id,name,party,votes);
					System.out.println("Rows affected ");
				}	
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 7:
				try(CandidateDao dao = new CandidateDao()) {
					List<PartyVotes> list = dao.getPartywiseVotes();
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
				

			default:
				System.out.println("Invalid Entry! ");
				break;
			}
			
			
		}
		
	}
}







