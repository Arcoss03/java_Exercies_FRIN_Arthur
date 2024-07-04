package Day5;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class WriteFile {

    public static void main(String[] args) {
        writeToFile("./write.txt", "Hello World");
    }

    public static void writeToFile(String filePath, String content) {
        FileOutputStream fout = null;
        FileChannel fc = null;
        ByteBuffer buffer = null;

        try {
            fout = new FileOutputStream(filePath);
            fc = fout.getChannel();
            buffer = ByteBuffer.allocate(1024);
            buffer.put(content.getBytes());
            buffer.flip();
            fc.write(buffer);
            buffer.clear();
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (fc != null) {
                    fc.close();
                }
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
