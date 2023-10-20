import com.clerk.Clerk;
import com.laborpackage.Labor;
import com.manager.Manager;
import com.typeisinterface.Emp;


/**
 * @author afnan
 *
 */
public class Program {

	
	public static void main(String[] args) {
		Emp[] arr = new Emp[3];
		
		arr[0] = new Manager(100,200);
		arr[1] = new Clerk(500);
		arr[2] = new Labor(12,6);
		double total = Emp.calcTotalIncome(arr);
		System.out.println("Total value is: "+total);

	}

}
