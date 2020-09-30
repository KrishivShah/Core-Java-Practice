import java.util.*;
public class max_min
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][3];
        System.out.println("Enter elements");
        int x1=0,y1=0,x2=0,y2=0,max=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int min=a[0][0];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                    x1=i;
                    y1=j;
                }
                if(a[i][j]<min)
                {
                    min=a[i][j];
                    x2=i;
                    y2=j;
                }
            }
        }
        System.out.println("Smallest number"+min);
        System.out.println("Coordinates "+(x2+1)+","+(y2+1));
        System.out.println("Largest number"+max);
        System.out.println("Coordinates "+(x1+1)+","+(y1+1));
    }
}
