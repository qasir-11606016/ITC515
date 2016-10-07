/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;
public class StudentUnitRecordProxy implements IStudentUnitRecord {
	private Integer studentID_;
	private String unitCode;
	private StudentUnitRecordManager studentUnitRecordManager_;
	public StudentUnitRecordProxy( Integer id, String code ) 
	{
		this.studentID_ = id;this.unitCode = code;
		this.studentUnitRecordManager_ = StudentUnitRecordManager.instance();}
		public Integer getStudentID() { 
		return studentID_;
		}
		public String getUnitCode() { 
		return unitCode; 
	}
		public void setAsg1(float mark) {
		studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode ).setAsg1(mark);
		}
	public float getAsg1() 
	{
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode ).getAsg1();
		}
	public void setAsg2(float mark) { 
		studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode ).setAsg2(mark);
		}
	public float getAsg2() {
		
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode ).getAsg2();
	}
	public void setExam(float mark) {
		studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode ).setExam(mark);
	}
	public float getExam() 
	{
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode ).getExam();
		}
	public float getTotal() {
		return studentUnitRecordManager_.getStudentUnitRecord( studentID_, unitCode ).getTotal();
		}
	}
