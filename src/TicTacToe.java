import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame
{
    private static final int SIZE_WIDTH = 400;
    private static final int SIZE_HEIGHT = 400;
    public static int SIZE = 3;
    public static JButton[][] btnArray = new JButton[SIZE][SIZE];
    private static final int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    TicTacToe() {
        setVisible(true); //видимость
//        setLocation(500, 300);
//        setSize(500, 500);
        setBounds(getGraphicsConfiguration().getBounds().width / 2 - SIZE_WIDTH / 2,
                getGraphicsConfiguration().getBounds().height / 2 - SIZE_HEIGHT / 2,
                SIZE_WIDTH, SIZE_HEIGHT);

        setTitle("Крестики - Нолики");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        initComponents();
    }

    public void initComponents() {

        JPanel panel = new JPanel(new GridLayout(SIZE, SIZE));

        ActionListener pressButton = new PressButtonAL();
        int l = 0;

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                btnArray[i][j] = new JButton(String.valueOf(numberArray[l]));
                panel.add(btnArray[i][j]);
                btnArray[i][j].addActionListener(pressButton);
                System.out.println(i + "  " + j + "   " + btnArray[i][j]);
                l++;
            }
        }

        add(panel, BorderLayout.CENTER);
    }
}
