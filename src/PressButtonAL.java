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
        Main.step(i, j);
//        System.out.println("Человек сходил в точку " + (i) + " " + (j));
//        Main.map[i][j] = Main.DOT_X;
//        Main.printMap();
//        Main.IS_WAIT_PLAYER = true;
//
//                if (Main.checkWin(Main.DOT_X)) {
//                    System.out.println("Победил человек");
//                }
//                if (Main.isMapFull()) {
//                    System.out.println("Ничья");
//                }
//
//        Main.aiTurn();
//        Main.printMap();
//                if (Main.checkWin(Main.DOT_0)) {
//                    System.out.println("Победил Т-1000");
//                }
//                if (Main.isMapFull()) {
//                    System.out.println("Ничья");
//                }

    }
}
