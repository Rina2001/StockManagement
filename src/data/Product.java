package data;

import java.io.Serializable;
import java.util.Date;
import java.text.DateFormat;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8760290813615153393L;
	
	//Fields For Product
	
	private int id;
	private String name;
	private double unitprice;
	private int qty;
	private String importedDate;
	
	//Default Constructor
	public Product() {
		id++;
		name="";
		unitprice=0.0;
		qty=0;
		importedDate=DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());
	}
	
	//Constructor with parameters
	public Product(int id,String name, double unitprice, int qty){
		this.id=id;
		this.name=name;
		this.unitprice=unitprice;
		this.qty=qty;
		importedDate=DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getImportedDate() {
		return importedDate;
	}
	
	@Override
	public String toString(){
		return getId()+"        "+getName()+"        "+getUnitprice()+"        "+getQty()+"        "+getImportedDate();
		
	}
	public static String getTitle(){
		return  "ID          NAME       PRICE      QTY      Import_Data";
	}

}
