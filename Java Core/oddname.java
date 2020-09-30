public class oddname
{
    public void main(String n)
    {
        int c=0;
        for(int i=0;i<n.length();i++)
        {
            int as=(int)n.charAt(i);
            if(as%2==0)
            {
                c++;
            }
        }
        if(c==0)
        System.out.println("Odd name");
        else
         System.out.println("Not Odd name");
    }
}
