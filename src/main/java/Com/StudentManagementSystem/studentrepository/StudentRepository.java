package Com.StudentManagementSystem.studentrepository;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.StudentManagementSystem.entity.Student_info;

@Repository
public class StudentRepository {

	@Autowired
	SessionFactory sf;

	public String insertStudentdata(Student_info stud) {
		
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		 
		s.save(stud);
		tr.commit();
		
		return "Data Added Successfully...!!";
	}

	public List<Student_info> getstudentdata() {
		
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Student_info.class);
		
		return c.list();
	}

	public String updatedata(int roll_no, Student_info studinfo) {
		
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Student_info  st = s.get(Student_info.class, roll_no);
	
		st.setRoll_no(studinfo.getRoll_no());
		st.setFirst_Name(studinfo.getFirst_Name());
		st.setLast_Name(studinfo.getLast_Name());
		st.setAge(studinfo.getAge());
		st.setPercentage(studinfo.getPercentage());
		
		s.update(st);
		tr.commit();
		
		return "Data Update Successfully";
	}

	public String deletedata(int roll_no) {
		
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Student_info ss = s.get(Student_info.class, roll_no);
		
		s.delete(ss);
		tr.commit();
		
		
		return "Delete Successfully..!!";
	}

	public List<Student_info> getstudentbyid(int roll_no) {

		
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Student_info.class);
		c.add(Restrictions.eq("roll_no", roll_no));
		
		return c.list();
	}

}
