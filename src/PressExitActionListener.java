import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressExitActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
