package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JPanel pMain;


    Calculator(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tfNumber1.getText().trim());
                int b = Integer.parseInt(tfNumber2.getText().trim());
            }
        });
    }




    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.pMain);
        app.setSize(800,250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
