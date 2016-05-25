package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import KeboardReder.ScannerRead;

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
		importedDate="";
	}
	
	//Constructor with parameters
	public Product(int id,String name, double unitprice, int qty,String date){
		this.id=id;
		this.name=name;
		this.unitprice=unitprice;
		this.qty=qty;
		importedDate=date;
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
	public void setImportedDate(String importedDate) {
		this.importedDate = importedDate;
	}
/*
 * @return Proudct object
 * 
 */
	public static Product productInsert(){
		Product p=new Product();
		
		System.out.print("Enter Product name: ");
		p.setName(ScannerRead.ReadString());
		System.out.println();
		System.out.print("Enter Product Unit Price: ");
		p.setUnitprice(ScannerRead.ReadInt());
		System.out.println();
		System.out.print("Enter Product Unit Quality: ");
		p.setQty(ScannerRead.ReadInt());
		p.setImportedDate(p.GetDate());
		
		return p;
	}
	
	
	
	@Override
	public String toString(){
		return getId()+"        "+getName()+"        "+getUnitprice()+"        "+getQty()+"        "+getImportedDate();
		
	}
	public static String getTitle(){
		return  "ID          NAME       PRICE      QTY      Import_Data";
	}

	public String GetDate(){
		return DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.UK).format(new Date());
	}
}
