/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




/**
 *
 * @author Juan
 */
public class ProgramasExcel {
    
        private static final Logger LOGGER = Logger.getLogger("newexcel.ExcelOOXML");
    
    public static void main(String[] args) {
        
        comprobarExcel();

        
        
    }  
    
    public static void comprobarExcel(){
        File ex = new File("reporte.xlsx");
        if (!ex.exists()){
            crearExcel();
        }
    }
    
    public static void crearExcel(){
        
      File archivo = new File("reporte.xlsx");
        
        // Creamos el libro de trabajo de Excel formato OOXML
        Workbook workbook = new XSSFWorkbook(); 
        
        // La hoja donde pondremos los datos
        try {
            // Creamos el flujo de salida de datos,
            // apuntando al archivo donde queremos 
            // almacenar el libro de Excel
            FileOutputStream salida = new FileOutputStream(archivo);
            
            // Almacenamos el libro de 
            // Excel via ese 
            // flujo de datos
            workbook.write(salida);
            
            // Cerramos el libro para concluir operaciones
            workbook.close();
            
            LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}", archivo.getAbsolutePath());
            
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, "Archivo no localizable en sistema de archivos");
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Error de entrada/salida");
        }
    }
}