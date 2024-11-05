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
    private JLabel lblResult;


    Calculator(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tfNumber1.getText().trim());
                int b = Integer.parseInt(tfNumber2.getText().trim());
                int result = operate(a, b);
                lblResult.setText(String.valueOf(result));
            }
        });
    }

    public int operate(int a, int b){
        int res = 0;
        switch(cbOperations.getSelectedItem().toString()){
            case "+":
                res = a + b;
                break;
            case "-":
                res = b - a;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                try{
                    if(b == 0){
                        throw new ArithmeticException("Division by zero");

                    }
                    res = a / b;
                } catch(ArithmeticException e){
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Division by zero!");
                    tfNumber1.setText("");
                    tfNumber2.setText("");
                }
                break;
            default:
                System.out.println("Invalid");
        }
        return res;
    }








    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.pMain);
        app.setSize(800,250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
}
