
public class TeleSelSort
{
    String n[];
    long telno[];
    public TeleSelSort(String n1[],long tele[])
    {
        n=n1;
        tele=telno;
    }
    public void search(String s)
    {
        int l=n.length-1;
        int f=0;
        int pos=-1;
        int m=0;
        while(pos==-1 && f<=l)
        {
            m=(f+l)/2;
            if(n[m].equals(s))
                pos=m;
            if(n[m].compareTo(s)<0)
                l=m-1;
            else
                f=m+1;
        }
        if(pos==-1)
            System.out.println("Not in list");
        else
            System.out.println("Name "+n[m]+" Telephone no."+telno[m]);
    }
}
