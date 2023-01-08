package services;


/**
 * Created by @author VIJAY KUMAR
 * Its responsible for students: "fees","name","id","std","feespaid".
 * 
*/
public class studentservice {
  private int id;
  private String name;
  private int std;
  private int feespaid;
  private int feestotal;
	
/**
 *  This constructor is responsible for 
 * @param id -unique id for student
 * @param name-name of the student
 * @param std-class of the student
 * fees paid initially is Rs0;
 * fees for each student is individual is Rs150000;
 */
public studentservice(int id,String name,int std) {
	this.feespaid=0;
	this.feestotal=150000;
	this.id=id;
	this.name=name;
	this.std=std;
}
/**
 * Here we update student's std.
 * we don't change student's name & id. 
 * @param std - set std of student 	
 */
public void setStd(int std) {
	this.std =std;
	
}

/**
 * Here we add fees of student and fees keep adding to feespaid field.
 * To start with 0$ to 50000Rs initially then paid again 50000Rs.
 * may again paid 50000Rs.  
 * @param fees-fees that student pays.
 */
public void payfees(int fees) {
	feespaid =+fees;
	schoolservie.updateTotalmoneyearned(feespaid);
}
/**
 *Here get  .
 *@return-id of the student
 */
public int getId(){
	return id;
}
/**
 * 
 * @return-name of the student
 */
public String getName(){
	return name;
}
/**
 * 
 * @return-std of the student
 */
public int getstd(){
	return std;
}
/**
 * 
 * @return-feespaid of the student
 */
public int getFeespaid(){
	return feespaid;
}
/**
 * 
 * @return-feestotal of the student
 */
public int getFeestotal(){
	return feestotal;
}
/**
 * 
 * @return-the pending fees
 */
public int getremainingfees() {
	return feestotal-feespaid;
}
@Override
public String toString() {
	
	return "Student's Name: "+id +". " +name+" || " +"Total Fees Paid:  Rs "+ feespaid+" || "+"Remaing fees: Rs "+getremainingfees();
}
















}



