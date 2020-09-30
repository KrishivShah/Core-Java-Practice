public class surnameinitials
{
    public void display(String s)
    {
        String s1=s.trim();
        int i=s1.indexOf(" ");
        int j=s1.lastIndexOf(" ");
        System.out.println(s1.substring(j)+s1.substring(i,i+2)+"."+s1.substring(0,i)+".");
    }
}
