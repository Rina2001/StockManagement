package manipulate;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

import KeboardReder.ScannerRead;
import data.DataTransaction;
import data.Product;
/**
 * 
 * @author chen rina
 * @Class Commander  is used for control attitude of program
 */
public  class Commander {
	protected ArrayList<Product> list=new ArrayList<>();
	DataTransaction dt=new DataTransaction();
		
	public void menu(){
		out.println(" ______________________________________________________________________________________");
		out.println("| *)Display | W)rite | R|ead | U)pdate | F)irst | P)revious | N)ext | L)ast            |");
		out.println("|     S)earch | G)oto | Se)t row | Sa)ve | Ba)ck up Re)store | H)elp | E)xit           |");
		out.println("|______________________________________________________________________________________|");	
		out.println("Command :--->");

		String cmd=new Scanner(System.in).next();
		
		switch (cmd.toLowerCase()) {
		case "*": dt.display(list,10 ,100000);
		this.menu();
			break;
		case "w":
			dt.write(list,Product.productInsert());
			this.menu();
		break;
//	
		case "r": 
			//get id of product form user enter 
			int listId=0;	
			//check if user enter out of product id in stock
			do{
				listId=Product.ProductRead();
				System.out.println("ID you Enter don't have in the products record.Please enter again! ");
			}while(dt.read(list, listId)==null);
			// after dt.read(list,listId)!=null;
			//it can read the product from the list
			Product product=dt.read(list, listId);
			System.out.println("--------------------------");
			System.out.println("ID : " +product.getId());
			System.out.println("Name : "+product.getName());
			System.out.println("UnitPrice : "+product.getUnitprice());
			System.out.println("Qualities : "+product.getQty());
			System.out.println("DateInStock : "+product.getImportedDate());
			this.menu();
			break;
//		case "u": dt.update(table, proId, newRecord);break;
//		
		case "f":
				break;	 // Display First; 
		case "n":
				break;	 // Next Content;
		case "l":
				break;	//Last Record;
		case "s":
				break;	//search record;
		case "g":
				break;
		case "se":		//set row
				break;
		case "sa":
				break; //save record
		case "B":
				break;// back up file
		case "re":
				break;//restore
		case "h":
				break;//help 
		case "e":System.exit(0);
			
		default:out.println("Invalid Command\n");
			menu();
		}
	}
}
