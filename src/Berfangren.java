//18005250805 张霖
public class Berfangren implements Observer {
    public static String msg;
    @Override
    public void update(double wendu) {
        if(wendu>30){
            msg = "北方人：太热了";
        }else if(wendu>15){
            msg = "北方人：挺舒服的";
        }else if(wendu>0){
            msg = "北方人：有点小冷";
        }else{
            msg = "北方人：冬天该有的模样";
        }
    }
}
