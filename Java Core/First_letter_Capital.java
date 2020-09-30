public class First_letter_Capital
{
    public void main(String n)
    {
        char ch,ch1;
        String s= " ";
        for(int i=0;i<n.length();i++)
        {
            ch=n.charAt(i);
            if(ch==' ')
            {
                ch1=n.charAt(i+1);
                ch=Character.toUpperCase(ch1);
                i++;
            }
            s=s+' '+ch;
        }
        System.out.println (s);
    }
}
