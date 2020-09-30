class Array7
{
public static void main(int c)
{
int a[][]=new int[5][5];
switch(c)
{
case 1:
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
a[i][j]=100;
}
break;
case 2:
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
a[i][j]=150;
}
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
if(i==j)
a[i][j]=50;
}
}
int w=4;
for(int i=0;i<5;i++)
{
a[i][w]=50;
w--;
}
break;
default:
System.out.println("ERROR!");
}
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print(a[i][j]+" ");
if(a[i][j]<100)
System.out.print(" ");
}
System.out.println();
}
}
}