/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;

public class Unit implements IUnit {
	private String uc_;
	private String UN_;
	private float co2_;
	private float co1_;
	private float co4_;
	private float co3_;
	private float co5_;
	private int a1_, a2_, ex_;

	private StudentUnitRecordList rs;

	public Unit(String UC, String un, float f1, float f2, float f3, float f4,
			float f5, int i1, int i2, int i3, StudentUnitRecordList rl) {

		uc_ = UC;
		UN_ = un;
		co2_ = f1;
		co1_ = f2;
		this.co4_ = f3;
		co3_ = f4;
		this.co5_ = f5;
		this.setAssessmentWeights(i1, i2, i3);
		rs = rl == null ? new StudentUnitRecordList() : rl;
	}

	public String getUnitCode() {
		return this.uc_;
	}

	public String getUnitName() {

		return this.UN_;
	}

	public void setPsCutoff1(float cutoff) {
		this.co2_ = cutoff;
	}

	public float getPsCutoff() {
		return this.co2_;
	}

	public void setCrCutoff(float cutoff) {
		this.co1_ = cutoff;
	}

	public float getCrCutoff() {
		return this.co1_;
	}

	public void setDiCutoff(float cutoff) {
		this.co4_ = cutoff;
	}

	public float getDiCuttoff() {
		return this.co4_;
	}

	public void HDCutoff(float cutoff) {
		this.co3_ = cutoff;
	}

	public void setHdCutoff(float cutoff) {
		this.co3_ = cutoff;
	}

	public float getHdCutoff() {
		return this.co3_;

	}

	public void setAeCutoff(float cutoff) {
		this.co5_ = cutoff;
	}

	public float getAeCutoff() {
		return this.co5_;
	}

	public void addStudentRecord(IStudentUnitRecord record) {
		rs.add(record);
	}

	public IStudentUnitRecord getStudentRecord(int studentID) {
		for (IStudentUnitRecord r : rs) {
			if (r.getStudentID() == studentID)
				return r;
		}
		return null;
	}

	public StudentUnitRecordList listStudentRecords() {
		return rs;
	}

	@Override
	public int getAsg1Weight() {
		return a1_;
	}

	@Override
	public int getAsg2Weight() {
		return a2_;
	}

	@Override
	public int getExamWeight() {
		return ex_;
	}

	@Override
	public void setAssessmentWeights(int a1, int a2, int ex) {
		if (a1 < 0 || a1 > 100 ||
				a2 < 0 || a2 > 100 ||
				ex < 0 || ex > 100 ) {
			throw new RuntimeException("Assessment weights cant "
					+ "be less than zero or greater than 100");
		}			
		if (a1 + a2 + ex != 100) {
			throw new RuntimeException("Assessment weights must add to 100");
		}
		this.a1_ = a1;
		this.a2_ = a2;
		this.ex_ = ex;			
	}

	private void setCutoffs( float ps, float cr, float di, float hd, float ae) {
		if (ps < 0 || ps > 100 ||
				cr < 0 || cr > 100 ||
				di < 0 || di > 100 ||
				hd < 0 || hd > 100 ||
				ae < 0 || ae > 100 ) {
			throw new RuntimeException("Assessment cutoffs cant be "
					+ "less than zero or greater than 100");
		}
		if (ae >= ps) {
			throw new RuntimeException("AE cutoff must be less than PS cutoff");
		}
		if (ps >= cr) {
			throw new RuntimeException("PS cutoff must be less than CR cutoff");
		}
		if (cr >= di) {
			throw new RuntimeException("CR cutoff must be less than DI cutoff");
		}
		if (di >= hd) {
			throw new RuntimeException("DI cutoff must be less than HD cutoff");
		}

	}

	public String getGrade(float f1, float f2, float f3) {
		float t = f1 + f2 + f3;

		if (f1 < 0 || f1 > a1_ ||
				f2 < 0 || f2 > a2_ ||
				f3 < 0 || f3 > ex_ ) {
			throw new RuntimeException("marks cannot be less than zero "
					+ "or greater than assessment weights");
		}

		if (t < co5_) {
			return "FL";
		} else if (t < co2_)
			return "AE";
		else if (t < co1_)
			return "PS";
		else if (t < co4_)
			return "CR";
		else if (t < co3_)
			return "DI";
		else
			return "HD";
	}


}