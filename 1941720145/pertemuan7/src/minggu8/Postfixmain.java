package minggu8;
import java.util.Scanner;
public class Postfixmain {
    public static void main (String args[]) {
        Scanner gg = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukan Ekspresi Matematika: ");
        Q = gg.nextLine();
        Q = Q.trim();
        Q = Q + ")";
    
        int total = Q.length();
        
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
