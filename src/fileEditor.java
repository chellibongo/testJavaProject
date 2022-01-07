import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.nio.charset.*;

public class fileEditor {

    public static void main(String args[]) {

        Charset utf8 = StandardCharsets.UTF_8;
        List<String> lines = Arrays.asList("1st line", "2nd line");
        List<String> helloWorld = Arrays.asList("Hello", "World!");
        byte[] data = {1, 2, 3, 4, 5};

        try {
            /*
            Files.write(Paths.get("file1.bin"), data);
            Files.write(Paths.get("file2.bin"), data,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            Files.write(Paths.get("file3.txt"), "content".getBytes());
            Files.write(Paths.get("file4.txt"), "content".getBytes(utf8));
            Files.write(Paths.get("file5.txt"), lines, utf8);
            Files.write(Paths.get("file6.txt"), lines, utf8,
            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            */
            //Create file "helloWorld.txt" and write helloWorld array into it with utf8 charset
            Files.write(Paths.get("helloWorld.txt"), helloWorld, utf8);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
