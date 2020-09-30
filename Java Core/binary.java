public class binary
{
    public boolean search(int n[],int s)
    {
        int f=0;
        int l=n.length-1;
        int m=0;
        boolean flag=false;
        int index=-1;
        do
        {
            m=(f+l)/2;
            if(n[m]<s)
                f=m+1;
            else if(n[m]>s)
                l=m-1;
            else
            {
                flag=true;
                index=m;
                break;
            }
        }while(f<=l);
        return flag;

    }
}
