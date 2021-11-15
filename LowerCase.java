import java.util.Locale;
import java.util.Scanner;
public class AddString {
    String a;
    String b;
    AddString(String a,String b)
    {
        this.a=a;
        this.b=b;
        Scanner s=new Scanner(System.in);
        a=s.next();
        b=s.next();
        System.out.println(a.toLowerCase()+b.toLowerCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        AddString obj=new AddString("thk","ijk");
    }
}
