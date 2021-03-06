import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame
{
    private static final int SIZE_WIDTH = 400;
    private static final int SIZE_HEIGHT = 400;
    private static int SIZE = Main.SIZE;
    public static JButton[][] btnArray = new JButton[SIZE][SIZE];

    TicTacToe() {
        setVisible(true); //видимость
//        setLocation(500, 300);
//        setSize(500, 500);
        setBounds(getGraphicsConfiguration().getBounds().width / 2 - SIZE_WIDTH / 2,
                getGraphicsConfiguration().getBounds().height / 2 - SIZE_HEIGHT / 2,
                SIZE_WIDTH, SIZE_HEIGHT);

        setTitle("Крестики - Нолики:  " + "Ваш ход!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);


        initComponents();
    }

    public void updateTitle (String title)
    {
        this.setTitle(title);
    }

    public void initComponents() {

        Font buttonFont = new Font("sanserif", Font.BOLD, 55);

        JPanel panel = new JPanel(new GridLayout(SIZE, SIZE));

        ActionListener pressButton = new PressButtonAL();

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                btnArray[i][j] = new JButton(i + "" + j);
                btnArray[i][j].setFont(buttonFont);
                btnArray[i][j].setActionCommand(i + "" + j);
                panel.add(btnArray[i][j]);
                btnArray[i][j].addActionListener(pressButton);
            }
        }

        add(panel, BorderLayout.CENTER);
    }
}
