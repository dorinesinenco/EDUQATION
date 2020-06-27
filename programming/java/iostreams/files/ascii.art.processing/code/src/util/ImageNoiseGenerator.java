package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImageNoiseGenerator {
	
	public ImageNoiseGenerator applyNoiseTo(String sourceFile, int percentAmount) throws IOException {
		
		BufferedReader br = new BufferedReader( new FileReader(sourceFile) );
		BufferedWriter bw = new BufferedWriter( new FileWriter(sourceFile.replace(".txt", ".noisy." + percentAmount + ".txt")) );
		int c;
		while((c = br.read())!=-1) {
			if( Math.random() < percentAmount / 100.0 && c == ' ' ) {
				c = 'x';
			}
			bw.write(c);
//			System.out.println((char)c);
		}
		bw.close();
		br.close();
		
		return this;
	}
	
}
