public class techno
{
    public void check()
    {
        for(int i=1000;i<=9999;i++)
        {
            if(tech(i)==true)
            System.out.println(i+" is a tech no.");
        }
    }
    private boolean tech(int n)
    {
        int no=n,d=0,a=0;
       while(n!=0)
       {
         d=n%10;
         a++;
         n/=10;
        }
        a/=2;
        int x=no%(int)Math.pow(10,a);
        int y=no/(int)Math.pow(10,a);
        int z=x+y;
        int b=(int)Math.pow(z,2);
        if(b==no)
        return true;
        else 
        return false;
    }
}
