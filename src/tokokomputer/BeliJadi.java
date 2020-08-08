package tokokomputer;
import java.util.Scanner;

public class BeliJadi {
    
 
 
    public static void main(String[] arg){
        Menu();
    }
    public static void Menu(){
        Scanner in = new Scanner(System.in);
        JenisKomputer jenisKomputer = new JenisKomputer();
        System.out.print("\n1.");
        jenisKomputer.PredatorJual();
        System.out.print("\n2.");
        jenisKomputer.AsusJual();
        System.out.print("\n3.");
        jenisKomputer.MsiJual();
        System.out.print("\nMasukan Kode : ");
        HargaKomputer hargaKomputer = new HargaKomputer();
        
        
        int menu = in.nextInt();
        switch (menu){
            case 1:
                TotalKembalian komputerPredator = hargaKomputer.getHargaKomputer("predator");
                komputerPredator.JumlahKembalian();
             
                break;
            case 2:
               
                TotalKembalian komputerAsus = hargaKomputer.getHargaKomputer("asus");
                komputerAsus.JumlahKembalian();
                break;
            case 3:
                TotalKembalian komputerMsi = hargaKomputer.getHargaKomputer("msi");
                komputerMsi.JumlahKembalian();
                break;
        }
    }
 
}
