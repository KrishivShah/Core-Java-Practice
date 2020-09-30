
import java.util.*;
class Array5
{
Scanner sc=new Scanner(System.in);
int s[][]=new int[40][6];
public void abc()
{
for(int i=0;i<40;i++)
{
for(int j=0;j<6;j++)
s[i][j]=sc.nextInt();
}
for(int i=0;i<40;i++)
{
for(int j=0;j<6;j++)
System.out.print(s[i][j]+" ");
System.out.println();
}
}
public void total()
{
int sum=0;
for(int i=0;i<40;i++)
{
sum=0;
for(int j=0;j<6;j++)
{
sum+=s[i][j];
}
System.out.println("Student "+(i+1)+" = "+sum);
}
}
}
