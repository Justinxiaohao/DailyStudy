import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    //定义两个按钮
    private JButton Order_Start;
    private JButton Order_Over;
    public Menu(){
        //定义按钮的排列方式
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.setLocation(300,400);
        Order_Start = new JButton("开始点餐！");
        this.add(Order_Start);
        Order_Start.addActionListener(this);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Order_Start){
            this.dispose();
            new Demo();
        }
    }
}