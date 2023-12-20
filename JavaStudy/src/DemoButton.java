import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {//定义内部类实现ActionListener接口
    @Override
    public void actionPerformed(ActionEvent e) {//重写actionPerformed()方法
        System.out.println("a clicked");
    }
}

public class DemoButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("图形化界面");
        f.setSize(800, 500);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        JButton a = new JButton("button a  ");
        JButton b = new JButton("button b ");

        a.addActionListener(new MyListener());
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("b clicked");
            }
        });

        panel.add(a);
        panel.add(b);

        f.add(panel);
        f.setVisible(true);
    }
}