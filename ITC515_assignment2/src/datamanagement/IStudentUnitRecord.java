/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;

public interface IStudentUnitRecord {

	public Integer getStudentID();
	public String getUnitCode();

	public void setAssignment(float mark);
	public float getAssigment();

	public void setAsg2(float mark);
	public float getAsg2();

	public void setExam(float mark);
	public float getExam();

	public float getTotal();
}
