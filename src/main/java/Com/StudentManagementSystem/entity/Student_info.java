package Com.StudentManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_info {
	
	private int roll_no;
	private String First_Name;
	private String Last_Name;
	private int age;
	private float percentage;
	
	@Id
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "Student_info [roll_no=" + roll_no + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", age="
				+ age + ", percentage=" + percentage + "]";
	}
	
	
	

}
