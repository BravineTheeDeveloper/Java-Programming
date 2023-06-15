import javax.swing.JOptionPane;
public class Dialog
{
    public static void main(String[] args)
    {
        int number1, number2, sum;
        double average;
        String firstNumber = JOptionPane.showInputDialog("Enter the first number: ");
        String secondNumber = JOptionPane.showInputDialog("Enter the second number: ");

        //Convert numbers from string to numerical
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        //Compute sum and avarage
        sum = number1 + number2;
        average = (double) sum/2; //Typecasting

        //Display the output
        JOptionPane.showMessageDialog(null, "Sum is: "+sum +"Average is: "+average);
    }
}