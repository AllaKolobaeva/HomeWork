
import java.util.Scanner;
public class Wounderfulfield {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a = -1;
StringBuffer s1 = new StringBuffer("itis");
StringBuffer s2 = new StringBuffer("xxxx");
System.out.println(s2);
    while (s2.substring(0, 4).equals("itis")!=true){
    String s = in.nextLine();
    for (int i = 0; i < 3; i++) {
        a = s1.indexOf(s,i);
            if (a >= 0) {
                s2.replace(a, a + 1, s);            
                            a = -1;
}
}
System.out.println(s2);
}
}
}
