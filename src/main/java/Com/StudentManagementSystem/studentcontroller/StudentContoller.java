package Com.StudentManagementSystem.studentcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Com.StudentManagementSystem.entity.Student_info;
import Com.StudentManagementSystem.studentservice.StudentService;

@RestController
public class StudentContoller {

	
	@Autowired
	StudentService stu ;
	
	
	// Insert the Data In The Database...API
	
	@PostMapping("/insert")
	public String insertStudentdata(@RequestBody Student_info stud)
	{
		return stu.insertStudentdata(stud);
	}
	
	// Get All Data
	
	@GetMapping("/alldata")
	public List<Student_info> getstudentdata()
	{
		return stu.getstudentdata();
	}
	
	
	// Update the Data By Using Roll_No API
	
	@PutMapping("/update/{roll_no}")
	public String updatedata(@PathVariable int roll_no , @RequestBody Student_info studinfo)
	{
		return stu.updatedata(roll_no , studinfo);
		
	}
	
	// Delete The Data API
	
	@DeleteMapping("/delete/{roll_no}")
	public String deletedata(@PathVariable  int roll_no)
	{
		return stu.deletedata(roll_no);
	}
	
	// Get Data BY Using Roll_No API
	
	@GetMapping("/get/{roll_no}")
	public List<Student_info> getstudentbyid(@PathVariable int roll_no)
	{
		return stu.getstudentbyid(roll_no);
	}
	
}
