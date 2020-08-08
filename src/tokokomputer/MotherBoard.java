/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokomputer;

/**
 *
 * @author AD
 */
public class MotherBoard {
    private static MotherBoard motherBoard;
    private String Nama;
    private int TotalHarga;
    
    public String getNama() {
		return Nama;
	}

    public void setNama(String Nama) {
		this.Nama = Nama;
	}
    
    public int getTotalHarga() {
		return TotalHarga;
	}

    public void setTotalHarga(int TotalHarga) {
		this.TotalHarga = TotalHarga;
	}
    
    public static synchronized MotherBoard getMotherboard(){
        if(motherBoard==null){
            motherBoard=new MotherBoard();
        }

        return motherBoard;
    }
    
    public void MotherboardAsRock(){
        Nama = "AsRock Z270 Killer SLI/ac";
        TotalHarga = TotalHarga + 2830000;
    }
    public void MotherboardGigabyte(){
        Nama = "Gigabyte Aorus Z270X-Gaming 9";
        TotalHarga = TotalHarga + 8890000;
    }
    public void MotherboardMsi(){
        Nama = "MSI Z270 SLI Plus";
        TotalHarga = TotalHarga + 2850000;
    }
    public void MotherboardAsusRog(){
        Nama = "Asus RoG Maximus IX Hero";
        TotalHarga = TotalHarga + 4250000;
    }
    public void MotherboardAsusPrime(){
        Nama = "Asus Prime Z270-A";
        TotalHarga = TotalHarga + 2830000;
    }
 
    
}
