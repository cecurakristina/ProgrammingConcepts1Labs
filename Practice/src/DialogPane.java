import javax.swing.JOptionPane;

public class DialogPane
{
    public static void main (String[] args)
    {
        String string1 = "Kristina";
        String string2 = "Kristina";
        System.out.print(string1.compareTo(string2));
        String name = JOptionPane.showInputDialog("What is your name? ");
        String hoursInput = JOptionPane.showInputDialog("How many hours did you work? ");
        int hours = Integer.parseInt(hoursInput);
        JOptionPane.showMessageDialog(null, "Hello, " + name + " you worked " + hours + " hours.");

        System.exit(0);
    }
}
