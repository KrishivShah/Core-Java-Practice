public class BubbleSort
{
    int a[];
    int temp;
    public BubbleSort(int a1[])
    {
        a=a1;
    }

    public int[] sort()
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
