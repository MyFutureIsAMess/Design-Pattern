/**
 * @author Guojian Wang
 * @date 2019/1/27 - 22:40
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
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    //构造器需要weatherData对象作为注册之用
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(float tmeperature, float humidity, float pressure) {
        this.temperature = tmeperature;
        this.humidity = humidity;
        display();
    }
}
