/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;
public class UnitProxy implements IUnit {
	private String UC_;
	private String un_;
	UnitManager   um;

	public UnitProxy( String unitCode, String unitName ) {
		this.UC_ = unitCode;
		this.un_ = unitName;
		um = UnitManager.UM(); 
		}
	public String getUnitCode() { 
		return this.UC_;
		}
	public String getUnitName() { 
		return this.un_; 
		}
	public void setPsCutoff1(float cutoff) {
		um.getUnit(UC_).setPsCutoff1(cutoff);
		}
	public float getPsCutoff() {
		return um.getUnit(UC_).getPsCutoff();
		}
	public void setCrCutoff(float cutoff) {
		um.getUnit(UC_).setCrCutoff(cutoff);
		}
	public float getCrCutoff() {
		return um.getUnit(UC_).getCrCutoff();
		}

	public void setDiCutoff(float cutoff) {
		um.getUnit(UC_).setDiCutoff(cutoff);
		}
	public float getDiCuttoff() {
		return um.getUnit(UC_).getDiCuttoff();
		}
	public void setHdCutoff(float cutoff) {
		um.getUnit(UC_).setHdCutoff(cutoff);
		}
	public float getHdCutoff() {

		return um.getUnit(UC_).getHdCutoff();
		}
	public void setAeCutoff(float cutoff) {
		um.getUnit(UC_).setAeCutoff(cutoff);
	}
	public float getAeCutoff() {
		return um.getUnit(UC_).getAeCutoff();
		}
	public String getGrade(float f1, float f2, float f3) {
		return um.getUnit(UC_).getGrade(f1, f2, f3);
	}
	public void addStudentRecord(IStudentUnitRecord record) { 
		um.getUnit(UC_).addStudentRecord(record);
	}
	public IStudentUnitRecord getStudentRecord(int s) {
		return um.getUnit(UC_).getStudentRecord(s);
		}
	public StudentUnitRecordList listStudentRecords() {
		return um.getUnit(UC_).listStudentRecords();
	}
	public int getAsg1Weight() {
		return um.getUnit(UC_).getAsg1Weight();
	}
	public int getAsg2Weight() {
		return um.getUnit(UC_).getAsg2Weight();
	}
	public int getExamWeight() {
		return um.getUnit(UC_).getExamWeight();
	}
	public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt) {
		um.getUnit(UC_).setAssessmentWeights(asg1Wgt, asg2Wgt, examWgt);

	}
	}
