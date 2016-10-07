/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;

public class Student implements IStudent {
	private Integer id_;
	private String firstName_;
	private String lastName_;
	private StudentUnitRecordList studentUnitRecordList_;

	public Student( Integer id, String firstName, String lastName, StudentUnitRecordList studentUnitRecordList ) { this.id_ = id; this.firstName_ = firstName;
	this.lastName_ = lastName;
	this.studentUnitRecordList_ = 
			studentUnitRecordList == null ? new StudentUnitRecordList() : 
				studentUnitRecordList;
	}

	public Integer getID() { 
		return this.id_; 
	} 
	public String getFirstName() { 
		return firstName_; 
		}

	public void setFirstName( String firstName ) { 
		this.firstName_ = firstName;
		}

	public String getLastName() { 
		return lastName_; 
		}
	public void setLastName( String lastName ) { 


		this.lastName_ = lastName; 
		}

	public void addUnitRecord( IStudentUnitRecord record ) { 
		studentUnitRecordList_.add(record); 
		}
	public IStudentUnitRecord getUnitRecord( String unitCode ) {
		for ( IStudentUnitRecord r : studentUnitRecordList_ ) {
			if ( r.getUnitCode().equals(unitCode)) 
				return r; 
		}
		return null;

	}

	public StudentUnitRecordList getUnitRecords() { 
		return studentUnitRecordList_;
		}
	}
