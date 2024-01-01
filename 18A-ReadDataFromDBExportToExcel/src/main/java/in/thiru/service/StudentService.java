package in.thiru.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import in.thiru.entity.Student;
import in.thiru.repo.StudentRepo;

@Service
public class StudentService {

	private StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {

		this.studentRepo = studentRepo;
	}

	@SuppressWarnings("resource")
	public void exportDataFromDBToExcel() throws Exception {

		List<Student> students = studentRepo.findAll();

		XSSFWorkbook workBook = new XSSFWorkbook();

		XSSFSheet sheet = workBook.createSheet("FIRST SHEET");

		/*
		 * private Integer studentId; private String studentName; private Double
		 * studentFee; private String studentEmail; private Long studentMobile;
		 */
		XSSFRow headerRow = sheet.createRow(0);
		
		
		
		headerRow.createCell(0).setCellValue("studentId");
		headerRow.createCell(1).setCellValue("studentName");
		headerRow.createCell(2).setCellValue("studentFee");
		headerRow.createCell(3).setCellValue("studentEmail");
		headerRow.createCell(4).setCellValue("studentMobile");

		int rowNum = 12;

		for (Student student : students) {

			XSSFRow row = sheet.createRow(rowNum++);
			
			
			
			
			row.createCell(0).setCellValue(student.getStudentId());
			row.createCell(1).setCellValue(student.getStudentName());
			row.createCell(2).setCellValue(student.getStudentFee());
			row.createCell(3).setCellValue(student.getStudentEmail());
			row.createCell(4).setCellValue(student.getStudentMobile());
		}

		FileOutputStream fos = new FileOutputStream("D:\\xl\\Employee.xlsx");

		workBook.write(fos);

		workBook.close();
		fos.close();

	}

}
