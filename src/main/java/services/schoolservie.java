package services;

import java.util.List;

import services.studentservice;
import services.teacherservice;
/**
 * Created by @author VIJAY KUMAR
 * Its responsible for keep the track of school:"student","teacher",
 * "total money earn","total money spend on teacher's salary".
*/
public class schoolservie {
private List<teacherservice> teachers;
private List<studentservice> students;
private static int totalmoneyearned;
private  static int totalmoneyspent;
/**
 * 
 * @param teachers-list of teacher in school;
 * @param students-list of students in school;
 */
public schoolservie(List<teacherservice> teachers, List<studentservice> students) {
	super();
	this.teachers = teachers;
	this.students = students;
	totalmoneyearned =0;
	totalmoneyspent =0;
}
/**
 * 
 * @return-list of teacher in school
 */
public List<teacherservice> getTeachers() {
	return teachers;
}
/**
 * 
 * @param teachers-add teacher
 */
public void addTeacher(teacherservice  teacher) {
	teachers.add( teacher);
}
/**
 * 
 * @return the list of student in the school
 */
public List<studentservice> getStudents() {
	return students;
}
/**
 * 
 * @param students-add students
 */
public void addStudents(studentservice student) {
	students.add( student);
}
/**
 * 
 * @return the total money earn by the school.
 */
public int getTotalmoneyearned() {
	return totalmoneyearned;
}
/**
 * 
 * @param Moneyearned if any one pays money can
 *  be add to totalmoneyearned
 */
public static void updateTotalmoneyearned(int Moneyearned) {
	totalmoneyearned += Moneyearned;
}
/**
 * 
 * @return the total money spend.
 */
public int getTotalmoneyspent() {
	return totalmoneyspent;
}
/**
 * 
 * @param totalmoneyspent- the money spent salary to teacher.
 */
public static void udateTotalmoneyspent(int moneyspent) {
	totalmoneyearned -= moneyspent;
}
}

