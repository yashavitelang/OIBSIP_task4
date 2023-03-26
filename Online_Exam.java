

package infobytetasks;

import java.util.*;
public class Online_Exam {
    Scanner sc = new Scanner(System.in);
    
    HashMap<String,Integer> data = new HashMap<String,Integer>();

	public void login() {
		data.put("yashavi",4567);
		System.out.println("\n\n**********WELCOME TO ONLINE EXAM SYSTEM*****************");
		String UserId;
		int password;
		System.out.println("Enter Login details ");
		System.out.print("Enter UserId : ");
		UserId = sc.next();
		System.out.print("Enter password : ");
		password = sc.nextInt();
		if(data.containsKey(UserId) && data.get(UserId)==password) {
			System.out.println("\n LOGIN SUCCESSFULLY");
				option_menu();
		}
		else {
			System.out.println(" INVALID LOGIN ");
			System.out.println("Try Again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("\nSelect an Option ");
		System.out.println("1.Update Profile and Password");
		System.out.println("2.Start  Exam");
		System.out.println("3.Logout");
		select = sc.nextInt();
		switch(select) {
		case 1:
			data=update();
			option_menu();
			break;
		case 2:
			exam_que();
			option_menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("select the appropriate option.");
		}
	}
	public HashMap<String,Integer> update(){
		String uUser;
		int upass;
		System.out.println("Update Profile");
		System.out.println("Enter Username");
		uUser = sc.next();
		if(data.containsKey(uUser)) {
		System.out.println("Enter new Password you to want to Update to your Profile");
		upass = sc.nextInt();
		data.replace(uUser, upass);
                    System.out.println("Profile updated successfully.");
		}
		else {
			System.out.println("User Doesn't Exist");
		}
		return data;
	}
public void exam_que() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30;
	int ans_count=0;
	int ans,score;
	System.out.println("Start Your Exam");

	
//Question starts
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 30 seconds to answer 5 questions");
		System.out.println("Each Question carries 10 marks"+" "+"-5 for wrong answer");
		System.out.println("\n\nQ.1) Which of the following is not a Java features?");
		System.out.println("\n(1) Dynamic"+"\t"+"(2) Architectural Neutral"+"\t"+"(3) Use of Pointers"+"\t"+"(4) Object-Oriented");
		System.out.println("Enter Correct Option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==3) {
			ans_count++;
		}
		System.out.println("\n\nQ.2)______is used to find and fix bugs in the Java programs.");
		System.out.println("1)JVM"+"\t"+"2)JRE"+"\t"+"3) JDK"+"\t"+"4)JDB");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==4) {
			ans_count++;
		}
		System.out.println("\n\nQ.3)What is the return type of the hashCode() method in the Object class?");
		System.out.println("1) Object"+"\t"+"(2) int"+"\t"+"3)long"+"\t"+"4)void");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n\nQ.4)In which process, a local variable has the same name as one of the instance variables?");
		System.out.println("1) Serialization"+"\t"+"2) Variable Shadowing"+"\t"+"3) Abstarction"+"\t"+"4)Multi-threading");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("\n\nQ.5) Which of the following is a reserved keyword in Java?");
		System.out.println("1)  object"+"\t"+"2) strictfp"+"\t"+"3) main"+"\t"+"4) system");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		break;
	}
	System.out.println("You have finished the exam");
	score=ans_count*10-((5-ans_count)*5); 
	System.out.println("Your score is..."+" "+score+"/50");	
}

public static void main (String[] args)
{
	Online_Exam log =new Online_Exam();
		log.login(); 
}
}
