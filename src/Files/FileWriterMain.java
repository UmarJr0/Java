package Files;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class FileWriterMain {
    public static void main(String[] args) throws IOException {
        FileWriterMain fileSystem = new FileWriterMain();
        fileSystem.writeData("Wagwan");

    }

    public void appendData(boolean data) throws IOException {
        try {
            File myFile = new File("text.txt");
            FileWriter fileWriter = new FileWriter(myFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.print(data);
            printWriter.println("More Money More Problems");
            printWriter.println("No Money Still Problems");

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            System.out.println();
        }
    }
    public void writeData(String data) throws IOException {
        try{
            File myFile = new File("test.txt");
            FileWriter writeToFile = new FileWriter(myFile);
            writeToFile.write(data);
            writeToFile.append("More text");

            writeToFile.flush();
            writeToFile.close();
        }catch (IOException e){
            System.out.println("can not write to this file");
        }
    }
    public void readFromFile(){
        try {
            File myFile = new File("text.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNext()){
                String dataInFile = myReader.nextLine();
                System.out.println(dataInFile);
            }
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File does not exist");
        }
    }
}
