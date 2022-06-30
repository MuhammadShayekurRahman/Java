package com.qa.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Runner {

	
	public void copy(String inFile, String outFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/cat.png");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/kitty.png");) {
            int numberOfBytesRead;
            byte[] bytesArray = new byte[128];
            while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
                fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("test");
		
	
	}
	
	
}


// byte streams - inputstream and outputstream
// character - reader and writer