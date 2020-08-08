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
public class Msi implements BeliKomputer{
    
    @Override
     public void  MerekPc(){
    
       System.out.println("  Merek PC    : MSI Vortex G25VR-8RD");
   }
    @Override
    public void Processor(){
     
        System.out.println("    Processor   : Core i9 Extreme Edition 18-core");
    }
    @Override
     public void Ram(){
     
         System.out.println("    RAM         : 16 GB");
     }
    @Override
     public void SSD(){
    
         System.out.println("    SSD         : 512 GB");
     }
    @Override
     public void HDD(){
     
         System.out.println("    HDD         : 1 TB");    
     }
     @Override
     public void VGA(){
         
        System.out.println("    VGA         : Nvidia GeForce GTX 1060");
     }
     @Override
     public void OS(){
         
        System.out.println("    OS          : Windows 10 Home - 64bit");
     }
     @Override
     public void Harga(){
         
        System.out.println("    Harga       : Rp 34999000");
     }
     
       
    
}
