package manipulate;
import java.io.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import static java.lang.System.out;

import data.DataTransaction;
import data.Product;
/**
 * @author chen rina
 * @ObjectFileMappingis used for drive with Storage 
 */
public final class ObjectFileMapping {
		
	/**
	 * @Method ObjectWriter to write Object to file
	 * @pro mean product reference
	 * @file Name
	 */
	public static void objectWriter(ArrayList<Product> pro,String fileName){
		try{
		BufferedOutputStream bfOut;
		ObjectOutputStream objectOutputStream;
		bfOut=new BufferedOutputStream(new FileOutputStream(fileName));
			objectOutputStream=new ObjectOutputStream(bfOut);
				objectOutputStream.writeObject(pro);
				out.println("Done\n"); 
				objectOutputStream.close();
		}
		catch(Exception e){
			e.getLocalizedMessage();
		}
	}
	/**
	 * @author chen rina
	 * @param fileName file Name
	 * @return {@link ArrayList}
	 * @throws Exception super class exception to catch error
	 */
	public static ArrayList<Product> objectReader(String fileName)throws Exception{
		ArrayList<Product>pro;
		BufferedInputStream bfInput;
			bfInput=new BufferedInputStream(new FileInputStream(fileName));
			ObjectInputStream obj=new ObjectInputStream(bfInput);
				pro=(ArrayList<Product>) obj.readObject();
				obj.close();
		return pro;
	}
	
	/**
	 * @author chen rina
	 * @static block code testing for writing colection to file
	 */
	
	static {
		    ArrayList<Product> list =new ArrayList();
			DataTransaction dataTransact=new DataTransaction();
			 String date=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.UK).format(new Date());
			long start=System.currentTimeMillis();
			for(int i=1 ;i<1E6;i++){
				dataTransact.write(list, new Product(i,"Fanta",11,10,date));
			}
			ObjectFileMapping.objectWriter(list, "Storage/Product.bin");
			long stop=System.currentTimeMillis();
			System.out.println(stop-start);
}
	
}

