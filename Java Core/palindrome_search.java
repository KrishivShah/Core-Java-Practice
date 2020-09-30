class palindrome_search
{
    public void main(String n)
    {
        int p=0,x;
        n=n+' ';
        String s="";
        while(p<n.length())
        {
            x=n.indexOf(" ",p);
            String word=n.substring(p,x);
            boolean b=reverse(word);
            if(b==true)
            s=s+' '+word;
            p=x+1;
        }
        System.out.println("palindrome words:"+s);
    }
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
