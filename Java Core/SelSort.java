public class SelSort
{
    int n[];
    public SelSort(int n1[])
    {
        n=n1;
    }

    public void selection()
    {
        int temp;
        for(int i=0;i<n.length-1;i++)
        {
            for(int x=i+1;x<n.length;x++)
            {
                if(n[x]>n[i])
                {
                    temp=n[i];
                    n[i]=n[x];
                    n[x]=temp;
                }
            }
        }
        for(int x=0;x<n.length;x++)
        {
            System.out.println(n[x]);
        }
    }
}
