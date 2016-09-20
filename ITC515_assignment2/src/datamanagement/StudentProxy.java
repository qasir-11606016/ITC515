package datamanagement;
public class StudentProxy implements IStudent {
	private Integer id_;
	private String firstName_;



	private String Il;
	private StudentManager lI;
	public StudentProxy( Integer id, String fn, String Il) {
		this.id_ = id;
		this.firstName_ = fn;


		this.Il = Il;
		this.lI = StudentManager.get();
		}

	public Integer getID() { 
		return id_; 

	    }
	
	public String getFirstName() { 
		return firstName_; 
		}

	public String getLastName() { 
		return Il; 
		}
	public void setFirstName(String firstName) {
		lI.getStudent(id_).setFirstName(firstName);
		}
	public void setLastName(String lastName) {

		lI.getStudent(id_).setLastName(lastName);
		}

	public void addUnitRecord(IStudentUnitRecord record) {
		lI.getStudent(id_).addUnitRecord(record);
		}
	public IStudentUnitRecord getUnitRecord(String unitCode) {


		return lI.getStudent(id_).getUnitRecord(unitCode);
		}

	public StudentUnitRecordList getUnitRecords() { 
		return lI.getStudent(id_).getUnitRecords();
		}
	}
