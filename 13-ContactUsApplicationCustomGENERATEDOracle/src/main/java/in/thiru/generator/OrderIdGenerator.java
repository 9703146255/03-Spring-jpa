package in.thiru.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


//in.thiru.generator.OrderIdGenerator
public class OrderIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) 
    {
        try {
            JdbcConnectionAccess con = session.getJdbcConnectionAccess();
            Connection obtainConnection = con.obtainConnection();
            Statement stmt = obtainConnection.createStatement();

            String sql = "select order_id_seq.nextVal from dual";
            
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int seqVal = rs.getInt(1);
                String formattedSeqVal = String.format("%06d", seqVal); // Format with leading zeros
                return "THIRU" + formattedSeqVal; // Concatenate with the prefix "ID"
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null; // Return null in case of an error (you might want to handle this differently)
    }
}


