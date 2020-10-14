package Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game_guess extends JFrame{
    JTextField jta1 = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton button = new JButton("ПРОВЕРКА");
    int k = 3;
    Game_guess(){
        super("Угадайка");
        setLayout(new FlowLayout());
        setSize(300,160);
        add(new JLabel("Ваше число"));
        add(jta1);
        add(button);
        int count = (int) (Math.random() * 20);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    int x1 = Integer.parseInt(jta1.getText());
                        if(x1 == count){
                            JOptionPane.showMessageDialog(null, "Ты угадал число!", "Красава", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);

                        }
                        else {
                            if (k == 1) {
                                JOptionPane.showMessageDialog(null, "Попытки закончилось, ты не смог угадать число", "Гуляй", JOptionPane.ERROR_MESSAGE);
                                System.exit(0);
                            }
                            k--;
                            if (x1 < count) {
                                JOptionPane.showMessageDialog(null, "Неправильно, загаданное число больше, осталось попыток: " + k, "Упс", JOptionPane.ERROR_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Неправильно, загаданное число меньше, осталось попыток: " + k, "Упс", JOptionPane.ERROR_MESSAGE);
                            }
                        }
            }
        });

        jta1.setForeground(Color.RED);
        jta1.setFont(fnt);
        setVisible(true);
    }
}
