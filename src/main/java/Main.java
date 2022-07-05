import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        ArrayList<JLabel> numberList = new ArrayList<>();
/*
        ImageIcon number0 = new ImageIcon("src\\numbers\\0.png");
        JLabel number0Label = new JLabel(number0);
        numberList.add(number0Label);

        ImageIcon number1 = new ImageIcon("src\\numbers\\1.png");
        JLabel number1Label = new JLabel(number1);
        numberList.add(number1Label);
        and so on...

        frame.add(numberList.get(0));
        frame.add(numberList.get(1));
        and so on...

        or you can do this:
*/
        for (int i=0; i<10; i++) {
            numberList.add(new JLabel(new ImageIcon("src\\numbers\\"+i+".png")));
            frame.add(numberList.get(i));
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
