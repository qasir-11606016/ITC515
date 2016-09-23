/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;

public class Student implements IStudent {
	private Integer id;
	private String firstName_;
	private String lastName_;
	private StudentUnitRecordList su_;

	public Student( Integer id, String fn, String ln, StudentUnitRecordList su ) { this.id = id; this.firstName_ = fn;
	this.lastName_ = ln;this.su_ = 
			su == null ? new StudentUnitRecordList() : 
				su;
	}

	public Integer getID() { return this.id; 
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
		su_.add(record); 
		}
	public IStudentUnitRecord getUnitRecord( String unitCode ) {
		for ( IStudentUnitRecord r : su_ ) {
			if ( r.getUnitCode().equals(unitCode)) 
				return r; 
		}
		return null;

	}

	public StudentUnitRecordList getUnitRecords() { 
		return su_;
		}
	}
