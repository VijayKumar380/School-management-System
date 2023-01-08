package services;

/**
 * Created by @author VIJAY KUMAR
 * Its responsible for teachers: "name","id","salary".
 * 
*/
public class teacherservice {
private int id;
private String name;
private int salary;
private int salaryearned;
/**
 * This constructor is responsible for 
 * @param id-unique id of teacher,can't change onces it set.
 * @param name-name of the teacher,can't change onces it set.

 */

public teacherservice(int id,String name,int salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.salaryearned=0;
}
/**
 *Here we get id ,name & salary of teacher
 *@return-id of the teacher
 */

public int getId() {
	return id;
}

/**
 * @return-name of the teacher;
 */
public String getName(){
	return name;
}
/**
 * @return-salary of the teacher;
 */

public int getSalary() {
	return salary;
}
/**
 * set salary for teacher
 * @param salary
 */
public void setSalary(int salary) {
	this.salary=salary;
}
/**
 * Here it used to add salaryearn and also reduces
 *  fund from school Earns.
 * @param salary
 */
public void setName(String name) {
	this.name=name;
}

public void receivesalary(int salary) {
	salaryearned += salary;
	schoolservie.udateTotalmoneyspent(salary);
}
@Override
public String toString() {
	return "Teacher's Name: "+id+". "+name+"Total Salary Earned: Rs "+salaryearned;
}



















}

