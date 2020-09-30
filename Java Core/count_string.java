public class count_string
{
    public void count(String s)
    {
        String s1=s.trim();
        char ch;
        int word=0,sent=0,space=0;
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(ch==' ')
            space++;
            else if(ch=='.'||ch=='?'||ch=='!')
            sent++;
        }
        word=space+1;
        System.out.println("no. of spaces "+space);
        System.out.println("no. of words "+word);
        System.out.println("no. of sentences "+sent);
    }
}
