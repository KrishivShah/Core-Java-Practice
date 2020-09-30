public class initialsurname
{
   public void main(String n1)
   {
       String n=n1.trim();
       char a=n.charAt(0);
       String b=n.substring(n.indexOf(' '));
       System.out.println(a+"."+b);
    }
}
