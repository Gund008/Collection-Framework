import java.util.*;

public class ArrayDeque
{
    public static void main(String arg[])
    {
        Deque<String>deque=new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        for(String str:deque)
        {
            System.out.println(str);
        }
    }
}