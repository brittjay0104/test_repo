import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StaticTryWithResources {
	static {
		
		try(FileInputStream input = new FileInputStream("file.txt")) {
			int data = input.read();

		} catch (FileNotFoundException e) {
		
		} catch (IOException e) {

		}
	} 
}
