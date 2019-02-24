/**
 * @author Guojian Wang
 * @date 2019/2/24 - 20:37
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
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void on(){
        System.out.println(location + " Ceiling fan is on");
    }

    public int getSpeed() {
        return speed;
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " Ceiling fan is off");
    }

    public  void low(){
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }
}
