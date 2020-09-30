public class MarksBubble
{
    String n[];
    String t;
    int m[];
    int temp;
    public MarksBubble(String n1[],int m1[])
    {
        n=n1;
        m=m1;
    }

    public void sort()
    {
        for(int i=0;i<m.length-1;i++)
        {
            for(int j=0;j<m.length-1;j++)
            {
                if(m[i]<m[j+1])
                {
                    temp=m[j];
                    m[j]=m[j+1];
                    m[j+1]=temp;
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
            }
        }
        System.out.println("Name\tMarks");
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]+"\t"+m[i]); 
        }
    }
}
