// Java program to illustrate Cloneable interface
import java.lang.Cloneable;
  
// By implementing Cloneable interface
// we make sure that instances of class ClonableDemo can be cloned.
public class CloneableDemo implements Cloneable
{
    int i;
    String s;
  
    // A class constructor
    public CloneableDemo(int i,String s)
    {
        this.i = i;
        this.s = s;
    }
  
    // Overriding clone() method
    // by simply calling Object class clone() method.
    @Override
    protected Object clone()
    throws CloneNotSupportedException
    {
        return super.clone();
    }
}
