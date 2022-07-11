//Java program to illustrate Serializable interface
import java.io.Serializable;

//By implementing Serializable interface
//we make sure that state of instances of class SerializableDemo can be saved in a file.
public class SerializableDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2620305967909202767L;
	
	int i;
	String s;
	
	// class constructor
	public SerializableDemo(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	
}
