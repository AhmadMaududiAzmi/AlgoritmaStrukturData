package praktikum4;
import java.util.Scanner;
public class minMax {
    public int nilai_array;
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       
        minMax [] ppArray = new minMax[5];
        ppArray [0] = new minMax();
        
        for (int i=0; i<5; i++) {
            ppArray [i] = new minMax();
            System.out.println("Nilai array indeks ke-" + i);
            System.out.print("Masukan nilai : ");
            ppArray[i].nilai_array = in.nextInt();
        }
        
        System.out.println("----------------------");
        for(int i=0; i<5; i++) {
            System.out.print(ppArray[i].nilai_array + " ");
        }
        System.out.println("");
        System.out.println("----------------------");
        
        //Brute_Force
        int min = ppArray[0].nilai_array;
        int max = ppArray[0].nilai_array;
        
        for (int i=0; i<5; i++) {
            if (ppArray[i].nilai_array<min) {
                min = ppArray[i].nilai_array;
            } else if (ppArray[i].nilai_array>max) {
                max = ppArray[i].nilai_array;
            }
        }     
        
        System.out.println("Brute Forcee");
        System.out.println("Nilai Minimal: " + min);
        System.out.println("Nilai Maximal: " + max);
        
        //Devide Conquer
        minMax2 mm2 = new minMax2();
        
        int arr[] = new int [5];
        for (int i=0; i<5; i++) {
            arr[i] = ppArray[i].nilai_array;
        }
        Maxmin hasil = new Maxmin();
        mm2.min_max (arr, 0, 4, hasil);
        
        System.out.println("Devide Conquer");
        System.out.println("Nilai Minimal: " + hasil.minimum);
        System.out.println("Nilai Maximal: " + hasil.maximum);
    }
}


