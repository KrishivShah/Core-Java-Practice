public class vowels
{
    public void count(String s)
    {
        char ch;
        int tot,a,e,i,o,u;
        tot=a=e=i=o=u=0;
        for(int x=0;x<s.length();x++)
        {
            ch=s.charAt(x);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            tot++;
            if (ch=='a')
            a++;
            else if (ch=='e')
            e++;
            else if (ch=='i')
            i++;
            else if (ch=='o')
            o++;
            else if (ch=='u')
            u++;
        }
        System.out.println("Total no. of vowels is "+tot);
        System.out.println("no. of times a was repeated "+a);
        System.out.println("no. of times e was repeated "+e);
        System.out.println("no. of times i was repeated "+i);
        System.out.println("no. of times o was repeated "+o);
        System.out.println("no. of times u was repeated "+u);
    }
}
