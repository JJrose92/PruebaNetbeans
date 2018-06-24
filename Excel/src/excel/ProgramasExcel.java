/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import java.io.File;
import java.io.FileInputStream;
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
    private String nombreArchivo = "reporte.xlsx";

    public void comprobarExcel() throws IOException {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            crearExcel();
        }
    }

    public void CrearHoja(String hoja, String nombre) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        if (comprobarHoja(hoja)) {
            if (!esColumnaVacia(hoja)) {
                anadirValorColumna(hoja, nombre);
                FileOutputStream salida = new FileOutputStream(nombreArchivo);
                workbook.write(salida);
                workbook.close();
            } else {

                crearColumna(hoja, nombre);
                FileOutputStream salida = new FileOutputStream(nombreArchivo);
                workbook.write(salida);
                workbook.close();

            }

        } else {
            workbook.createSheet(hoja);
            anadirValorColumna(hoja, nombre);
            crearColumna(hoja, nombre);
            FileOutputStream salida = new FileOutputStream(nombreArchivo);
            workbook.write(salida);
            workbook.close();
        }
    }

    public void anadirValorColumna(String hoja, String nombre) throws FileNotFoundException, IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        Sheet sheet = workbook.getSheet(hoja);
        int fila = 0;
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            fila = iterator.next().getRowNum();
        }
        Row row = sheet.createRow(fila + 1);
        Cell createCell = row.createCell(0);
        createCell.setCellValue(nombre);
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
    }

    public void crearColumna(String hoja, String nombre) throws FileNotFoundException, IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        Cell titulo = row.createCell(0);
        Cell palabra = row1.createCell(0);
        titulo.setCellValue(hoja);
        palabra.setCellValue(nombre);
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
    }

    public boolean comprobarHoja(String hoja) {
        int sheetIndex = workbook.getSheetIndex(hoja);
        return sheetIndex != -1;
        /*while ((sheetIterator.hasNext()) && !(encontrado)) {
            Sheet next = sheetIterator.next();
            String sheetName = next.getSheetName();
            encontrado = sheetName.equalsIgnoreCase(hoja);
        }
         */

    }

    public boolean PerteneceNombreAHoja(String hoja, String nombre) throws FileNotFoundException, IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        Sheet sheet = workbook.getSheet(hoja);
        boolean encontrado = false;
        Iterator<Row> iterator = sheet.iterator();
        while (!encontrado && iterator.hasNext()) {
            Cell cell = iterator.next().getCell(0);
            String stringCellValue = cell.getStringCellValue();
            encontrado = stringCellValue.equalsIgnoreCase(nombre);
        }

        return encontrado;
    }

    public boolean esColumnaVacia(String hoja) {

        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.getRow(0);
        return row == null;

    }

    public void comprobarColumna(String hoja, String Nombre) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        if (esColumnaVacia(hoja)) {
            crearColumna(hoja, Nombre);
        } else {
            anadirValorColumna(hoja, Nombre);
        }
    }

    public String[] devolverNombres(String hoja) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        String name[] = null;
        int x = 0;
        if (comprobarHoja(hoja)) {
            if (!esColumnaVacia(hoja)) {
                Sheet sheet = workbook.getSheet(hoja);
                Iterator<Row> rowIterator = sheet.rowIterator();
                int lastRowNum = sheet.getLastRowNum();
                name = new String[lastRowNum];
                rowIterator.next();
                while (rowIterator.hasNext()) {
                    Cell cell = rowIterator.next().getCell(0);
                    String stringCellValue = cell.getStringCellValue();
                    name[x] = stringCellValue;
                    x++;
                }

                return name;
            }
            return name;
        }
        return name;
    }

    public void crearExcel() throws FileNotFoundException, IOException {

        // Creamos el libro de trabajo de Excel formato OOXML
        workbook.createSheet("Productor");
        workbook.createSheet("Director");
        workbook.createSheet("Guionista");
        workbook.createSheet("Pais");
        workbook.createSheet("Genero");
        workbook.createSheet("Pelicula");

        // La hoja donde pondremos los datos
        try {
            // Creamos el flujo de salida de datos,
            // apuntando al archivo donde queremos 
            // almacenar el libro de Excel
            FileOutputStream salida = new FileOutputStream(nombreArchivo);

            // Almacenamos el libro de 
            // Excel via ese 
            // flujo de datos
            workbook.write(salida);
            workbook.close();
            // Cerramos el libro para concluir operaciones

            LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}");

        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, "Archivo no localizable en sistema de archivos");
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Error de entrada/salida");
        }
    }

    public void anadirHoja(String lista) throws FileNotFoundException, IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        workbook.createSheet(lista);
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
    }
}
