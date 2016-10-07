/* Student Name :Muhammad Qasir Ali
 * student id :11606012
 * lecture :Sir recep
 * auhtor  Muhammad qasir ali 
 * */
package datamanagement;
public class ListUnitsCTL {
	private UnitManager unitManger_;
	public ListUnitsCTL() {
		unitManger_ = UnitManager.UM();
	}
	public void listUnits( IUnitLister lister ) {
		lister.clearUnits();UnitMap units = unitManger_.getUnits();
		for (String s : units.keySet() )
			lister.addUnit(units.get(s));
		}
	}
