import java.lang.*;
import java.io.*;        //importing java pakakage to use StreamReader class

class input_text
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader is =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (is);
        BufferedReader bf =new BufferedReader(is);
        char alphabet;
        String f_name,l_name=" Kumar";
        float deci;
        System.out.print("enter any character :");
        alphabet=(char)bf.read();

        System.out.println("Enter your First name : ");
        f_name=br.readLine();
        
        System.out.println("Enter a floating variable : ");
        deci=Float.parseFloat(br.readLine());
        System.out.println("You entered : "+alphabet);
        System.out.println("Floating variable is : "+deci);
        System.out.println("name :"+f_name+l_name);

    }
}
