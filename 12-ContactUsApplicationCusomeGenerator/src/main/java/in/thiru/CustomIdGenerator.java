package in.thiru;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator
{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	
	
}
