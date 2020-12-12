import java.util.List;
//18005250805 张霖
public abstract class subject {
    List<Observer> observerList;
    public abstract void registerObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyAllObservers();
}
