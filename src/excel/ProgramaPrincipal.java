/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


/**
 *
 * @author Juan
 */
public class ProgramaPrincipal {
    
        public static void main(String[] args) throws IOException, InvalidFormatException {
        
        ProgramasExcel pex = new ProgramasExcel();
            

        pex.datosPelicula("Liliana te quiero mucho");
        
        
    }  
    
    
}
