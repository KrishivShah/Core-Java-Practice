public class reverse
{
    public void main(String n)
    {
        String rev="";
        n+=" ";
        int p=0;
        while(p<n.length())
        {
            int a=n.indexOf(' ',p);
            String s=n.substring(p,a);
            rev=s+" "+rev;
            p=a+1;
        }
         System.out.println("Reverse sentence:"+rev);
    }
}
