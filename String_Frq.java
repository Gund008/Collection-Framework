

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Program452
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
        Set<Character>setobj=hobj.keySet();
        
        int imax=0;
        char cmax=' ';
        for(char value:setobj)
        {
            if(imax < hobj.get(value))
            {
                imax=hobj.get(value);
                cmax=value;
            }
            
        }
        System.out.println("Maximum times occured character is:"+cmax+"with frequency"+imax);
       
    }
}

