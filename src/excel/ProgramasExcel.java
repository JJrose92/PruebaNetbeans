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
import java.util.ArrayList;
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

    public ArrayList nombresHojas() throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        ArrayList arrayList = new ArrayList();
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        while (sheetIterator.hasNext()) {
            arrayList.add(sheetIterator.next().getSheetName());
        }
        arrayList.remove("Pelicula");
        return arrayList;
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

    }

    public void comprobarColumnaPelicula(String hoja, ArrayList lista) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        if (esColumnaVacia(hoja)) {
            crearColumnaPelicula(hoja, lista);
        } else {
            anadirPelicula(hoja, lista);
        }
    }

    public void crearColumnaPelicula(String hoja, ArrayList lista) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        Sheet sheet = workbook.getSheet(hoja);
        Cell createCell;
        int fila = 0;
        int celda = 0;
        Row row = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        createCell = row.createCell(0);
        createCell.setCellValue("Nombre Pelicula");
        createCell = row.createCell(1);
        createCell.setCellValue("Genero");
        createCell = row.createCell(2);
        createCell.setCellValue("Director");
        createCell = row.createCell(3);
        createCell.setCellValue("Pais");
        createCell = row.createCell(4);
        createCell.setCellValue("Productor");
        createCell = row.createCell(5);
        createCell.setCellValue("Año");
        createCell = row.createCell(6);
        createCell.setCellValue("Nota");

        Iterator iterator1 = lista.iterator();
        while (iterator1.hasNext()) {
            createCell = row1.createCell(celda);
            Object next = iterator1.next();
            createCell.setCellValue(next.toString());
            celda++;
        }
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
    }

    public void anadirPelicula(String hoja, ArrayList lista) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        Sheet sheet = workbook.getSheet(hoja);
        Cell createCell;
        int fila = 0;
        int celda = 0;
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            fila = iterator.next().getRowNum();
        }
        Row row = sheet.createRow(fila + 1);
        Iterator iterator1 = lista.iterator();
        while (iterator1.hasNext()) {
            createCell = row.createCell(celda);
            Object next = iterator1.next();
            createCell.setCellValue(next.toString());
            celda++;
        }
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
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
        workbook.createSheet("Nombre Pelicula");
        workbook.createSheet("Genero");
        workbook.createSheet("Director");
        workbook.createSheet("Pais");
        workbook.createSheet("Productor");
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
