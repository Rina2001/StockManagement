import java.util.ArrayList;
import data.DataTransaction;
import data.Product;
import manipulate.Commander;

import static java.lang.System.out;
public class StockDemo {
	static ArrayList<Product> list =new ArrayList();
	
	public static void main(String[] args) {

		DataTransaction dt=new DataTransaction();

		for(int x=1;x<=1E6;x++){
			Product p=new Product(x,"Gloria",2,5);//list.add(p);
			Commander.list.add(p);
		}
//		display menu  command prom
		new Commander().menu();
		
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
