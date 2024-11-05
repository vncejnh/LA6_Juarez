package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    JCheckBox[] fd = {cPizza,cBurger,cFries,cSoftDrinks,cTea,cSundae};
    int[] price = {100,80,65,55,50,40};
    JRadioButton[] dsc = {rbNone,rb5,rb10,rb15};
    double[] val = {0.0, .05, .1,.15};

    FoodOrderingSystem(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total =0;
                for(int i=0; i<6; i++){
                    if(fd[i].isSelected()){
                        total += price[i];
                    }
                }
                if(rbNone.isSelected()){
                    String sumofAll = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null,"The total price is Php" + sumofAll);
                }else{
                    for(int i=1; i<4;i++){
                        if(dsc[i].isSelected()){
                            double d = total * val[i];
                            total -= d;
                            String c = String.format("%.2f", total);
                            JOptionPane.showMessageDialog(null,"The total price is Php " + c);
                            break;
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.pMain);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
