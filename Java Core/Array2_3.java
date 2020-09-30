import java.util.*;
class Array2_3
{
Scanner sc=new Scanner(System.in);
public void main()
{
int a[][]=new int[5][3];
for(int i=0;i<5;i++)
{
for(int j=0;j<3;j++)
a[i][j]=sc.nextInt();
}
int min,max,x1,x2,y1,y2;
min=max=a[0][0];
x1=x2=y1=y2=0;
for(int i=0;i<5;i++)
{
for(int j=0;j<3;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
for(int i=0;i<5;i++)
{
for(int j=0;j<3;j++)
{
if(a[i][j]<min)
{
min=a[i][j];
x1=i;
y1=j;
}
if(a[i][j]>max)
{
max=a[i][j];
x2=i;
y2=j;
}
}
}
System.out.println("Maximum="+max);
System.out.println("Co-ordinates="+x2+","+y2);
System.out.println("Minimum="+min);
System.out.println("Co-ordinates="+x1+","+y1);
}
}