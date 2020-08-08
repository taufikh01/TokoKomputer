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
public class HargaKomputer {
    
    public TotalKembalian getHargaKomputer(String namaKomputer){
		if(namaKomputer.equalsIgnoreCase("asus"))
			return new AsusHarga();
		else if(namaKomputer.equalsIgnoreCase("predator"))
			return new PredatorHarga();
                else if(namaKomputer.equalsIgnoreCase("msi"))
			return new MsiHarga();
		else
			return null;
	}
}
