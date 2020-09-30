public class CountryBubble
{   String co[];
    String t;
    String ci[];
    String temp;
    public CountryBubble(String country[],String city[])
    {
        co=country;
        ci=city;
    }

    public void sort()
    {
        for(int i=0;i<co.length;i++)
        {
            for(int j=0;j<co.length-1;j++)
            {
                if(co[j].compareTo(co[j+1])>0)
                {
                    temp=co[j];
                    co[j]=co[j+1];
                    co[j+1]=temp;
                    t=ci[j];
                    ci[j]=ci[j+1];
                    ci[j+1]=t;
                }
            }
        }
        System.out.println("Country\tCity");
        for(int i=0;i<co.length;i++)
        {
            System.out.println(co[i]+"\t"+ci[i]); 
        }
    }
}
