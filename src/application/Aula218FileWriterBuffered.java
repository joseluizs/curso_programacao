package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula218FileWriterBuffered {

	public static void main(String[] args) {

		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "c:\\Temp\\out.txt";
		
		//   (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) <- cria um novo, o seguite aproveita 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
