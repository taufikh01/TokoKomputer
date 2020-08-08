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
public class Asus implements BeliKomputer{
     @Override
     public void  MerekPc(){
    
       System.out.println("  Merek PC    : PC ASUS ROG GT51CH-ID003T");
   }
     @Override
    public void Processor(){
     
        System.out.println("    Processor   : Intel® Core™ i7-6700K");
    }
     @Override
     public void Ram(){
     
        System.out.println("    RAM         : 64 GB");
     }
     @Override
     public void SSD(){
    
        System.out.println("    SSD         : 512 GB");
     }
     @Override
     public void HDD(){
     
        System.out.println("    HDD         : 2 TB");
     }
     @Override
     public void VGA(){
         
        System.out.println("    VGA         : 2-way Nvidia GeForce TITAN X Dual SLI");
     }
     @Override
     public void OS(){
         
        System.out.println("    OS          : Windows 10 Home - 64bit");
     }
     @Override
     public void Harga(){
         
        System.out.println("    Harga       : Rp 33399000");
     }
    
    
}
