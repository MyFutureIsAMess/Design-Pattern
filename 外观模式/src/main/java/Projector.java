/**
 * @author Guojian Wang
 * @date 2019/2/26 - 23:51
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
public class Projector {
    DvdPlayer dvdPlayer;

    public void on(){
        System.out.println("Top-O-Line Projector on");
    }

    public void off(){
        System.out.println("Top-O-Line Projector off");
    }

    public void tvMode(){}

    public void wideScreenMode(){
        System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }

    @Override
    public String toString() {
        return "Projector{" +
                "dvdPlayer=" + dvdPlayer +
                '}';
    }
}
