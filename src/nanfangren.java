//18005250805 张霖
public class nanfangren implements Observer {
    public static String msg;
    @Override
    public void update(double wendu) {
        if(wendu>30){
            msg = "南方人：有点热了";
        }else if(wendu>15){
            msg = "南方人：相当舒服了";
        }else if(wendu>0){
            msg = "南方人：冷啊~";
        }else{
            msg = "南方人：简直太冷了";
        }
    }
}
