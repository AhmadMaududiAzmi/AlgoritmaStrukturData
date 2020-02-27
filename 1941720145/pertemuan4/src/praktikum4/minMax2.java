package praktikum4;
public class minMax2 {
    
    //Devide Conquer
    public static void min_max(int [] arr, int indeks_awal, int indeks_akhir, Maxmin hasil) {
        
        int indeks_tengah;
        Maxmin hasil1 = new Maxmin();
        Maxmin hasil2 = new Maxmin();
        
        if (indeks_awal == indeks_akhir) {
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        } else if (indeks_akhir - indeks_awal == 1) {
            if (arr[indeks_awal]>arr[indeks_akhir]) {
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            } else {
                hasil.minimum = arr[indeks_awal];
                hasil.maximum = arr[indeks_akhir];
            }
        } else {
            indeks_tengah = (indeks_awal + indeks_akhir)/2;
            min_max(arr, indeks_awal, indeks_tengah, hasil1);
            min_max(arr, indeks_tengah+1, indeks_akhir, hasil2);
            
            hasil.minimum = (hasil1.minimum<hasil2.minimum ? hasil1.minimum : hasil2.minimum);
            hasil.maximum = (hasil1.maximum>hasil2.maximum ? hasil1.maximum : hasil2.maximum);
        }
    }
}

class Maxmin {
    public int maximum;
    public int minimum;
}

