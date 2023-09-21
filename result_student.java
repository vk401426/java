//program to show multilevel inheritance 
import java.io.*;
class result_student extends marks
{
    public static void main (String args[]) throws IOException
    {
        marks std = new marks();
        std.in_detail();
        std.calc_marks(87, 76, 23, 56);
        std.dis_detail();
        std.dis_marks();
    }
}
class detail
{
    int roll_no;
    String name;

    void in_detail() throws IOException
    {
        DataInputStream temp =new DataInputStream(System.in);//hello
        System.out.println("\t\t * * Student Details * *");
        System.out.print("\n\n Name : ");
        name=temp.readLine();
        System.out.print("\n Roll No : ");
        roll_no=Integer.parseInt(temp.readLine());//1234  char ascii char
      }

    void dis_detail()
    {
        System.out.println("\t\t * * Student Details * *");
        System.out.print("\n\n Name : "+name);
        System.out.print("\n Roll No : "+roll_no);
        
    }
}

class marks extends detail
{
    int total_marks;
    float average;
    String grade;

    void calc_marks(int m1,int m2,int m3,int m4)
    {
        total_marks=m1+m2+m3+m4;
        average=(float) (total_marks/4.0);// 43/4=10.75  =10.7500

    }
    
    void dis_marks()
    {   
        System.out.println("\n\n *** MARKS ***");
        System.out.println("Totoal Marks : "+total_marks);

        System.out.println("Average : "+average);
        if(average>=90 && average<=100)
            grade="A+";
        else if(average<90)
            grade="A";
        else if(average<80)
            grade="B";
        else if(average<60)
            grade="c";
        else if(average<40)
            grade="D";
        else if(average<30)
            grade="Fail (First Attempt In Learning)";//congrats you are again here for  a year 

        System.out.println(" \n Grade : "+grade);

    }
}
