public class a_to_an
{
   public void main(String n)
   {
        String s="";
        int c=0,i;
        while(c<n.length())
        {
            i=n.indexOf(' ',c);
            String word=n.substring(c,i);
            if(word.compareToIgnoreCase("a")==0)
            s=s+" an";
            else
            s=s+" "+word;
            c=i+1;
        }
        System.out.println(s);
   }
}
