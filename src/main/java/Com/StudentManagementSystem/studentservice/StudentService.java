package Com.StudentManagementSystem.studentservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Com.StudentManagementSystem.entity.Student_info;
import Com.StudentManagementSystem.studentrepository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sturep;
	
	
	public String insertStudentdata(Student_info stud) {
		return sturep.insertStudentdata(stud) ;
	}


	public List<Student_info> getstudentdata() {
		return sturep.getstudentdata();
	}


	public String updatedata(int roll_no , Student_info studinfo) {
		return sturep.updatedata(roll_no ,studinfo );
	}


	public String deletedata(int roll_no) {
		return sturep.deletedata(roll_no);
	}


	public List<Student_info> getstudentbyid(int roll_no) {
		return sturep.getstudentbyid(roll_no);
	}



}
