import java.util.*;
public class Linkedlist
{
    public static void main(String arg[])
    {
        Linkedlist<String>  al=new Linkedlist<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String>itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
