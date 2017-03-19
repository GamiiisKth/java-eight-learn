package chapter5.streamFromFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class StreamOfFile {

    public static void main(String[] args) throws IOException {

        try(Stream<String> lines= Files.lines(Paths.get("/Users/so4it/so4it/sugar/java-eight-learn/chapter-five/src/main/java/chapter5/streamFromFiles/text.txt"), Charset.defaultCharset())) {

            Long uniqueWords = lines.flatMap(line ->
                    Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();

            System.out.println(uniqueWords);
        }

    }
}
