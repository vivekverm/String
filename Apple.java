import java.util.Scanner;
public class Apple
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str;
        str=s.next();
        for(int i=0;i<4;i++)
        {
        System.out.print(str.substring(0,2));
        }
     }
}
