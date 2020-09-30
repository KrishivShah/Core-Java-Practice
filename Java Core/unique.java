public class unique
{
    public void main(String word)
    {
        int count=0;
      for(int i=0;i<word.length();i++)
      {
          for(int j=0;j<word.length();j++)
          {
              if(i==j)
              continue;
              else if(word.charAt(i)==word.charAt(j))
              count++;
          }
      }
      if(count==0)
      System.out.println("unique string");
      else
      System.out.println("not unique string");
    }
}
