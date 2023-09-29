//Java program to find area of triangle ,circle Rectangle 
import java.lang.*;
import java.io.*;
class area
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader is =new InputStreamReader (System.in);
        BufferedReader bf=new BufferedReader(is);
        
        float rec_len,rec_wid;
        float tri_s1,tri_s3,tri_s2,s;
        float cir_rad;
        float rec_ar,cir_ar,tri_ar;         //declared the required variables for calculation.
         
        System.out.println("\t\t\tWelcome to undefined world of java ....\n\n\n");
        
        //Area of rectangle
        System.out.println("Input the dimensions of Rectangle :\n");
        System.out.print("Length = ");
        rec_len=Float.parseFloat(bf.readLine());
        System.out.print("Width = ");
        rec_wid=Float.parseFloat(bf.readLine());
        rec_ar=(rec_len*rec_wid);

        //Area of Triangle
        System.out.println("\n\nInput the dimension of Triangle : ");
        System.out.print("Side A = ");
        tri_s1=Float.parseFloat(bf.readLine());
        System.out.print("Side B = ");
        tri_s2=Float.parseFloat(bf.readLine());
        System.out.print("Side C : ");
        tri_s3=Float.parseFloat(bf.readLine());
        s=(tri_s1+tri_s2+tri_s3)/2.0f;                                      //semi perimeter formula.
        tri_ar=(float)(Math.sqrt(s*(s-tri_s1)*(s-tri_s2)*(s-tri_s3)));      //formula for area of triangle.
        
        //Area of Circle
        System.out.println("\n\nInput the radius of Circle :\nRadius = ");
        cir_rad=Float.parseFloat(bf.readLine());
        cir_ar=(22f/7)*cir_rad*cir_rad;

        //Results
        System.out.println("\n\nArea of Rectangle = "+rec_ar);
        System.out.println("\nArea of Triangle = "+tri_ar);
        System.out.println("\nArea of Circle = "+cir_ar);

        System.out.print("\n\n\n\t\t\tE.O.F\n\t\t\t~ Again from URJA...");
    }

}