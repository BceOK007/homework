import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PressButtonActionListener implements java.awt.event.ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton source = (JButton) (e.getSource());
        String actionCommand =  source.getActionCommand();
        int i = (int) actionCommand.charAt(0) - 48;
        int j = (int) actionCommand.charAt(1) - 48;
        Main.step(i, j);
    }
}
