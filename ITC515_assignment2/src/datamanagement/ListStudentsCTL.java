/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;
public class ListStudentsCTL {
	private StudentManager studentManager1;
	public ListStudentsCTL() {
		studentManager1 = StudentManager.get();
		}
	public void listStudents( IStudentLister lister, String unitCode ) {
		lister.clearStudents();
		StudentMap students = studentManager1.getStudentsByUnit( unitCode );
		for (Integer id : students.keySet() ) 
			lister.addStudent(students.get(id));
		}
	}
