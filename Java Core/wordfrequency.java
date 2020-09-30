public class wordfrequency
{
    public void main(String n,String word)
    {
        n=n+" ";
        int count=0;
        int p=0;
        while(p<n.length())
        {
            int index=n.indexOf(' ',p);
            String a=n.substring(p,index);
            if(a.compareToIgnoreCase(word)==0)
            count++;
            p=index+1;
      }
      System.out.println("The number of times "+word+" is present is:"+count); 
    }
}
