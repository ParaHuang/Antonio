package table.tools;

import javax.swing.table.DefaultTableModel;

public class UneditableTableModel extends DefaultTableModel{
	
	public UneditableTableModel(Object[][] data,Object[] titles) {
		//call the constructor of SuperClass
		super(data,titles);
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}

}
