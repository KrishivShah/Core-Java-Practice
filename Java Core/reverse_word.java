class reverse_word
{
    public void main(String n)
    {
        String st1="",st2="";
        char ch;
        n=n+' ';
        for(int i=0;i<n.length();i++)
        {
            ch=n.charAt(i);
            if(ch==' ')
            {
                st2=st2+' '+st1;
                st1="";
            }
            else
            st1=ch+st1;
        }
        System.out.println(st2);
    }
}
