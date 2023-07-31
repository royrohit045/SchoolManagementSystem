package org.jsp.student.controller;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.jsp.student.dao.StudentDao;
import org.jsp.student.dto.Student;

public class Controller {
static Scanner sc=new Scanner(System.in);
static StudentDao S=new StudentDao();
	public static void main(String[] args) {
System.out.println("1.save Student record");
System.out.println("2.Update Student record");
System.out.println("3.Find Student rank wise");
System.out.println("4.delete Student record by id");
System.out.println("5.Find student details by Name and phonNo");
System.out.println("6.Find Student By Id");
System.out.println("chose operation Id");
int ch=sc.nextInt();

switch (ch) {
case 1: save();
		break;
case 2: update();
        break;
case 3: {
	System.out.println("enter rank");
	int x=sc.nextInt();
	x=x-1;
	List<Student> S1= S.rankwisefind();

	Collections.sort(S1, Collections.reverseOrder());
	Object r=S1.get(x);
	//int z=Integer.parseInt(r);
	int z = ((Integer) r).intValue();
	System.out.println(S.findByTmarks(z));
	break;
	}
case 4: {
	System.out.println("enter student id");
	int x=sc.nextInt();

	Student s1=S.findStudentById(x);
	if(s1!=null) {
		System.out.println(s1);
		S.deleteStudent(s1);
		System.out.println("Record is deleted");
	}else {
		System.out.println("Student id is not present");
	}
         break;
	}
case 5: {
	System.out.println("Enter PhonNo");
long y=sc.nextLong();
	System.out.println("Enter Name");
	String x=sc.next();
	String z=sc.next();
	String r=x+" "+z;
	Student S1= S.findBynameph(y,r);
	if(S1!=null) {
		System.out.println(S1);}
	else {
		System.out.println("enter phonNo and Name is not mach ");
	}
         break;
	}
case 6:{
	System.out.println("Enter Id");
	int e=sc.nextInt();
	System.out.println(S.fetchsbyid(e));
	break;
}
}


	}
	public static void save() {
		Student s=new Student();
		try {
		System.out.println("Enter ID");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		String name1=sc.next();
//		System.out.println("Enter Class");
//		int cl=sc.nextInt();
		System.out.println("Enter phonNO");
		long ph=sc.nextLong();
		System.out.println("Enter 1stLanguage");
		int l1=sc.nextInt();
		System.out.println("Enter 2ndLanguage");
		int l2=sc.nextInt();
		System.out.println("Enter History");
		int h=sc.nextInt();
		System.out.println("Enter Geography");
		int g=sc.nextInt();
		System.out.println("Enter Mathematics");
		int m=sc.nextInt();
		System.out.println("Enter Physics");
		int p=sc.nextInt();
		System.out.println("Enter Chemistry");
		int c=sc.nextInt();
		System.out.println("Enter LifeSince");
		int l=sc.nextInt();
		int TotalMarks=l1+l2+h+g+m+p+c+l;
		double per=(TotalMarks*100)/800;
				s.setId(id);
				String nt=name+" "+name1;
				s.setName(nt);
				
				s.setPhonNo(ph);
				s.setLanguage1(l1);
				s.setLanguage2(l2);
				s.setHistory(h);
				s.setGeography(g);
				s.setMathematics(m);
				s.setPhysics(p);
				s.setChemistry(c);
				s.setLifeSince(l);
				s.setTotalMarks(TotalMarks);
				s.setPercentage(per);
				S.saveStudent(s);
		}catch(Exception e) {
			System.out.println(e);
		}
				
	}
	public static void update() {
		System.out.println("Enter Student_id to update the record");
		int sid=sc.nextInt();
		Student s=new Student();
		Student s1=S.findStudentById(sid);
		if(s1!=null) {
			System.out.println("Enter ID");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			String name1=sc.next();
		
			System.out.println("Enter phonNO");
			long ph=sc.nextLong();
			System.out.println("Enter 1stLanguage");
			int l1=sc.nextInt();
			System.out.println("Enter 2ndLanguage");
			int l2=sc.nextInt();
			System.out.println("Enter History");
			int h=sc.nextInt();
			System.out.println("Enter Geography");
			int g=sc.nextInt();
			System.out.println("Enter Mathematics");
			int m=sc.nextInt();
			System.out.println("Enter Physics");
			int p=sc.nextInt();
			System.out.println("Enter Chemistry");
			int c=sc.nextInt();
			System.out.println("Enter LifeSince");
			int l=sc.nextInt();
			int TotalMarks=l1+l2+h+g+m+p+c+l;
			double per=(TotalMarks*100)/800;
					s.setId(id);
					String nt=name+" "+name1;
					s.setName(nt);
					//s.setStudentclass(cl);
					s.setPhonNo(ph);
					s.setLanguage1(l1);
					s.setLanguage2(l2);
					s.setHistory(h);
					s.setGeography(g);
					s.setMathematics(m);
					s.setPhysics(p);
					s.setChemistry(c);
					s.setLifeSince(l);
					s.setTotalMarks(TotalMarks);
					s.setPercentage(per);
					S.updateStudent(s);
					System.out.println("Updated");
		}else {
			System.out.println("Student id is not present");
		}
	}

}
