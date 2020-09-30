public class count_string2
{
    public void main(String n1)
    {
        String n=n1.trim();
        int dig=0,slet=0,clet=0,alph=0,vow=0,wor=0,spa=0;
        for(int i=0;i<n1.length();i++)
        {
            char ch=n.charAt(i);
            int asc=(int)ch;
            if(asc>=48 && asc<=57)
            dig++;
            if(asc>=65 && asc<=90)
            {
                clet++;
                alph++;
            }
            if(asc>=97 && asc<=122)
            {
                slet++;
                alph++;
            }
            if(ch==' ')
            spa++;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            vow++;
        }
        System.out.println("No. of digits "+dig);
        System.out.println("No. of small letters "+slet);
        System.out.println("No. of capital letters "+clet);
        System.out.println("No. of alphabets "+alph);
        System.out.println("No. of special characters "+(n.length()-(dig+alph+spa)));
        System.out.println("No. of vowels "+vow);
        System.out.println("No. of words "+(spa+1));
    }
}
