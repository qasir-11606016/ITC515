/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;

import java.util.List;
import org.jdom.*;

public class StudentUnitRecordManager {

	private static StudentUnitRecordManager studentUnitRecordManager_ = null;
	private StudentUnitRecordMap studentUnitRecordMap;
	private java.util.HashMap<String,StudentUnitRecordList> ur;
	private java.util.HashMap<Integer,StudentUnitRecordList> sr;
	public static StudentUnitRecordManager instance() {
		if (studentUnitRecordManager_ == null ) studentUnitRecordManager_ = new StudentUnitRecordManager(); return studentUnitRecordManager_;
	}
	private StudentUnitRecordManager() {
		studentUnitRecordMap = new StudentUnitRecordMap();
		ur = new java.util.HashMap<>();
		sr = new java.util.HashMap<>();
	}
	public IStudentUnitRecord getStudentUnitRecord( Integer studentID,
			String unitCode ) {
		IStudentUnitRecord ir = studentUnitRecordMap.get(studentID.toString()+unitCode);
		return ir != null ? ir : createStudentUnitRecord(studentID, unitCode);
	}

	private IStudentUnitRecord createStudentUnitRecord( Integer uid, String sid ) {
		IStudentUnitRecord studentRecord;
		for (Element el : (List<Element>) XMLManager.getXML().getDocument()
				.getRootElement().getChild("studentUnitRecordTable").
				getChildren("record")) {
			if (uid.toString().equals(el.getAttributeValue("sid")) 
					&& sid.equals(el.getAttributeValue("uid"))) {
				studentRecord = new StudentUnitRecord( new Integer(el.getAttributeValue("sid"))
						,el.getAttributeValue("uid"),
						new Float(el.getAttributeValue("asg1")).floatValue(),
						new Float(el.getAttributeValue("asg2")).floatValue(),
						new Float(el.getAttributeValue("exam")).floatValue() );
				studentUnitRecordMap.put(studentRecord.getStudentID().toString()+studentRecord.getUnitCode()
				, studentRecord);
				return studentRecord;
			}
		}
		throw new RuntimeException("DBMD: createStudent :"
				+ " student unit record not in file");
	}
	public StudentUnitRecordList getRecordsByUnit( String unitCode ) {
		StudentUnitRecordList recs = ur.get(unitCode);
		if ( recs != null ) return recs; 
		recs = new StudentUnitRecordList();
		for (Element el : (List<Element>) XMLManager.getXML().
				getDocument().getRootElement().
				getChild("studentUnitRecordTable").getChildren("record")) {
			if (unitCode.equals(el.getAttributeValue("uid"))) 
				recs.add(new StudentUnitRecordProxy
						( new Integer(el.getAttributeValue("sid")),
								el.getAttributeValue("uid")));
		}
		if ( recs.size() > 0 ) 
			ur.put(unitCode, recs); // be careful - this could be empty
		return recs;
	}

	public StudentUnitRecordList getRecordsByStudent( Integer studentID ) {
		StudentUnitRecordList recs = sr.get(studentID);
		if ( recs != null ) return recs; recs = new StudentUnitRecordList();
		for (Element el : (List<Element>) XMLManager.getXML()
				.getDocument().getRootElement().
				getChild("studentUnitRecordTable").getChildren("record")) 
			if (studentID.toString().equals(el.getAttributeValue("sid"))) 
				recs.add(new StudentUnitRecordProxy
						( new Integer(el.getAttributeValue("sid")), 
								el.getAttributeValue("uid")));
		if ( recs.size() > 0 ) 
			sr.put(studentID, recs); // be careful - this could be empty
		return recs;
	}

	public void saveRecord( IStudentUnitRecord irec ) {
		for (Element el : (List<Element>) XMLManager.getXML().
				getDocument().getRootElement().getChild("studentUnitRecordTable")
				.getChildren("record")) {
			if (irec.getStudentID().toString().
					equals(el.getAttributeValue("sid")) && irec.getUnitCode().
					equals(el.getAttributeValue("uid"))) {
				el.setAttribute("asg1", new Float(irec.getAssigment()).toString());



				el.setAttribute("asg2", new Float(irec.getAsg2()).toString());
				el.setAttribute("exam", new Float(irec.getExam()).toString());
				XMLManager.getXML().saveDocument(); //write out the XML file for continuous save
				return;
			}
		}


		new RuntimeException("DBMD: saveRecord : "
				+ "no such student record in data");
	}
	}
