public class palindrome
{
    public boolean reverse(String s)
    {
        String s1=s.trim();
        String rev="";
        char ch;
        for(int i=s1.length()-1;i>=0;i--)
        {
             ch=s1.charAt(i);
            }
      if(s1.equals(s))
      return true;
      else 
      return false;
    }
}
