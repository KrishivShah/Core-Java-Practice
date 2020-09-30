import java.util.*;
class selection_search
{
    Scanner sc=new Scanner(System.in);
    public void search()
    {
        int s,index=-1;
        int n[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println("Enter search element");
        s=sc.nextInt();
       
        for(int j=0;j<10;j++)
        {
            if(n[j]==s)
            {index=j;
                break ;
            }
        }
        if(index==-1)
            System.out.println("Not in list");
        else
            System.out.println("Present in list at "+(index+1));
    }
}