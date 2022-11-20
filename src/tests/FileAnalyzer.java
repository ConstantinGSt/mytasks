package tests;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
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
	
	public void createReport(String filepath, String filename) { //, String filename
		boolean maxPathL;
		
		try {
			maxPathL = getMaxPathLength() > filepath.length();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Stream<Path> walk = Files.walk(Paths.get(filepath))) { //.filter(p -> p.length(getFileName()) > getMaxFilenameLength())
			List<Path> list = walk.filter(t-> ((FileAnalyzer) t).getMaxPathLength() < filepath.length())
					.forEach(Files.writer(filename));
			walk.close();
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