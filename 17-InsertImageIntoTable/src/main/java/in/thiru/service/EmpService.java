package in.thiru.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepo;

@Service
public class EmpService {

    @Autowired
    private EmployeeRepo repo;

    // This method demonstrates saving an image to the database
    public void saveImage() throws IOException {

        // Step 1: Create a File object representing the image file (hanuma.jpg)
       
        File f = new File("img1.jpg");

        // Step 2: Read the content of the file into a byte array using FileInputStream
        try (FileInputStream fis = new FileInputStream(f)) 
        {

//            // Calculate the length of the file
//            long length = f.length();
//
//            // Create a byte array to store the file data
//            byte[] data = new byte[(int) length];
//
//            // Read the file data into the byte array
//            int bytesRead = fis.read(data);
//
//            // Step 3: Check if the file is completely read
//            if (bytesRead < length) {
//                throw new IOException("Could not completely read file " + f.getName());
//            }

            // Step 4: Create an Employee object and set its properties
            Employee emp = new Employee();
            emp.setEmpImage(fis.readAllBytes()); // Set the byte array containing image data
            emp.setEmpName("viru");
            emp.setEmpSal(2000.00);

            // Step 5: Save the Employee object to the database using Spring Data JPA repository
            repo.save(emp);
        }
    }
}
