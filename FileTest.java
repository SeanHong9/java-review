import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileTest {
    public static void main(String args[]){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            
        }

        File myObj = new File("filename.txt");
        if(myObj.exists()){
            System.out.println("FileName: " + myObj.getName());
            System.out.println("Path: " + myObj.getAbsolutePath());
            System.out.println("writable: "+ myObj.canWrite());
            System.out.println("Readable: "+ myObj.canRead());
            System.out.println("File Size: "+ myObj.length());
        }else{
            System.out.println("Not exist.");
        }

    }

    // public static void main(String[] args){
    //     try{
    //         File myObj = new File("filename.txt");
    //         FileWriter myWriter = new FileWriter("filename.txt");
    //         myWriter.write("Files in Java might be tricky, but it's fun though.");
    //         myWriter.close();
    //         System.out.println("Successfully wrote to the file.");
    //     }catch(IOException e){
    //         System.out.println("ERROR occurred.");
    //         e.printStackTrace();
    //     }
    // }
    
}
