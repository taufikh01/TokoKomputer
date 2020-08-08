package tokokomputer;
import java.util.Scanner;

public class TokoKomputer {
   
    public static void main(String[] args) {
        BeliJadi BeliJadi = new BeliJadi();
        RakitPC RakitPC = new RakitPC();
        Scanner in = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI TOKO KOMPUTER");
        System.out.println("1. Beli Jadi\t\t2. Rakit PC\t\t3. Jadwal Buka");
        System.out.print("Masukan Kode : ");
        int menu = in.nextInt();
        switch (menu){
            case 1:
                BeliJadi.Menu();
                break;
            case 2:
                RakitPC.Menu();
                break;
            case 3:
                JadwalBuka.Menu();
            break;
        }
    }
    
}
