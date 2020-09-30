import java.util.*;
public class first_last_letter
{
    public void main()
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String n=sc.nextLine();
       System.out.println("Enter'F' for first letters and 'L' for last letters ");
       char ch=sc.next().charAt(0);
       switch(ch)
       {
           case'F':
           n=' '+n;
           for(int i=0;i<n.length();i++)
           {
               char a=n.charAt(i);
               if(a==' ')
                System.out.print(n.charAt(i+1)+" ");
           }
           break;
           case'L':
           n=n+' ';
           for(int i=0;i<n.length();i++)
           {
               char a=n.charAt(i);
               if(a==' ')
                System.out.println(n.charAt(i-1));
           }
           break;
           default:
            System.out.println("Enter F or L");
       }
    }
}
