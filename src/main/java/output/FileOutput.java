package output;

import java.io.File;
import java.io.FileWriter;

public class FileOutput implements Output {

    @Override
    public void write(double value) throws Exception {

        File file = new File("target/result.txt");
        file.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Result = " + value);
        }
    }
}
