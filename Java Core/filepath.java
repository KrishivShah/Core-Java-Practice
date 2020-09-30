import java.util.*;
public class filepath
{
   public void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter file path");
       String file=sc.nextLine();
       int li=file.lastIndexOf("\\");
       String path=file.substring(0,li);
       String name=file.substring(li+1);
       String filename=name.substring(0,name.indexOf("."));
       String ext=name.substring(name.indexOf(".")+1);
       System.out.println("Path:"+ path);
       System.out.println("Name:"+ filename);
       System.out.println("Extension:"+ ext);
   }
}
