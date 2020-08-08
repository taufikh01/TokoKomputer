package tokokomputer;

import java.util.Scanner;

public class RakitPC {

    private static int TotalHarga;
    private static String Motherboard;
    private static String Processor;
    private static String RandomAccessMemory;
    private static String GraphicCard;
    private static String CasingPC;
    private static int Bayar;

    public static void main(String[] arg) {
        Menu();
    }

    public static void Menu() {
        Komponen[] motherBoard = new Komponen[5];
        motherBoard[0] = new Komponen.Builder().setKode(1).setNama("AsRock Z270 Killer SLI/ac")
        .setJenis("MotherBoard").setHarga(2830000).build();
        motherBoard[1] = new Komponen.Builder().setKode(2).setNama("Gigabyte Aorus Z270X-Gaming 9")
        .setJenis("MotherBoard").setHarga(8890000).build();
        motherBoard[2] = new Komponen.Builder().setKode(3).setNama("MSI Z270 SLI Plus")
        .setJenis("MotherBoard").setHarga(2850000).build();
        motherBoard[3] = new Komponen.Builder().setKode(4).setNama("Asus RoG Maximus IX Hero")
        .setJenis("MotherBoard").setHarga(4250000).build();
        motherBoard[4] = new Komponen.Builder().setKode(5).setNama("Asus Prime Z270-A")
        .setJenis("MotherBoard").setHarga(3100000).build();
        
        Komponen[] ram = new Komponen[3];
        ram[0] = new Komponen.Builder().setKode(1).setNama("KINGSTON Memory PC 2 x 8GB DDR4 PC")
        .setJenis("ram").setHarga(2830000).build();
        ram[1] = new Komponen.Builder().setKode(2).setNama("Gigabyte Aorus Z270X-Gaming 9")
        .setJenis("ram").setHarga(5825000).build();
        ram[2] = new Komponen.Builder().setKode(3).setNama("MSI Z270 SLI Plus")
        .setJenis("ram").setHarga(2830000).build();
        
        Komponen[] vga = new Komponen[3];
        vga[0] = new Komponen.Builder().setKode(1).setNama("NVIDIA TITAN Xp")
        .setJenis("vga").setHarga(2830000).build();
        vga[1] = new Komponen.Builder().setKode(2).setNama("NVIDIA GeForce GTX 1080 Ti")
        .setJenis("vga").setHarga(8890000).build();
        vga[2] = new Komponen.Builder().setKode(3).setNama("NVIDIA GeForce GTX 1070")
        .setJenis("vga").setHarga(2850000).build();
        
        Komponen[] casingpc = new Komponen[3];
        casingpc[0] = new Komponen.Builder().setKode(1).setNama("Armaggeddon M1X")
        .setJenis("casing").setHarga(300000).build();
        casingpc[1] = new Komponen.Builder().setKode(2).setNama("Armaggeddon M1G")
        .setJenis("casing").setHarga(325000).build();
        casingpc[2] = new Komponen.Builder().setKode(3).setNama("Gaming VenomRX Bravos")
        .setJenis("casing").setHarga(33000).build();
        Scanner in = new Scanner(System.in);
        // Motherboard
        System.out.println(" ");
        System.out.println("-MotherBoard :");
        for (int i = 0; i < motherBoard.length; i++) {
            System.out.println("\t"+motherBoard[i].getKode()+". "+motherBoard[i].getNama() +"  Rp. "+motherBoard[i].getHarga());
        }

        System.out.print("Masukan Kode : ");
        int MotherBoard = in.nextInt();

        switch (MotherBoard) {
            
            case 1:
                Motherboard = "AsRock Z270 Killer SLI/ac";
                TotalHarga = TotalHarga + 2830000;
                break;
            case 2:
                Motherboard = "Gigabyte Aorus Z270X-Gaming 9";
                TotalHarga = TotalHarga + 8890000;
                break;
            case 3:
                Motherboard = "MSI Z270 SLI Plus";
                TotalHarga = TotalHarga + 2850000;
                break;
            case 4:
                Motherboard = "Asus RoG Maximus IX Hero";
                TotalHarga = TotalHarga + 4250000;
                break;
            case 5:
                Motherboard = "Asus Prime Z270-A";
                TotalHarga = TotalHarga + 2830000;
                break;
            default:
                break;
        }

         // RAM
         System.out.println(" ");
         System.out.println("-RAM :");
         for (int i = 0; i < ram.length; i++) {
             System.out.println("\t"+ram[i].getKode()+". "+ram[i].getNama() +"  Rp. "+ram[i].getHarga());
         }
 
        System.out.print("Masukan Kode : ");
        int RAM = in.nextInt();
        switch (RAM) {
            case 1:
                RandomAccessMemory = "KINGSTON Memory PC 2 x 8GB DDR4 PC";
                TotalHarga = TotalHarga + 1435000;
                break;
            case 2:
                RandomAccessMemory = "Gigabyte Aorus Z270X-Gaming 9";
                TotalHarga = TotalHarga + 2840000;
                break;
            case 3:
                RandomAccessMemory = "MSI Z270 SLI Plus";
                TotalHarga = TotalHarga + 5858000;
                break;
            default:
                break;
        }

         // vga
         System.out.println(" ");
         System.out.println("-VGA :");
         for (int i = 0; i < vga.length; i++) {
             System.out.println("\t"+vga[i].getKode()+". "+vga[i].getNama() +"  Rp. "+vga[i].getHarga());
         }
 
        System.out.print("Masukan Kode : ");
        int VGA = in.nextInt();
        switch (VGA) {
            case 1:
                GraphicCard = "NVIDIA TITAN Xp";
                TotalHarga = TotalHarga + 21758000;
                break;
            case 2:
                GraphicCard = "NVIDIA GeForce GTX 1080 Ti";
                TotalHarga = TotalHarga + 12750000;
                break;
            case 3:
                GraphicCard = "NVIDIA GeForce GTX 1070";
                TotalHarga = TotalHarga + 7935000;
                break;
            default:
                break;
        }



         // Casing PC
         System.out.println(" ");
         System.out.println("-Casing PC :");
         for (int i = 0; i < casingpc.length; i++) {
             System.out.println("\t"+casingpc[i].getKode()+". "+casingpc[i].getNama() +"  Rp. "+casingpc[i].getHarga());
         }
 
        System.out.print("Masukan Kode : ");
        int casing = in.nextInt();
        switch (casing) {
            case 1:
                CasingPC = "Armaggeddon M1X";
                TotalHarga = TotalHarga + 300000;
                break;
            case 2:
                CasingPC = "Armaggeddon M1G";
                TotalHarga = TotalHarga + 325000;
                break;
            case 3:
                CasingPC = "Gaming VenomRX Bravos";
                TotalHarga = TotalHarga + 33000;
                break;
            default:
                break;
        }
        Tampilan_Data();
        System.out.print("\nBayar : Rp ");
        Bayar = in.nextInt();
        System.out.println("Kembalian : Rp " + (Bayar - TotalHarga));

    }

    public static void Tampilan_Data() {
        System.out.println("\n========================= DATA  PC ===========================");
        System.out.println("Motherboard             : " + Motherboard);
        System.out.println("Processor               : " + Processor);
        System.out.println("Random Access Memory    : " + RandomAccessMemory);
        System.out.println("VGA                     : " + GraphicCard);
        System.out.println("Casing PC               : " + CasingPC);
        System.out.println("Total                   : Rp " + TotalHarga);
    }
}