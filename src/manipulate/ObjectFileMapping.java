package manipulate;
import java.io.*;
import java.util.ArrayList;
import static java.lang.System.out;
import data.Product;
/*
 * @ObjectFileMapping is used for drive with Storage 
 */
public final class ObjectFileMapping {
		
	/*
	 * @Method ObjectWriter to write Object to file
	 * @pro mean product reference
	 * @file Name
	 */
	public static void objectWriter(ArrayList<Product> pro,String fileName)throws Exception{
		FileOutputStream outStr=new FileOutputStream(fileName);
		ObjectOutputStream objectOutputStream;
			objectOutputStream=new ObjectOutputStream(outStr);
				objectOutputStream.writeObject(pro);
				out.println("Done\n"); 
				objectOutputStream.close();
	}
	
	public static ArrayList<Product> objectReader(String fileName)throws Exception{
		ArrayList<Product>pro;
		BufferedInputStream bfInput;
			bfInput=new BufferedInputStream(new FileInputStream(fileName));
			ObjectInputStream obj=new ObjectInputStream(bfInput);
				pro=(ArrayList<Product>) obj.readObject();
				obj.close();
		return pro;
	}
	
	
}

