public class CloneableClassTest
{
    public static void main(String[] args)
        throws CloneNotSupportedException
    {
        CloneableDemo a = new CloneableDemo(20, "Sudeb");
  
        // cloning 'a' and holding
        // new cloned object reference in b
  
        // down-casting as clone() return type is Object
        CloneableDemo b = (CloneableDemo)a.clone();
  
        System.out.println(b.i);
        System.out.println(b.s);
    }
}