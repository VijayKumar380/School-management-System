package Vj.school_management.corejavaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import services.schoolservie;
import services.studentservice;
import services.teacherservice;

/**
 *Created by @author VIJAY KUMAR
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		teacherservice Jayakumar =new teacherservice(1,"Jayakumar",10000);
		teacherservice Geetha =new teacherservice(2,"Geetha",11000);
		teacherservice Harini =new teacherservice(3,"Harini",9000);
		teacherservice Deena =new teacherservice(4,"Deena",12000);
		teacherservice Benjamin =new teacherservice(5,"Benjamin",9500);
		teacherservice Hema =new teacherservice (6,"Hema",5000);
		
		List<teacherservice> teacherList = new ArrayList<teacherservice>();
		teacherList.add(Benjamin);
		teacherList.add(Deena);
		teacherList.add(Harini);
		teacherList.add(Geetha);
		teacherList.add(Jayakumar);
		
		studentservice Vijay =new studentservice(1,"vijay",12);
		studentservice Jay =new studentservice(4,"Jay",11);
		studentservice Priya =new studentservice(3, "Priya",11);
		studentservice Daphney =new studentservice(2,"Daphney",12);
		
		List<studentservice> studentList = new ArrayList<studentservice>();
		studentList.add(Vijay);
		studentList.add(Daphney);
		studentList.add(Jay);
		studentList.add(Priya);
	
		
	schoolservie myschool = new schoolservie(teacherList,studentList );
	
	myschool.addTeacher(Hema);
	Priya.payfees(100000);
	Vijay.payfees(50000);
	Daphney.payfees(70000);
	System.out.println("------\t\tMYSCHOOL  FUND  EARNED: Rs "+myschool.getTotalmoneyearned()+"\t\t-----");
	  System.out.println(" ");
	System.out.println("------\t\tMySCHOOL  SALARY  \t\t\t\t\t-----");
    
	Geetha.receivesalary(Geetha.getSalary());
	Benjamin.receivesalary(Benjamin.getSalary());
	 Harini.receivesalary(Harini.getSalary());
    System.out.println("MYSCHOOL  SALARY  CREIDTED TO:  "+Geetha.getName());
    
   
    System.out.println("MYSCHOOL  SALARY  CREIDTED TO:  "+Harini.getName());
    
    System.out.println("MYSCHOOL  SALARY  CREIDTED TO:  "+Benjamin.getName());
    
    System.out.println("BALANCES  FUND  REMANING:  "+myschool.getTotalmoneyearned());
    
    System.out.println("--------------------------------------------------------");
    System.out.println(Vijay);
    System.out.println(Daphney);
    System.out.println(Priya);
    System.out.println(Jay);
    
    System.out.println("--------------------------------------------------------");
    System.out.println(Jayakumar);
    System.out.println(Geetha);
    System.out.println(Harini);
    System.out.println(Deena);
    System.out.println(Benjamin);
    System.out.println(Hema);
    
    Scanner ip=new Scanner(System.in);
    System.out.println("--------------------------------------------------");
    System.out.println(" FOR ADDING TEACHER 1||  FOR ADDING STUDENT");
    int ao =ip.nextInt();
    switch(ao) {
    case 1:
    	System.out.println("Enter Teacher Id");
    	int ti =ip.nextInt();
    	ip.nextLine();
    	System.out.println("Enter Teacher Name");
    	String ts =ip.nextLine();
    	System.out.println("Enter a Teacher Salary");
    	int st = ip.nextInt();
    	
    	System.out.println(teacherList.add(new teacherservice(ti,ts,st)));
    	
    	for(teacherservice t:teacherList) {
    		System.out.println(t);
    	}
    	break;
	case 2:
		System.out.println("Enter Student Id");
    	int si =ip.nextInt();
    	ip.nextLine();
    	System.out.println("Enter Student Name");
    	String ss =ip.nextLine();
    	System.out.println("Enter a  Std");
    	int tt = ip.nextInt();
    	
    	System.out.println(studentList.add(new studentservice(si,ss,tt)));
    	
    	for(studentservice t:studentList) {
    		System.out.println(t);
    	}
    		break;
    	}
		
    	
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

