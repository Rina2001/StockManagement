import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import data.DataTransaction;
import data.Product;
import manipulate.Commander;
import manipulate.ObjectFileMapping;

import static java.lang.System.out;

import java.text.DateFormat;
public class StockDemo {
	static ArrayList<Product> list =new ArrayList();
	
	public static void main(String[] args)throws Exception {
//		new Commander().menu();
		DataTransaction dt=new DataTransaction();
		String date=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.UK).format(new Date());
//		System.out.println(date);
<<<<<<< HEAD
=======
		long start=System.currentTimeMillis();
		for(int i=0 ;i<1000;i++){
			dt.write(list, new Product(i,"product",11,10,date));
			//list.add(new Product(i,"product",11,10,date));
		}
		long stop=System.currentTimeMillis();
		System.out.println(stop-start);
		dt.display(list, 1, 16);
//		display menu  command prom
		
>>>>>>> origin/master
		
//		for(int i=0 ;i<1_000_000;i++){
//			dt.write(list, new Product(i,"product",11,10,date));
//		}
//		ObjectFileMapping.objectWriter(list,"Storage/Product.bin");
		//ObjectFileMapping.objectWriter(list, "Storage/Product.bin");
     	new Commander().menu();

//		
//		display Content data
//			dt.display(list,24 ,10);
//		System.out.println("\n\nAfter update product");
//		System.out.println("Search");
//		System.out.print("Enter Product Id to update: ");
//		int id=ScannerRead.ReadInt();
//		Product newp=new Product();
//		newp.setName("Coca");
//		dt.update(list,id ,newp);
//		
//		for(Product record : list){
//			System.out.println(record.getId()+"\t"+
//			record.getName()+"\t"+record.getUnitprice()+
//			"\t"+record.getQty()+"\t" +record.getImportedDate());
//		}
//		System.out.println();
//		System.out.println("Search");
//		System.out.print("Enter Product ID to search : ");
//		
//		int index=ScannerRead.ReadInt();
//		Product pd= dt.search(list, index);
//		if(pd!=null){
//			System.out.println(pd.getId()+"\t"+pd.getName()+"\t"+ pd.getUnitprice()
//			+"\t"+pd.getQty()+"\t"+pd.getImportedDate());
//		}
//		System.out.println("after deleted");
//		System.out.println();
//		System.out.println("Search");
//		System.out.print("Enter Product Id to Delete : ");
//		int deleteid=ScannerRead.ReadInt();
//		dt.delete(list, deleteid);
//		
//		for(Product record : list){
//			System.out.println(record.getId()+"\t"+
//			record.getName()+"\t"+record.getUnitprice()+
//			"\t"+record.getQty()+"\t" +record.getImportedDate());
//		}
	}

}
