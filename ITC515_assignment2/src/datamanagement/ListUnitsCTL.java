/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;
public class ListUnitsCTL {
	private UnitManager um;
	public ListUnitsCTL() {
		um = UnitManager.UM();
	}
	public void listUnits( IUnitLister lister ) {
		lister.clearUnits();UnitMap units = um.getUnits();
		for (String s : units.keySet() )
			lister.addUnit(units.get(s));
		}
	}
