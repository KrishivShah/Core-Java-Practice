public class autotristring
{
    public void main(int n)
    {
        int sq=n*n;
        int cu=n*n*n;
        String n1=Integer.toString(n);
        String sq1=Integer.toString(sq);
        String cu1=Integer.toString(cu);
        if(sq1.endsWith(n1))
        System.out.println("Automorphic number");
        if(cu1.endsWith(n1))
        System.out.println("Trimorphic number");
        else
        System.out.println("Neither Automorphic number nor Trimorphic number");
    }
}
