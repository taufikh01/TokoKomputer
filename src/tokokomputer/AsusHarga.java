/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokomputer;
import java.util.Scanner;
/**
 *
 * @author AD
 */
public class AsusHarga implements TotalKembalian{
    private int Harga;
    private int Bayar;
    private int Kembalian;
    
    public int getHarga() {
		return Harga;
	}

	public void setHarga(int Harga) {
		this.Harga = Harga;
	}
        public int getBayar() {
		return Bayar;
	}

	public void setBayar(int Bayar) {
		this.Bayar = Bayar;
	}
        public int getKembalian() {
		return Bayar;
	}

	public void getKembalian(int Kembalian) {
		this.Bayar = Bayar;
	}

    @Override
    public void JumlahKembalian(){
        Scanner in = new Scanner(System.in);
        Harga = Harga +33399000;
        System.out.print("\nBayar : Rp ");
        Bayar = in.nextInt();
        Kembalian = Bayar - Harga;
        System.out.println("Kembalian : Rp "+ Kembalian);
        
        
    }
}
