import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComputeSum extends JFrame implements ActionListener{
    JTextField firstNumberTx, secondNumberTx, resultsTx;
    JLabel firstNumberlb, secondNumberlb, resultsLb;
    JButton computeAdd;
    public ComputeSum() {
    firstNumberlb = new JLabel("Enter first Number");
    firstNumberTx = new JTextField(4);
    secondNumberlb = new JLabel("Enter second Number");
    secondNumberTx = new JTextField(4);
    resultsLb = new JLabel("Results");
    resultsTx = new JTextField(4);
    setLayout(new GridLayout(4, 2, 5, 5));
    add(firstNumberlb );
    add(firstNumberTx);
    add(secondNumberlb);
    add(secondNumberTx);
    add(resultsLb);
    add(resultsTx);
    computeAdd = new JButton("Add");
    add(computeAdd);
    computeAdd.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event){
        int sum = Integer.parseInt(firstNumberTx.getText())+
        Integer.parseInt(secondNumberTx.getText()) ;
        resultsTx.setText(Integer.toString(sum));
        }
 public static void main(String[] args) {
    ComputeSum computeFrame = new ComputeSum();
    computeFrame.setTitle("My Calculator");
    computeFrame.setLocationRelativeTo(null); // Center the frame
    computeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    computeFrame.setSize(400, 200);
    computeFrame.setVisible(true);
    }
}