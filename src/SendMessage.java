import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SendMessage extends  JFrame {
    private static final int SIZE_WIDTH = 300;
    private static final int SIZE_HEIGHT = 100;
    static JTextField result = new JTextField();

    SendMessage(String message) {
        setVisible(true);
        setBounds(getGraphicsConfiguration().getBounds().width / 2 - SIZE_WIDTH / 2,
                getGraphicsConfiguration().getBounds().height / 2 - SIZE_HEIGHT / 2,
                SIZE_WIDTH, SIZE_HEIGHT);
        setTitle("Результат игры!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setAlwaysOnTop(true);

        result.setText(message);
        add(result, BorderLayout.CENTER);

        ActionListener pressExit = new PressExitActionListener();
        JButton btnExit = new JButton("Выход");
        btnExit.addActionListener(pressExit);
        add(btnExit, BorderLayout.SOUTH);

    }
}

