public class small_letters
{
    public void main(String s)
    {
        String u="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90)
            ch=(char)(ch+32);
            u=u+ch;
        }
        System.out.println(u);
    }
}
