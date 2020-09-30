public class initialssurname
{
     public void main(String n1)
     {
         String n=n1.trim();
         char a=n.charAt(0);
         int fspace=n.indexOf(' ');
         fspace++;
         char b=n.charAt(fspace);
         int lspace=n.lastIndexOf(' ');
         String c=n.substring(lspace);
         System.out.println(a+". "+b+"."+c);
        }
}
