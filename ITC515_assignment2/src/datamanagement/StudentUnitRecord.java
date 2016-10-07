/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;

public class StudentUnitRecord implements IStudentUnitRecord {
	private Integer studentID_;
	private String unitCode_;
	private float a1, a2, ex;

	public StudentUnitRecord(Integer id, String code, float asg1, float asg2,
			float exam) {
		this.studentID_ = id;
		this.unitCode_ = code;
		this.setAssignment(asg1);
		this.setAssignment2(asg2);
		this.setExam(exam);
	}

	public Integer getStudentID() {
		return studentID_;
	}

	public String getUnitCode() {
		return unitCode_;
	}

	public void setAssignment(float a1) {
		if (a1 < 0 ||
				a1 > UnitManager.unitManger().getUnit(unitCode_).getAsg1Weight()) {
			throw new RuntimeException("Mark cannot be "
					+ "less than zero or greater than assessment weight");
		}
		this.a1 = a1;
	}

	public float getAssigment() {

		return a1;
	}

	public void setAssignment2(float a2) {
		if (a2 < 0 ||
				a2 > UnitManager.unitManger().getUnit(unitCode_).getAsg2Weight()) {
			throw new RuntimeException("Mark cannot be less "
					+ "than zero or greater than assessment weight");
		}
		this.a2 = a2;

	}

	public float getAsg2() {
		return a2;
	}

	public void setExam(float ex) {
		if (ex < 0 ||
				ex > UnitManager.unitManger().getUnit(unitCode_).getExamWeight()) {
			throw new RuntimeException("Mark cannot be less "
					+ "than zero or greater than assessment weight");
		}
		this.ex = ex;
	}

	public float getExam() {
		return ex;
	}

	public float getTotal() {
		return a1 + a2 + ex;

	}
}
