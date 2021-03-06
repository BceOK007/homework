import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PressButtonAL implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton source = (JButton) (e.getSource());
        char c = source.getText().charAt(0);
        switch (c){
            case '1':
            {
                Main.humanTurn(0, 0);
            }
        }







        source.setText(String.valueOf(Main.DOT_X));
        source.setEnabled(false);
    }
}
