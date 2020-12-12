import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//18005250805 张霖
public class displayFrame extends JFrame implements ActionListener {
    private final JButton tmp_up = new JButton("＋(每次增加5度)");
    private final JButton tmp_down = new JButton("-(每次下降5度)");
    Observer o1,o2,o3;
    WeatherStation ws = new WeatherStation();
    public displayFrame() {
        //界面初始化
        super("18005250805_张 霖");
        this.setLayout(new GridLayout(4,1));
        //定义各控件
        String welcomMsg = "欢迎使用气象站系统:(系统初始温度为30℃)";
        JLabel lblWelcome = new JLabel(welcomMsg);
        this.add(lblWelcome);
        this.add(tmp_up);
        this.add(tmp_down);
        JButton btExit = new JButton("退出系统");
        this.add(btExit);
        this.setSize(600,250);
        GUIUtil.toCenter(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        //增加监听
        tmp_up.addActionListener(this);
        tmp_down.addActionListener(this);
        btExit.addActionListener(this);
        o1 = new Tempdisplay();
        o2 = new Berfangren();
        o3 = new nanfangren();
        ws.registerObserver(o1);
        ws.registerObserver(o2);
        ws.registerObserver(o3);
        ws.setTemp(30);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==tmp_up) {
            String message="现在气温增加5℃:\n";
            double tmp = ws.getTemp();
            ws.setTemp(tmp+=5);
            message += Tempdisplay.msg+"\n";
            message += Berfangren.msg+"\n";
            message += nanfangren.msg+"\n";
            message += "\n";
            message += "Author by 18005250805_张 霖";
            JOptionPane.showMessageDialog(this,message);//弹窗设置
        } else if(e.getSource()==tmp_down){
            String message="现在气温降低5℃:\n";
            double tmp = ws.getTemp();
            ws.setTemp(tmp-=5);
            message += Tempdisplay.msg+"\n";
            message += Berfangren.msg+"\n";
            message += nanfangren.msg+"\n";
            message += "Author by 18005250805_张 霖";
            JOptionPane.showMessageDialog(this,message);//弹窗设置
        }else {
            JOptionPane.showMessageDialog(this,"期待您的下次使用!");
            System.exit(0);
        }
    }
}

