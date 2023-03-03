import java.util.HashMap;
import java.util.Scanner;

//.euals(),split(),==,compareto(),
public class Splitmethod 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter the First String:");
        String str1=sobj.nextLine();

        System.out.println("Please enter the Second String:");
        String str2=sobj.nextLine();

        String str;

        if(str1.compareTo(str2))
        {
            System.out.println("String is Equal");
        }
        else
        {
            System.out.println("String is Not equal");
        }
      
      
    }

}
    

