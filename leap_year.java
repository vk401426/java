//java Program to find a year is leap or not.

import java.lang.*;
import java.io.*;
public class leap_year 
{   
    public static void main(String args[]) throws IOException     //IOexception is always used while keyboard Input is used
    {
        DataInputStream temp =new DataInputStream(System.in);

        int year=0;     // Declaration of required varible
                        
                        /*for better results initilaise the variable as soon as posible
                         else it will store garbage value may minupulate your results.*/
        
        System.out.println("\n\n\nWelcome to undefined World of java ....\n\n\n");
        System.out.print("Enter year : ");
        year=Integer.parseInt(temp.readLine());
        
        if(year%4==0)                                           
        {
            System.out.println(year+" is a leap year");
        }
        else
            System.out.println(year+" is a not a leap ");
    }
}
