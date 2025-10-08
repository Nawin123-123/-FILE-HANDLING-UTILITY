import java.io.*;
import java.util.Scanner;
public class FileUtility {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String fileName="example.txt";
        try{
            // WRITE TO A FILE 
            System.out.println("Enter a text to write into the file ");
            String content =scanner.nextLine();
            FileWriter writer=new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Data written to file Successfully!\n");

            // READ from the File 
            System.out.println("Reading the file content");
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            String line;
            while ((line =reader.readLine())!=null){
                   System.out.println(line);
            }
            reader.close();

            // MODIFY (append) to the file
            System.out.println("\nEnnter new texet to append to the file:");
            String newText=scanner.nextLine();
            FileWriter appendWriter=new FileWriter(fileName,true);//true = append mode
            appendWriter.write("\n"+newText);
            appendWriter.close();
            System.out.println("Text appended Successfully!\n");
            // SHOW the modified file
            System.out.println("Update the File content:");
            BufferedReader updateedReader=new BufferedReader(new FileReader(fileName));
            while((line = updateedReader.readLine()) != null){
                       System.out.println(line);
            }
            updateedReader.close();
        }
        catch(IOException e)
        {
            System.out.println("An Error Occurred:"+e.getMessage());
        }
        scanner.close();
    }
}
