package jobsheet15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listMahasiswa {
    List<mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index){
        mahasiswas.remove(index);
    }

    public void update(int index, mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim){
        for(int i = 0; i < mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        int low = 0;
        int high = mahasiswas.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compareResult = mahasiswas.get(mid).nim.compareTo(nim);
            if (compareResult == 0) {
                return mid; 
            } else if (compareResult < 0) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1;
    }





    public static void main(String[] args) {
        listMahasiswa lm = new listMahasiswa();
        mahasiswa m = new mahasiswa("201234", "Noureen", "021xx1");
        mahasiswa m1 = new mahasiswa("201235", "Akhleema", "021xx2");
        mahasiswa m2 = new mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.binarySearch("201235"), new mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println();
        lm.tampil();


    }
}
