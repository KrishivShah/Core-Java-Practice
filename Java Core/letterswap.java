public class letterswap
{
    public void main(String n)
    {
        for(int i=0;i<n.length();i++)
        {
            int as=(int)n.charAt(i);
            if(as>=65&&as<=88)
            as+=2;
            else if(as==89)
            as=65;
            else if(as==90)
            as=66;
            System.out.print((char)as);
        }
    }
}

