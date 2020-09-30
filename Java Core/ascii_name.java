public class ascii_name
{
    public void ascii(String n1)
    {
        String n=n1.trim();
        for(int i=0;i<n.length();i++)
        {
            int ch=(int)n.charAt(i);
            System.out.println("ASCII value of "+n.charAt(i)+" is "+ch);
        }
    }
}
