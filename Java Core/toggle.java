class toggle
{
    public void main(String n)
    {
        String s="";
        char ch;
        for(int i=0;i<n.length();i++)
        {
            ch=n.charAt(i);
            if(ch>='a' && ch<='z')
            ch=Character.toUpperCase(ch);
            else if(ch>='A' && ch<='Z')
            ch=Character.toLowerCase(ch);
            s=s+ch;
        }
        System.out.println (s);
    }
}
