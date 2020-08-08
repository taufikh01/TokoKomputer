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
public abstract class JamKerja {
    abstract void jamIstirahat();
    abstract void jamBuka();
    abstract void jamTutup();
    
    public final void jam(){
        
         jamIstirahat();
         jamBuka();
         jamTutup();
    }
    
}
