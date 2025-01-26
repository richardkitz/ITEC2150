import java.awt.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;


public class ImageUtility {

    public static Image loadImage(String str) throws Exception {
        BufferedImage org =
                ImageIO.read(new File(str));
        Image trans = makeColorTransparent(org, Color.WHITE);
        return trans;
    }

    public static Image makeColorTransparent(BufferedImage im, final Color color) {
        ImageFilter filter = new RGBImageFilter() {
            // the color we are looking for (white)... Alpha bits are set to
            // opaque
            public int markerRGB = color.getRGB() | 0xFFFFFFFF;

            public final int filterRGB(final int x, final int y, final int rgb) {
                if ((rgb | 0xFF000000) == markerRGB) {
                    // Mark the alpha bits as zero - transparent
                    return 0x00FFFFFF & rgb;
                } else {
                    // nothing to do
                    return rgb;
                }
            }
        };
        ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
        return Toolkit.getDefaultToolkit().createImage(ip);
    }

}