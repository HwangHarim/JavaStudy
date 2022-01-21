package FromDirectoryExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path  = Paths.get("C:\\Users\\user\\Desktop\\This is Java Study");
        Stream<Path> stream = Files.list(path);
        stream.forEach(f-> System.out.println(f.getFileName()));
        System.out.println();
    }
}
