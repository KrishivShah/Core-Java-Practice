import java.util.*;
public class row_column_total
{
    public void main()
    {   Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter elements");
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of each row");
        for(int i=0;i<3;i++)
        {
            sum=0;
            for(int j=0;j<3;j++)
            {
                
                sum+=a[i][j];
            }
            System.out.println("sum:"+sum);
        }
        System.out.println("sum of each column");
        for(int j=0;j<3;j++)
        {
            sum=0;
            for(int i=0;i<3;i++)
            {
                
                sum+=a[i][j];
            }
            System.out.println("sum:"+sum);
        }
    }
}
