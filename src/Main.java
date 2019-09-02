import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
		
	    HashMap<Employee,Project> map=new HashMap<>();
	    
	    Employee e1=new Employee(1,"Tanish",1000,"Engg","It");
	    Employee e2=new Employee(1,"Tanish",1000,"Engg","It");
	    Employee e3=new Employee(2,"Jay",1000,"Engg","Cs");
	    Employee e4=new Employee(2,"Jay",1000,"Engg","Cs");
	    
		
		Project p1=new Project(101,"Payment",20,"Jon");
		Project p2=new Project(102,"E-commerce",30,"Clark");
		
		map.put(e1, p1);
		map.put(e2, p1);
		map.put(e3,p2);
		map.put(e4, p2);
		
		for(Map.Entry<Employee, Project> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		

	}

}