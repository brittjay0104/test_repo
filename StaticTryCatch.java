import java.io.File;
import java.io.IOException;

public class StaticTryCatch {
	static {
		try{
			File file = new File ("static-try.txt");
			file.createNewFile();
		}catch(IOException e){
			
		}
	}
}
