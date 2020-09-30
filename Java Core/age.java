import java.util.*;
public class age
{
   public void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your birth year as string");
       String by=sc.next();
       System.out.println("Enter current year as string");
       String cy=sc.next();
       int b=Integer.parseInt(by);
       int c=Integer.parseInt(cy);
       String age=Integer.toString(c-b);
       System.out.println("age:"+age);
    }
}
