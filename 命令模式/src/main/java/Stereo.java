/**
 * @author Guojian Wang
 * @date 2019/2/24 - 20:30
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
public class Stereo {
    String location;

    public Stereo(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " stereo is on");

    }

    public void off(){
        System.out.println(location + " stereo is off");
    }

    public void setCd(){
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDvd(){}

    public void setRadio(){}

    public void setVolume(int Volume){
        System.out.println(location + " Stereo volume set to " + Volume);
    }
}
