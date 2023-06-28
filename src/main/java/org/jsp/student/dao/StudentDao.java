package org.jsp.student.dao;

//import javax.management.Query;
import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.student.dto.Student;

public class StudentDao {
	EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();

	public Student saveStudent(Student s) {
		m.persist(s);
		EntityTransaction tx = m.getTransaction();
		tx.begin();
		tx.commit();
		return s;
	}

	public Student findStudentById(int id) {
		return m.find(Student.class, id);
	}

	public Student updateStudent(Student user) {
		EntityTransaction tx = m.getTransaction();
		m.merge(user);
		tx.begin();
		tx.commit();
		return user;

	}

	public List <Student>rankwisefind() {
	//	String S = "SELECT * from(select name, totalMarks,dense_rank() over(order by totalMarks desc)r from Student) where r=1";

	//String sq=	"SELECT * FROM(SELECT name,totalMarks , DENSE_RANK() over(ORDER BY totalMarks DESC) AS ranking Student) AS kWHERE ranking=?1";
	//	Query q=m.createNativeQuery(sq);
		//		q.setParameter(1,x);
		String qry="select s.totalMarks from Student s";
		Query q=m.createQuery(qry);
		return  q.getResultList();
	}

	public Student deleteStudent(Student user) {
		EntityTransaction tx = m.getTransaction();
		m.remove(user);
		tx.begin();
		tx.commit();
		return user;

	}

	public Student findBynameph(long x, String y) {
		String s = "select s from Student s where name=?1 and phonNo=?2";
		Query q = m.createQuery(s);

		q.setParameter(1, y);
		q.setParameter(2, x);
		return (Student) q.getSingleResult();
	}
	public Student findByTmarks(int x) {
		String s="Select s from Student s where totalMarks=?1";
		Query  q= m.createQuery(s);
		q.setParameter(1,x);
		return (Student)q.getSingleResult();
	}
	public Student fetchsbyid(int x) {
		return m.find(Student.class,x);
	}
}
