public class vowel_search
{
    public void search(String n1)
    {
        String n=n1.trim();
        int pos=0;
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                pos=i+1;
                break;
            }
        }
        if(pos==0)
        System.out.println("Sorry no vowel");
        else
        System.out.println("First vowel at position "+pos);
    }
}
