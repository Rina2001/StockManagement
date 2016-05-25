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
	protected ArrayList<Product> t=new ArrayList<>();
	DataTransaction dt=new DataTransaction();
		
	public void menu(){
		out.println(" ______________________________________________________________________________________");
		out.println("| *)Display | W)rite | R|ead | U)pdate | F)irst | P)revious | N)ext | L)ast            |");
		out.println("|     S)earch | G)oto | Se)t row | Sa)ve | Ba)ck up Re)store | H)elp | E)xit           |");
		out.println("|______________________________________________________________________________________|");	
		out.println("Command :--->");

		String cmd=new Scanner(System.in).next();
		
		switch (cmd.toLowerCase()) {
		case "*": dt.display(t,10 ,100000);
		this.menu();
			break;
		case "w":
			dt.write(t,Product.productInsert());
			this.menu();
		break;
//	
//		case "r":dt.read(table, recordId);break;
//		
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
