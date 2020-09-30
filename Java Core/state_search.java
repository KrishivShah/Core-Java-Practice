class state_search
{
  String s[],c[];
  public state_search(String state[],String city[])
  {
      s=state;
      c=city;
    }
  public void search(String state)
  {
      int p=-1;
      for(int i=0;i<s.length;i++)
      {
          if(s[i].equalsIgnoreCase(state))
          {p=i;
              break;
            }
        }
        if(p==-1)
        System.out.println("Not in list");
        else
        System.out.println("Capital is "+c[p]);
    }
}