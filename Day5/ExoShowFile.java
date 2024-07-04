package Day5;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExoShowFile {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("readandshow.txt")) {
            FileChannel fc = fis.getChannel();

            ByteBuffer tampon = ByteBuffer.allocate(1024);
            fc.read(tampon);
            //print
            tampon.flip();
            while (tampon.hasRemaining()) {
                System.out.print((char) tampon.get());
            }
            tampon.clear();
            fc.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}