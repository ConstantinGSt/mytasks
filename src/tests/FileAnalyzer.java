package tests;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;


/* 
Пишем символы в файл
*/

public class  FileAnalyzer {
	
	private int maxFilenameLength;
	private int maxPathLength;
	
	public FileAnalyzer(int maxPathLength, int maxFilenameLength) {
		this.maxPathLength = maxPathLength;
		this.maxFilenameLength = maxFilenameLength;
	}
	
	public static void createReport(String filepath) { //, String filename
		try (Stream<Path> walk = Files.walk(Paths.get(filepath))) {
			List lis = walk.filter(maxPathlength -> max)  //forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public int getMaxFilenameLength() {
		return maxFilenameLength;
	}

	public void setMaxFilenameLength(int maxFilenameLength) {
		this.maxFilenameLength = maxFilenameLength;
	}

	public int getMaxPathLength() {
		return maxPathLength;
	}

	public void setMaxPathLength(int maxPathLength) {
		this.maxPathLength = maxPathLength;
	}
	
	
}