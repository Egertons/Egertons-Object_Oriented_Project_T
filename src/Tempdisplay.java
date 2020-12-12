//18005250805 张霖
public class Tempdisplay implements Observer {
    public static String msg;
    @Override
    public void update(double wendu) {
        msg = "当前温度是："+wendu;
    }
}
