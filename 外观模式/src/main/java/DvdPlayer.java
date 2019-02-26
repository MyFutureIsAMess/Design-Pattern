import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

/**
 * @author Guojian Wang
 * @date 2019/2/26 - 23:45
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
public class DvdPlayer {
    Amplifier amplifier;
    String movie;

    public void on(){
        System.out.println("Top-O-Line DVD Player on");
    }

    public void off(){
        System.out.println("Top-O-Line Dvd Player off");
    }

    public void eject(){
        System.out.println("Top-O-Line Dvd Player eject");
    }

    public void pause(){}

    public void  play(String movie){
        this.movie = movie;
        System.out.println("Top-O-Line Dvd Player playing " + "\"" + movie + "\"");
    }

    public void setSurroundAudio(){}

    public void setTwoChannelAudio(){}

    public void stop(){
        System.out.println("Top-O-Line Dvd Player stopped " + "\"" + movie + "\"");
    }
}
