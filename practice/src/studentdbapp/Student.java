package studentdbapp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int balance;
	private int courseCost = 600;
	private static int id = 1000;
	
	//constructor
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name : ");
		this.firstName = sc.nextLine();
		
		System.out.println("Enter student last name : ");
		this.lastName = sc.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4- Senior\nEnter student class level : ");
		this.gradeYear = sc.nextInt();
		
		System.out.println("My Name is : " + firstName +" "+ lastName+ " "+ " and I am in " + gradeYear +" year"+ " my ID is : " + studentID);
		
		
	}
	
	//ID
	
	public void setStudentID() {
		id++;
		this.studentID =  gradeYear + "" + id;
		
	}
	
	//enrolling in courses 
	public void enroll() {
		
		
        do {
			System.out.print("Enter course to enroll (Q to quit): ");
		    Scanner sc = new Scanner(System.in);
		    String course =  sc.nextLine();
		    if(!course.equals("Q")) {
			courses = courses + "\n" + course;
			balance = balance + courseCost;
		    }
		    else {
		    	break;
		    }
        } while(1!=0);
	
			
			
		System.out.println("Enrolled in : "+ courses);
		
		
		
	}
	
	//balance 
	
	public void viewBalance() {
		System.out.println("Your balance is : "+ balance);
	}
	
	
	
	
	// Paying tuition
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment:$");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		balance = balance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	
	
	

}
