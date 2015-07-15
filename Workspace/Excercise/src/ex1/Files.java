package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
	
	public static void main(String[] args) throws IOException {
		
		writeToFile("javaio-append.txt", "test_input_text");
		
	} // end of main

	private static void writeToFile(String filePath, String inputText) throws IOException {
		try {
			String data = inputText;
			File file = new File(filePath);
			
			if (!file.exists()){
				file.createNewFile();
			} else {
				System.out.println("file already exitsts");
			}
			String path = file.getAbsolutePath();
			System.out.println(path);
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			bufferedWriter.close();
			System.out.println("done");
			
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		
	}
	

	 public static String[] readLinesFromFilesAsArray(String filePath, int numOfLines) throws IOException{
		 	String[] Array = new String[numOfLines];
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String text = "";
			try {
				String line = br.readLine();
				for (int i = 0; i < numOfLines; i++) {
					text = text + line + "\n";
					Array[i] = line;
					line = br.readLine();
				}
				
			} catch(IOException e){
				e.printStackTrace();
			} finally {
				br.close();
			}
			System.out.println(text);
			return Array;
	}
	 
	public static void readWriteFile(String filePath) throws IOException {
		
		BufferedReader br = null;
		
		try {
			
			String sCurrentLine;
			br = new BufferedReader(new FileReader(filePath));
			
			while ((sCurrentLine = br.readLine()) != null){
				System.out.println(sCurrentLine);
			}
		} catch ( IOException e ){
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	
	

} // end of class
