package nio;

//Java program to illustrate Copying the file
//and deleting the original file
import java.io.*;

public class Test2 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Zeus\\Downloads\\progit.pdf");

		// renaming the file and moving it to a new location
		if (file.renameTo(new File("C:\\Users\\Zeus\\Downloads\\otra\\progitt.pdf"))) {
			// if file copied successfully then delete the original file
			file.delete();
			System.out.println("File moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}

	}
}
