import java.io.File;
import java.io.IOException;

public class Files {

    public static void main(String[] args) {
        File file1 = new File("C:\\mydir\\mysubdir\\myfile.txt");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
