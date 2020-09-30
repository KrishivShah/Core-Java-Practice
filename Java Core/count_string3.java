public class count_string3
{
    public void main(String n)
    {
      int lc=0,uc=0,d=0,sp=0;
      for(int i=0;i<n.length();i++)
      {
          char ch=n.charAt(i);
          if(Character.isLowerCase(ch))
          lc++;
          else if(Character.isUpperCase(ch))
          uc++;
          else if(Character.isDigit(ch))
          d++;
          else if(ch==' ')
          sp++;
        }
       System.out.println("No. of Lower Case"+lc);
       System.out.println("No. of Upper Case"+uc);
       System.out.println("No. of Digits"+d);
       System.out.println("No. of Special Characters"+(n.length()-(uc+lc+sp+d)));
    }
}
