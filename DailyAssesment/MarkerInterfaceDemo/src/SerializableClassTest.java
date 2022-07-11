import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableClassTest {

	public static void main(String[] args)
		      throws IOException, ClassNotFoundException
		    {
		        SerializableDemo a = new SerializableDemo(20,"Sudeb");
		  
		        // Serializing 'a'
		        FileOutputStream fos = new FileOutputStream("xyz.txt");
		        ObjectOutputStream oos = new ObjectOutputStream(fos);
		        oos.writeObject(a);
		  
		        // De-serializing 'a'
		        FileInputStream fis = new FileInputStream("xyz.txt");
		        ObjectInputStream ois = new ObjectInputStream(fis);
		        
		        //down-casting object
		        SerializableDemo b = (SerializableDemo)ois.readObject();
		  
		        System.out.println(b.i+" "+b.s);
		  
		        // closing streams
		        oos.close();
		        ois.close();
		    }
}
