import java.util.Locale;
import java.util.Scanner;
public class Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();
        Scanner sa = new Scanner(System.in);
        String sta;
        sta = sa.next();
        System.out.println(merge(str,sta));
    }
    public static String merge(String str, String sta)
    {
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < str.length()||i<sta.length(); i++) {
            if(i<str.length())result.append(str.charAt(i));
            if(i<sta.length())result.append(sta.charAt(i));
        }
        return result.toString();
    }
}

