import java.util.*;
class Array4
{
Scanner sc=new Scanner(System.in);
public void main()
{
int a[][]=new int[3][2];
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
a[i][j]=sc.nextInt();
}
int r1,r2,r3,c1,c2;
r1=r2=r3=c1=c2=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
if(i==0)
r1+=a[i][j];
if(i==1)
r2+=a[i][j];
if(i==2)
r3+=a[i][j];
if(j==0)
c1+=a[i][j];
if(j==1)
c2+=a[i][j];
}
}
System.out.println("Row1="+r1);
System.out.println("Row2="+r2);
System.out.println("Row3="+r3);
System.out.println("Column1="+c1);
System.out.println("Column2="+c2);
}
}
