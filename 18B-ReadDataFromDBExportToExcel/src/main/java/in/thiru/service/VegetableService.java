package in.thiru.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Vegetables;
import in.thiru.repo.VegetableRepo;

@Service
public class VegetableService {

	@Autowired
	private VegetableRepo vegRepo;

	public void exportDataFromDBToExcel() throws Exception {
		List<Vegetables> vegetables = vegRepo.findAll();

		XSSFWorkbook workBook = new XSSFWorkbook();

		XSSFSheet sheet = workBook.createSheet("FIRST-SHEET");

		/*
		 * private Integer vegetableId; private String vegetableName; private String
		 * vegetableLoc; private Double vagetablePrice;
		 */
		XSSFRow headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("vegetableId");
		headerRow.createCell(1).setCellValue("vegetableName");
		headerRow.createCell(2).setCellValue("vegetableLoc");
		headerRow.createCell(3).setCellValue("vagetablePrice");

		int rowNum = 1;

		for (Vegetables vegetable : vegetables) {
			XSSFRow bottomRow = sheet.createRow(rowNum++);
			bottomRow.createCell(0).setCellValue(vegetable.getVegetableId());
			bottomRow.createCell(1).setCellValue(vegetable.getVegetableName());
			bottomRow.createCell(2).setCellValue(vegetable.getVegetableLoc());
			bottomRow.createCell(3).setCellValue(vegetable.getVagetablePrice());
		}

		FileOutputStream fos = new FileOutputStream("D:\\xl\\vegetables\\veg.xlsx");

		workBook.write(fos);

		fos.close();

	}

	public void importDataFromExcel() {
		try (FileInputStream fileInputStream = new FileInputStream("D:\\\\xl\\\\vegetables\\\\veg.xlsx");
				Workbook workbook = new XSSFWorkbook(fileInputStream)) {

			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			List<Vegetables> entities = new ArrayList<>();

			// Skip the header row
			if (rowIterator.hasNext()) {
				rowIterator.next();
			}

			while (rowIterator.hasNext()) {
			    Row row = rowIterator.next();

			    String vegetableId = getStringValue(row.getCell(0));
			    String vegetableName = getStringValue(row.getCell(1));
			    String vegetableLoc = getStringValue(row.getCell(2));
			    String vagetablePrice = getStringValue(row.getCell(3));

			    Vegetables entity = new Vegetables();

			    // Parse vegetableId as Double and then convert to Integer
			    entity.setVegetableId((int) Double.parseDouble(vegetableId));

			    entity.setVegetableName(vegetableName);
			    entity.setVegetableLoc(vegetableLoc);
			    entity.setVagetablePrice(Double.parseDouble(vagetablePrice));

			    entities.add(entity);
			}

			// Save all entities to the database
			vegRepo.saveAll(entities);

		} catch (IOException e) {
			// Handle exception
			e.printStackTrace();
		}
	}

	private String getStringValue(Cell cell) {
		if (cell != null) {
			switch (cell.getCellType()) {
			case STRING:
				return cell.getStringCellValue().trim();
			case NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
			// Handle other cell types if needed
			}
		}
		return "";
	}

}
