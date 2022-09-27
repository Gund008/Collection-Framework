import java.util.*;

public class HashSet
{
    public  static void main(String arg[])
{
   //creating Hashset and adding elements
   HashSet<String>set=new HashSet<String>();
   set.add("ravi");
   set.add("Vijay");
   set.add("Ravi");
   set.add("ajay") ;
//Traversing elements
Iterator<String>itr=set.iterator();
while(itr.hasNext())
{
    System.out.println(itr.next());
}
}
}