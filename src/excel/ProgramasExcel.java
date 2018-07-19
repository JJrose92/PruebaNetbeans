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
    private static final String VAR_NOMBRE_PELICULA = "Nombre Pelicula";
    private static final String VAR_PELICULA = "Pelicula";
    private static final String VAR_GENERO = "Genero";
    private static final String VAR_DIRECTOR = "Director";
    private static final String VAR_PAIS = "Pais";
    private static final String VAR_PRODUCTOR = "Productor";

    public void comprobarExcel() throws IOException {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            crearExcel();
        }
    }

    public void peliculaExistente(String variable, String decision) throws InvalidFormatException, IOException {
        boolean encontrado = false;
        boolean celda = false;
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        if (!esColumnaVacia(VAR_PELICULA)) {
            Sheet sheet = workbook.getSheet(VAR_PELICULA);
            Iterator<Row> iterator = sheet.iterator();
            int numcelda = 0;
            int fila = 0;
            while (fila <= sheet.getLastRowNum()) {
                Row next = sheet.getRow(fila);
                if (!celda) {
                    Iterator<Cell> cellIterator = next.cellIterator();
                    while (!celda) {
                        Cell next1 = cellIterator.next();
                        celda = next1.getStringCellValue().equalsIgnoreCase(variable);
                        if (!celda) {
                            numcelda++;
                        }
                    }
                }
                encontrado = next.getCell(numcelda).getStringCellValue().equalsIgnoreCase(decision);
                if (encontrado) {
                    removerFilaNombrePelicula(VAR_NOMBRE_PELICULA, sheet.getRow(fila).getCell(0).getStringCellValue());
                    removeRow(sheet, fila);
                }
                fila++;
            }

        }
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
    }

    public void Importar(String ruta) throws InvalidFormatException, IOException {
        FileInputStream fisNew = new FileInputStream(ruta);
        Workbook workbook2 = WorkbookFactory.create(fisNew);
        Iterator<Sheet> sheetIterator = workbook2.sheetIterator();
        while (sheetIterator.hasNext()) {
            Sheet next = sheetIterator.next();
            String sheetName = next.getSheetName();
            if (sheetName.equalsIgnoreCase("Pelicula")) {
                Iterator<Row> iterator = next.iterator();
                iterator.next();
                while (iterator.hasNext()) {
                    Row next1 = iterator.next();
                    ArrayList arrayList = new ArrayList();
                    Iterator<Cell> cellIterator = next1.cellIterator();
                    while (cellIterator.hasNext()) {
                        arrayList.add(cellIterator.next().getStringCellValue());
                    }
                    comprobarColumnaPelicula("Pelicula", arrayList);
                }
            } else {
                Iterator<Row> iterator = next.iterator();
                iterator.next();
                while (iterator.hasNext()) {
                    Row next1 = iterator.next();
                    if (!PerteneceNombreAHoja(sheetName, next1.getCell(0).getStringCellValue())) {
                        comprobarColumna(sheetName, next1.getCell(0).getStringCellValue());
                    }
                }
            }
        }

    }

    public void removeRow(Sheet sheet, int rowIndex) {
        int lastRowNum = sheet.getLastRowNum();
        if (rowIndex >= 0 && rowIndex < lastRowNum) {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
        }
        if (rowIndex == lastRowNum) {
            Row removingRow = sheet.getRow(rowIndex);
            if (removingRow != null) {
                sheet.removeRow(removingRow);
            }
        }
    }

    public void removerFilaNombrePelicula(String hoja, String palabra) throws IOException, InvalidFormatException {
        Sheet sheet = workbook.getSheet(hoja);
        Row actualRow;
        int i = 0;
        boolean borrado = false;
        while (i <= sheet.getLastRowNum() && !borrado) {
            actualRow = sheet.getRow(i);
            borrado = actualRow.getCell(0).toString().equalsIgnoreCase(palabra);
            if (borrado) {
                if (i == sheet.getLastRowNum()) {
                    sheet.removeRow(actualRow);
                } else {
                    sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
                }
                i--;
            }
            i++;
        }
    }

    public void removerFila(String hoja, String palabra) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        removerFilaNombrePelicula(hoja, palabra);
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
    }

    public void EditarPelicula(ArrayList lista, String pelicula) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        Sheet sheet = workbook.getSheet(VAR_PELICULA);
        boolean encontrado = false;
        int i = 0;
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (!encontrado && rowIterator.hasNext()) {
            Row next = rowIterator.next();
            String stringCellValue = next.getCell(0).getStringCellValue();
            encontrado = stringCellValue.equalsIgnoreCase(pelicula);
            if (encontrado) {
                Iterator<Cell> cellIterator = next.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell next1 = cellIterator.next();
                    next1.setCellValue(lista.get(i).toString());
                    i++;
                }
            }
        }
        sheet = workbook.getSheet(VAR_NOMBRE_PELICULA);
        encontrado = false;
        rowIterator = sheet.rowIterator();
        while (!encontrado && rowIterator.hasNext()) {
            Row next = rowIterator.next();
            String stringCellValue = next.getCell(0).getStringCellValue();
            encontrado = stringCellValue.equalsIgnoreCase(pelicula);
            if (encontrado) {
                next.getCell(0).setCellValue(lista.get(0).toString());
            }
        }
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
    }

    public ArrayList datosPelicula(String Pelicula) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        ArrayList arrayList = new ArrayList();
        Sheet sheet = workbook.getSheet(VAR_PELICULA);
        Iterator<Row> iterator = sheet.iterator();
        boolean encontrado = false;
        while (!encontrado && iterator.hasNext()) {
            Row next = iterator.next();
            encontrado = Pelicula.equalsIgnoreCase(next.getCell(0).getStringCellValue());
            if (encontrado) {
                Iterator<Cell> cellIterator = next.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell next1 = cellIterator.next();
                    arrayList.add(next1.getStringCellValue());
                }
            }
        }
        workbook.close();
        return arrayList;
    }

    public ArrayList nombresHojas() throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        ArrayList arrayList = new ArrayList();
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        while (sheetIterator.hasNext()) {
            arrayList.add(sheetIterator.next().getSheetName());
        }
        arrayList.remove(VAR_PELICULA);
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

    public void editarNombre(String hoja, String palabra, String nuevaPalabra) throws IOException, InvalidFormatException {
        FileInputStream fisNew = new FileInputStream(nombreArchivo);
        workbook = WorkbookFactory.create(fisNew);
        Sheet sheet = workbook.getSheet(hoja);
        Iterator<Row> iterator = sheet.iterator();
        boolean encontrado = false;
        while (!encontrado && iterator.hasNext()) {
            Row next = iterator.next();
            String cellFormula = next.getCell(0).getStringCellValue();
            encontrado = cellFormula.equalsIgnoreCase(palabra);
            if (encontrado) {
                next.getCell(0).setCellValue(nuevaPalabra);
            }
        }
        sheet = workbook.getSheet(VAR_PELICULA);

        if (!esColumnaVacia(VAR_PELICULA)) {
            encontrado = false;
            int i = 0;
            int k = 0;
            String sheetName = sheet.getSheetName();
            Iterator<Row> iterator1 = sheet.iterator();
            while (iterator1.hasNext()) {
                Row next = iterator1.next();
                if (k == 0) {
                    Iterator<Cell> cellIterator = next.cellIterator();
                    while (!encontrado && cellIterator.hasNext()) {
                        String cellFormula = cellIterator.next().getStringCellValue();
                        encontrado = cellFormula.equalsIgnoreCase(hoja);
                        if (!encontrado) {
                            i++;
                        }
                    }
                    k++;
                } else {
                    String cellFormula = next.getCell(i).getStringCellValue();
                    encontrado = cellFormula.equalsIgnoreCase(palabra);
                    if (encontrado) {
                        next.getCell(i).setCellValue(nuevaPalabra);
                    }
                }
            }
        }
        FileOutputStream salida = new FileOutputStream(nombreArchivo);
        workbook.write(salida);
        workbook.close();
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
        createCell.setCellValue(VAR_NOMBRE_PELICULA);
        createCell = row.createCell(1);
        createCell.setCellValue(VAR_GENERO);
        createCell = row.createCell(2);
        createCell.setCellValue(VAR_DIRECTOR);
        createCell = row.createCell(3);
        createCell.setCellValue(VAR_PAIS);
        createCell = row.createCell(4);
        createCell.setCellValue(VAR_PRODUCTOR);
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
        boolean encontrado = false;
        while (!encontrado && iterator.hasNext()) {
            Row next = iterator.next();
            fila = next.getRowNum();
            encontrado = next.getCell(0).getStringCellValue().equalsIgnoreCase(lista.get(0).toString());
        }
        if (!encontrado) {
            Row row = sheet.createRow(fila + 1);
            Iterator iterator1 = lista.iterator();
            while (iterator1.hasNext()) {
                createCell = row.createCell(celda);
                Object next = iterator1.next();
                createCell.setCellValue(next.toString());
                celda++;
            }
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
        workbook.createSheet(VAR_NOMBRE_PELICULA);
        workbook.createSheet(VAR_GENERO);
        workbook.createSheet(VAR_DIRECTOR);
        workbook.createSheet(VAR_PAIS);
        workbook.createSheet(VAR_PRODUCTOR);
        workbook.createSheet(VAR_PELICULA);

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

}
