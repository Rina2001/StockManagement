package data;

import static java.lang.System.out;

import java.util.ArrayList;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.CellStyle.HorizontalAlign;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import manipulate.DataManipulation;

public class DataTransaction implements DataManipulation{

	/**
	 * @return product object
	 */
	@Override
	public Product write(ArrayList<Product> table, Product record) {
		table.add(record);
		return record;
	}

	@Override
	public ArrayList display(ArrayList<Product> table,int position,int perpage){
		ArrayList<Product> list=new ArrayList<>();
		float devperPage= (float)table.size()/perpage;
		int pageAmount= (int) Math.ceil(devperPage);  
//		System.out.println(pageAount);
		if(pageAmount<position){
			position=pageAmount;
		}
		int start=(position-1)*perpage;
		int end=perpage+start;
		if(position==pageAmount){
			end= (table.size()-((pageAmount-1)*perpage))+start;
		}
//		System.out.println(end);
		for(int i=start;i<end;i++){
			list.add(table.get(i));
		}
		
		CellStyle cs = new CellStyle(HorizontalAlign.center);
		Table tb = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
	    tb.setColumnWidth(0, 10, 14);
	    tb.setColumnWidth(1, 25, 30);
	    tb.setColumnWidth(2, 10, 16);
	    tb.setColumnWidth(3, 10, 16);
	    tb.setColumnWidth(4, 10, 16);
	    
		tb.addCell("ID", cs);
		tb.addCell("Name",cs);
		tb.addCell("Unit Price",cs);
		tb.addCell("Qty",cs);
		tb.addCell("Imported Date",cs);
		
		for(Product record : list){
			tb.addCell(String.valueOf(record.getId()),cs);
			tb.addCell(record.getName());
			tb.addCell(String.valueOf(record.getUnitprice()),cs);
			tb.addCell(String.valueOf(record.getQty()),cs);
			tb.addCell(record.getImportedDate(),cs);
		}
		out.println(tb.render());
		return list;
	}

	@Override
	public Object read(ArrayList<Product> table, int recordId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean update(ArrayList<Product> table, int proId, Product newRecord) {
		boolean rt=false;
		int index=0;
		ArrayList<Product> list=(ArrayList)table;
		for(Product p:list){
			if(p.getId()==proId){
				rt=true; break;
			}else{
				rt=false;
				index++;
			}
		}
		if(rt){
			list.set(index, newRecord);
		}
		return rt;
	}

	@Override
	public boolean delete(ArrayList<Product> table, int proId) {
		boolean rt=false;
		int index=0;
		for(Product p: table){
			if(p.getId()==proId){
				rt=true; break;
			}else{
				rt=false;
				index++;
			}
		}
		if(rt){
			table.remove(index);
		}
		return rt;
	}

	@Override
	public Product search(ArrayList<Product> table, int id) {
		boolean rt=false;
		Product product=null;
		int index=0;
		for(Product p:table){
			if(table.size()<id){
				product=null;break;
			}else{
				if(p.getId()==id){
					rt=true; break;
				}else{
					rt=false;
					index++;
				}
			}
		}
		
		if(rt){
			product=table.get(index);
		}
		return product;
	}

}
