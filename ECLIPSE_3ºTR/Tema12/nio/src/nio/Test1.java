package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test1
{
    public static void main(String[] args) throws IOException
    {
        Path temp = Files.move
        (Paths.get("C:\\Users\\Zeus\\Downloads\\progit.pdf"), 
        Paths.get("C:\\Users\\Zeus\\Downloads\\otra\\progitt.pdf"), StandardCopyOption.REPLACE_EXISTING);
 
        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }
}
