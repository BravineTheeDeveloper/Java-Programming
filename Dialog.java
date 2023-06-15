import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;
public class Dialog
{
    public static void main(String[] args)
    {
        int number1, number2, sum;
        double average;
        int response;

        do{
            String firstNumber = JOptionPane.showInputDialog("Enter the first number: ");
            String secondNumber = JOptionPane.showInputDialog("Enter the second number: ");

            //Convert numbers from string to numerical
            number1 = Integer.parseInt(firstNumber);
            number2 = Integer.parseInt(secondNumber);

            //Compute sum and average
            sum = number1 + number2;
            average = (double) sum/2; //Typecasting

            //Display the output
            JOptionPane.showMessageDialog(null, "Sum is: "+sum +" Average is: "+average);
            response = JOptionPane.showConfirmDialog(null, firstNumber, secondNumber, response);
        }while(response = JOptionPane.YES_OPTION);


        /*int choice = JOptionPane.showOptionDialog(null, "Do you want to continue?","Choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yes", "No", "Cancel"}, "Yes");
        if(choice == JOptionPane.YES_OPTION)
        {
            main(null);
        }
        else
        {
            System.exit(0);
        }*/
    }
}