package studentdbapp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int id;
	private String courses;
	private int balance;
	private int courseCost = 600;
	
	//constructor
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name : ");
		this.firstName = sc.nextLine();
		
		System.out.println("Enter student last name : ");
		this.lastName = sc.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4- Senior\nEnter student class level : ");
		this.gradeYear = sc.nextInt();
		
		System.out.println("My Name is : " + firstName +" "+ lastName+ " "+ " and I am in " + gradeYear +" year");
		
		
	}
	
	

}
