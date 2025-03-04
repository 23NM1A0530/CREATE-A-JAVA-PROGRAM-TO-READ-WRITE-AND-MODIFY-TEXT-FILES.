import java.io.*;
import java.util.Scanner;

public class FileHandling
{
    public static void main(String[] args)
    {
        try {
            File Obj = new File("myfile.txt");
            if (Obj.createNewFile()) // createNewFile() creates an empty file
            {
                System.out.println("File created: " + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
            FileWriter Writer = new FileWriter("myfile.txt");
             Writer.write("program to show file handling in java");
            Writer.close();
           
            Scanner Reader = new Scanner(Obj);
              while (Reader.hasNextLine()) 
              {
                String data = Reader.nextLine();
                System.out.println(data);
            }
          
            Reader.close();
        }
      
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}