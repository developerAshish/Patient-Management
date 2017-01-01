/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eprdoc;

import com.main.controller.ApplicationManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ashish
 */
public class EPRDOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            new ApplicationManager().start();
        } catch (Exception ex) {
            Logger.getLogger(EPRDOC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
