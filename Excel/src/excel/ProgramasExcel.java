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
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Juan
 */
public class ProgramasExcel {

    private static final Logger LOGGER = Logger.getLogger("newexcel.ExcelOOXML");
    private Workbook workbook = new XSSFWorkbook();
    private File archivo = new File("reporte.xlsx");

    public void comprobarExcel() {
        if (!archivo.exists()) {
            crearExcel();
        }
    }

    public void CrearHoja(String hoja, String nombre) throws IOException, InvalidFormatException {
        
        workbook = WorkbookFactory.create(archivo);
        if (comprobarHoja(hoja)) {
            if (!comprobarColumna(hoja)) {
                anadirValorColumna(hoja, nombre);
            FileOutputStream salida = new FileOutputStream(archivo);
            workbook.write(salida);
            workbook.close();
            } else {

 
            crearColumna(hoja, nombre);
            FileOutputStream salida = new FileOutputStream(archivo);
            workbook.write(salida);
            workbook.close();

            }

        }else {
            workbook.createSheet(hoja);
            anadirValorColumna(hoja, nombre);
            crearColumna(hoja, nombre);
            FileOutputStream salida = new FileOutputStream(archivo);
            workbook.write(salida);
            workbook.close();
        }
    }

    public void anadirValorColumna(String hoja, String nombre) {
        XSSFSheet sheet = (XSSFSheet) workbook.getSheet(hoja);
        Row row = sheet.getRow(0);
        short lastCellNum = row.getLastCellNum();
        Cell createCell = row.createCell(lastCellNum + 1);
        createCell.setCellValue(nombre);
    }

    public void crearColumna(String hoja, String nombre) {
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.createRow(0);
        Cell titulo = row.createCell(0);
        Cell palabra = row.createCell(1);
        titulo.setCellValue(hoja);
        palabra.setCellValue(nombre);

    }

    public boolean comprobarHoja(String hoja) {
        int numberOfSheets = workbook.getNumberOfSheets();
        
        int sheetIndex = workbook.getSheetIndex(hoja);
        int sheetIndex2 = workbook.getSheetIndex("Carlos");
        Boolean encontrado = false;
        /*while ((sheetIterator.hasNext()) && !(encontrado)) {
            Sheet next = sheetIterator.next();
            String sheetName = next.getSheetName();
            encontrado = sheetName.equalsIgnoreCase(hoja);
        }
*/ 
        encontrado = sheetIndex != -1;
        return encontrado;
    }

    public boolean comprobarColumna(String hoja) {
        Sheet sheet = workbook.getSheet(hoja);
        short height = sheet.getRow(0).getHeight();
        return height == 0;
    }

    
    public void crearExcel() {


        // Creamos el libro de trabajo de Excel formato OOXML
        workbook.createSheet("Productor");
        workbook.createSheet("Director");
        workbook.createSheet("Guionista");
        
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
            workbook.close();
            // Cerramos el libro para concluir operaciones
            

            LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}", archivo.getAbsolutePath());

        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, "Archivo no localizable en sistema de archivos");
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Error de entrada/salida");
        }
    }
}
