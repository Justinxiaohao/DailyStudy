import javax.swing.*;
import java.awt.*;

public class Test  {

    public static void main(String[] args) {
        JFrame jf=new JFrame("背景图片测试");
        ImageIcon background=new ImageIcon("src/images/background.jpg");
        JLabel label=new JLabel(background);
        label.setSize(background.getIconWidth(),background.getIconHeight());
        jf.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
        //2.把窗口面板设为内容面板并设为透明、流动布局。
        JPanel pan=(JPanel)jf.getContentPane();
        pan.setOpaque(false);
        pan.setLayout(new FlowLayout());
        //3.之后把组件和面板添加到窗口面板就可以；
        JButton btn=new JButton("测试按钮");
        pan.add(btn);
        jf.setSize(background.getIconWidth(),background.getIconHeight());
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

}