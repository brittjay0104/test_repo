import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InitializerTryWithResources {
	{
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt")))
		{
			br.read();
		} catch (IOException e) {
			
		}
	}
}
