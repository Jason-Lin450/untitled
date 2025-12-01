import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = getFileData("src/data");
        int num = 50;
        int pass = 0;
        for (String line : lines) {
            if (line.substring(0,1).equals("L")) {
                num -= Integer.parseInt(line.substring(1));
                while (num < 0) {
                    num += 100;
                    pass++;
                }
            } else {
                num += Integer.parseInt(line.substring(1));
                while (num > 99) {
                    num -= 100;
                    pass++;
                }
            }
            if (num == 0) {
                pass++;
            }
        }
        System.out.println(pass);
    }
    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}