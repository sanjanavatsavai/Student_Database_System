package studentdbapp;
import java.util.Scanner;

public class StudentDbApp {

	public static void main(String[] args) {
		// how many users we are adding
		
		
		
		System.out.print("Enter number of new students to enroll: ");
		Scanner sc =  new Scanner(System.in);
		int numOfStu = sc.nextInt();
		Student[] students = new Student[numOfStu];
		
		
		
		//creating students 
		for(int n=0;n<numOfStu;n++) {
			
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();	
			
		}
		
		System.out.println(" These are the new Students we enrolled : ");
        for(int n=0;n<numOfStu;n++) {
			
			System.out.println(students[n].showInfo());
			
			
		}	

	}

}
