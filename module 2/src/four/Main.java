package four;

import java.nio.file.*;
public class Main {
    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception
    {
        String data = readFileAsString("C:\\Users\\2655708\\Downloads\\illiad.txt");
        data = data.toLowerCase();
    }
}

