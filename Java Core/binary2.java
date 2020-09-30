class binary2
{
    public void search(int s)
    {
        int n[]=new int[10];
        int f=0;
        int l=n.length-1;
        int pos=-1;
        int m=0;
        for(int i=0;i<n.length;i++)
        {
            n[i]=i+1;
        }
        while(pos==-1 && f<=l)
        {
            m=(f+l)/2;
            if(n[m]==s)
                pos=m;
            if(n[m]>s)
                l=m-1;
            else
                f=m+1;
        }
        if(pos==-1)
            System.out.println("Not in list");
        else
            System.out.println("Present in list at "+(pos+1));
    }
}