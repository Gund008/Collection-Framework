import java.util.HashMap;
import java.util.Scanner;

public class Program450 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the String");
        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();

        HashMap <Character,Integer> hobj=new HashMap<>();
        int Frequency=0;

        for(char ch:Arr)
        {
            if(hobj.containsKey(ch))
            {
                Frequency=hobj.get(ch);
                hobj.put(ch,Frequency + 1);
            }
            else
            {
                hobj.put(ch,1);
            }
        }
       System.out.println(hobj);
    }
    
}
