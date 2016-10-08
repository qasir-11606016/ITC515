/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;

public interface IStudent {

	public Integer getID();

	public String getFirstName();
	public void setFirstName(String firstName);

	public String getLastName();
	public void setLastName(String lastName);

	public void addUnitRecord( IStudentUnitRecord record );
	public IStudentUnitRecord getUnitRecord( String unitCode );

	public StudentUnitRecordList getUnitRecords();

}
