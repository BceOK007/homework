import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PressButtonAL implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton source = (JButton) (e.getSource());
        String actionCommand =  source.getActionCommand();
        int i = (int) actionCommand.charAt(0) - 48;
        int j = (int) actionCommand.charAt(1) - 48;
        source.setText(String.valueOf(Main.DOT_X));
        source.setEnabled(false);
        System.out.println("Человек сходил в точку " + (i) + " " + (j));
        Main.map[i][j] = Main.DOT_X;
        Main.IS_WAIT_PLAYER = false;
    }
}
