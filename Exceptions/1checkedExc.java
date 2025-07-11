import java.io.*;

public class checkedException {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

