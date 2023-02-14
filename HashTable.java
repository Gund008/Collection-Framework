

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Program453
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the String");

        String str=sobj.nextLine();

        String Arr[]=str.split(" ");

        HashMap <String,Integer> hobj=new HashMap<>();
        int Frequency=0;

        for(String ch:Arr)
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

