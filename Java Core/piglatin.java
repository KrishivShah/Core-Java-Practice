public class piglatin
{
    public void main(String n)
    {
        n=n.toLowerCase();
        int i=0;
        for( i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            break;
         }
        if(i==0)
        System.out.println(n);
        else
        System.out.println(n.substring(i)+n.substring(0,i)+"ay");
    }211
}
