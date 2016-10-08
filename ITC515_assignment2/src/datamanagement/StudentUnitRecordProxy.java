/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;
public class StudentUnitRecordProxy implements IStudentUnitRecord {
	private Integer studentID_;
	private String unitCode_;
	private StudentUnitRecordManager studentUnitRecordManager_;
	public StudentUnitRecordProxy( Integer id, String code ) 
	{
		this.studentID_ = id;this.unitCode_ = code;
		this.studentUnitRecordManager_ = StudentUnitRecordManager.instance();}
		public Integer getStudentID() { 
		return studentID_;
		}
		public String getUnitCode() { 
		return unitCode_; 
	}
		public void setAssignment(float mark) {
		studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode_ ).setAssignment(mark);
		}
	public float getAssigment() 
	{
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode_ ).getAssigment();
		}
	public void setAssignment2(float mark) { 
		studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode_ ).setAssignment2(mark);
		}
	public float getAsg2() {
		
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode_ ).getAsg2();
	}
	public void setExam(float mark) {
		studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode_ ).setExam(mark);
	}
	public float getExam() 
	{
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode_ ).getExam();
		}
	public float getTotal() {
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode_ ).getTotal();
		}
	}
