import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ClassName:WindowListenerTest
 * Package:PACKAGE_NAME
 * Author:@Wyh
 */
public class WindowListenerTest {
    public static void main(String[] args) {
        JFrame main =new JFrame("请确认你的选择");
        JPanel jPanel = new JPanel(new FlowLayout());
        JButton btn1 =new JButton("同意");
        JButton btn2 =new JButton("拒绝");
        main.add(jPanel, BorderLayout.SOUTH);
        jPanel.add(btn1);
        jPanel.add(btn2);
        main.setSize(300,300);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result=JOptionPane.showConfirmDialog(null,"确认选择");
                if (JOptionPane.YES_OPTION==result){
                    System.exit(1);
                }else{
                    return ;
            }
            }
        });
    }
}
