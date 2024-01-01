package in.thiru.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepo;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	@Autowired
	private DataSource ds;

	public void callEmpProcedure() {

		empRepo.callEmployeeProcedure();
	}

	public void callingSp() throws Exception {

		Connection con = ds.getConnection();

		CallableStatement call = con.prepareCall("call employee_procedure1()");
		ResultSet rst = call.executeQuery();

		while (rst.next()) {
			System.out.println(rst.getString(1));
		}

	}
}
