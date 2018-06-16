/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import static excel.ProgramasExcel.*;
import java.io.IOException;

/**
 *
 * @author Juan
 */
public class ProgramaPrincipal {
    
        public static void main(String[] args) throws IOException {
        
        ProgramasExcel pex = new ProgramasExcel();
        pex.comprobarExcel();
        pex.CrearHoja("Productor", "Dicaprio");
        
        
    }  
    
    
}
