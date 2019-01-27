import java.util.ArrayList;

/**
 * @author Guojian Wang
 * @date 2019/1/27 - 22:23
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
public class WeatherData implements Subject {

    private ArrayList observers; //ArrayList用来记录观察者
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Object o) {
        //当注册观察者时，我们只需要把它加到ArrayList的后面即可
        observers.add(o);
    }

    public void removeObserver(Object o) {
        //当观察者取消注册时，把它从ArrayList删除即可
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        //把状态告诉每一个观察者
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    // WeatherData的其他方法
}
