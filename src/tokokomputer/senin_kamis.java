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
public class senin_kamis extends JamKerja{
    
     @Override
     void jamIstirahat(){
         System.out.println("Pada Jam : 12.00 - 13.00");
     }
     @Override
     void jamBuka(){
         System.out.println("Pada Jam : 07.00");
     }
     @Override
    void jamTutup(){
        System.out.println("Pada Jam : 22.00");
         
     }
}
