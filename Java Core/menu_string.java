import java.util.*;
public class menu_string
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int ch=sc.nextInt();
        System.out.println("Enter a word");
        String n=sc.next();
        switch(ch)
        {
            case 1:
            for(int i=n.length()-1;i>=0;i--)
            System.out.println(n.substring(0,i));
            break;
            case 2:
            for(int i=0;i<n.length();i++)
            {
                for(int j=0;j<=i;j++)
                System.out.print(n.charAt(i));
                System.out.println("");
            }
            break;
            default:
             System.out.println("Enter 1 or 2");
        }
    }
 }

