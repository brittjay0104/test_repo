import java.io.IOException;
import java.sql.SQLException;

public class Multicatch {
	void m(){
		try{
			if(1==1)
				throw new IOException();
			throw new SQLException();
			
		} catch(IOException | SQLException | RuntimeException e){
			
		} 
	}
}
