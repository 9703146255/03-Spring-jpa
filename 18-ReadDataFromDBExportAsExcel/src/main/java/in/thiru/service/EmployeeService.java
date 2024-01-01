package in.thiru.service;

import java.io.FileOutputStream;

import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	public void exportEmployeesToExcel() throws IOException {
		List<Employee> employees = repo.findAll();

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Employee Data");

		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("ID");
		headerRow.createCell(1).setCellValue("First Name");
		headerRow.createCell(2).setCellValue("Last Name");
		headerRow.createCell(3).setCellValue("Email");
		headerRow.createCell(4).setCellValue("Salary");

		int rowNum = 1;
		for (Employee employee : employees) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(employee.getId());
			row.createCell(1).setCellValue(employee.getFirstName());
			row.createCell(2).setCellValue(employee.getLastName());
			row.createCell(3).setCellValue(employee.getEmail());
			row.createCell(4).setCellValue(employee.getSalary());
		}

		FileOutputStream fos = new FileOutputStream("D:\\xl\\Employee.xlsx");

		workbook.write(fos);

		workbook.close();
		fos.close();

	}
}
