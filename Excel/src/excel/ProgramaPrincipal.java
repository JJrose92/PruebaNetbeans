/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import static excel.ProgramasExcel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Juan
 */
public class ProgramaPrincipal {
    
        public static void main(String[] args) throws IOException, InvalidFormatException {
        
        ProgramasExcel pex = new ProgramasExcel();
            

        pex.comprobarExcel();
            String[] devolverNombres = pex.devolverNombres("Productor");
        pex.PerteneceNombreAHoja("Productor", "Spielberg");
        //pex.CrearHoja("Productor", "Dicaprio");
        //pex.comprobarColumna("Productor", "Spielberg");
        
        
    }  
    
    
}
