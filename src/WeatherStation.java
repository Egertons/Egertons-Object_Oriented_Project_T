import java.util.ArrayList;
//18005250805 张霖
public class WeatherStation extends subject {

    private double temp;//温度数据

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        //当温度发生变化时通知所有的观察者。
        this.notifyAllObservers();
    }

    WeatherStation(){
        this.observerList = new ArrayList<Observer>();
        temp = 25;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update(this.temp);
        }
    }
}