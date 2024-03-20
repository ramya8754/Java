import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        double age = Double.parseDouble(reader.readLine());
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        reader.close();
    }
}
