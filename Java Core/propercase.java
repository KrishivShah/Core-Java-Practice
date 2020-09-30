public class propercase
{
    public void main(String n1)
    {
        String n=n1.toLowerCase();
        String propercase="";
        propercase=propercase+Character.toUpperCase(n.charAt(0));
        for(int i=1;i<n.length();i++)
        {
            if(n.charAt(i)==' ')
            propercase=propercase+" "+Character.toUpperCase(n.charAt(++i));
            else
            propercase=propercase+n.charAt(i);
        }
        System.out.println(propercase);
    }
}
