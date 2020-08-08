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
public class JadwalBuka {
     public static void main(String[] arg){
        Menu();
    }
       public static void Menu(){
           JamKerja jamKerja = new senin_kamis();
           jamKerja.jam();
           
           System.out.println();
           jamKerja = new jumat_minggu();
           jamKerja.jam();
       }
}
