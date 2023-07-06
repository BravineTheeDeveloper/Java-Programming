import javax.swing.JOptionPane;
public class CountStrings
{
     public static void main( String [] args)
     {
		String s = JOptionPane.showInputDialog(null, 		"Enter a string");
		String temp = JOptionPane.showInputDialog(null,
        "Enter a character");
		char c = temp.toUpperCase().charAt(0);
		int count = 0;
		for (int i = 0; i< s.length(); i++)
        {
			if(s.charAt(i)==c)
            {
				count++;
			}
		}
		JOptionPane.showMessageDialog(null,
		 "The character " + c + " occurs " + count + 		 " times in " + s);
     }
}