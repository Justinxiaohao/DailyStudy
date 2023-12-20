import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClassName:Demo
 * Package:PACKAGE_NAME
 * Author:@Wyh
 */
public class Demo extends JFrame {

    public Demo() {
        setTitle("请选择堂食还是打包");
        setBounds(200, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container c = getContentPane();
        JButton btn1 = new JButton("堂食用餐");
        JButton btn2 = new JButton("打包带走");
        c.add(btn1);
        c.add(btn2);
        btn1.setBorderPainted(false);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(Demo.this, "您选择的是堂食用餐");
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(Demo.this, "您选择的是打包带走");
            }
        });

    }
    public static void main(String[] args) {
        new Demo();
    }
}