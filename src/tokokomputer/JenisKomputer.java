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
public class JenisKomputer {
    private Predator predator;
    private Asus asus;
    private Msi msi;
    
    public JenisKomputer(){
     predator = new Predator();
     asus = new Asus();
     msi = new Msi();
}
    public void PredatorJual(){
        predator.MerekPc();
        predator.Processor();
        predator.Ram();
        predator.SSD();
        predator.HDD();
        predator.VGA();
        predator.OS();
        predator.Harga();
    }
    public void AsusJual(){
        asus.MerekPc();
        asus.Processor();
        asus.Ram();
        asus.SSD();
        asus.HDD();
        asus.VGA();
        asus.OS();
        asus.Harga();
    }
    public void MsiJual(){
        msi.MerekPc();
        msi.Processor();
        msi.Ram();
        msi.SSD();
        msi.HDD();
        msi.VGA();
        msi.OS();
        msi.Harga();
    }
    
}
