package table.tools;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class UneditableTableModel extends DefaultTableModel{

	
	public UneditableTableModel(Object[][] data,Object[] titles) {
		//call the constructor of SuperClass
		super(data,titles);
	}
	
	public UneditableTableModel(Vector<Vector<Object>> data,Vector<Object> titles) {
		//call the constructor of SuperClass
		super(data,titles);
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		// TODO Auto-generated method stub
		return false;
	}

}
