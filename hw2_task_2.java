// С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class hw2_task_2 {
    public static void main(String[] args) {
        Path file = Path.of ("file.txt");       
        boolean exists = Files.exists(file);
        if (exists == true) {
            var text = "TEST\n".repeat(100);
            try {
                Files.writeString (file , text);
            } catch (IOException e) {
                System.out.println("Тут исключение.");
                // throw new RuntimeException(e);
            }
        }
        else {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                System.out.println("Тут исключение.");
                // throw new RuntimeException(e);
            }
        }
    }
}
