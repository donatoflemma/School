//Data Access Object Pattern or DAO pattern is used to 
//separate low level data accessing API or operations 
//from high level business services. 


package designpatterns.dao;

public class DaoPatternDemo {
	   public static void main(String[] args) {
	      StudentDao studentDao = new StudentDaoImpl();

	      //print all students
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }


	      //update student
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //get the student
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
	   }
	}