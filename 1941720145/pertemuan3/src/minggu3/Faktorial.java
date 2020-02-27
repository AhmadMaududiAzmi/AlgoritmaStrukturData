package minggu3;

public class Faktorial {
    public int nilai;
    
    public int faktorialBF(int n) {
        int fakto = 1, i = 1;
//        for(int i=1; i<=n; i++) {
//            fakto = fakto*i;
//        }
//        return fakto;
        do {
            fakto = fakto*i;
            i++;
        } while (i<n);
        return fakto = fakto*i;
    }
    
    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        } else {
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }
    }
}
