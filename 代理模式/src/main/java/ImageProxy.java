import java.awt.*;
import java.net.URL;

/**
 * @author Guojian Wang
 * @date 2019/3/1 - 12:41
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑, 永无BUG!
 * 　　　　 ┃　　　┃Code is far away from bug with the animal protecting
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 */
public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrievaling = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getIconWidth() {
        if (imageIcon != null){
            return imageIcon.getIconWidth();
        }else {
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null){
            return imageIcon.getIconHeight();
        }else {
            return 600;
        }
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        }else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrievaling){
                retrievaling = true;
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageUrl, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

}
