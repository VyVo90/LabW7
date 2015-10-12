import javax.swing.JOptionPane;

public class Lab1 {

	public static void main( String[] args)
	{
		int rand, usernumb;
		int min = 0, max = 10;
		String name;
		String message;
		
		rand = min + (int)(Math.random()*max);
		usernumb =Integer.parseInt(JOptionPane.showInputDialog
				("Let give a number which is from 0 to 10: "));
		
		message = String.format("%d\n The correct number was %d",usernumb, rand);
		JOptionPane.showMessageDialog(null,message);
	}
}
