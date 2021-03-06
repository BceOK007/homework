import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    static final int SIZE = 3;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_0 = '0';
    public static boolean IS_WAIT_PLAYER = true;

    public static void main(String[] args) {

        initMap();

        new TicTacToe();

        while (true)
        {
            IS_WAIT_PLAYER = true;
            humanTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Победил человек");
                     //     setTitle("Крестики - Нолики:  " + "Ваш ход!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_0))
            {
                System.out.println("Победил Т-1000");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }

//        System.out.println("Игра окончена.");
    }

    static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


    static void printMap()
    {
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }
    }

    static void humanTurn()
    {
        Scanner sc = new Scanner((System.in));
        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValod(x, y));

//        while (IS_WAIT_PLAYER){
//
//        }
        System.out.println("Человек сходил в точку " + (x) + " " + (y));
        map[y][x] = DOT_X;

    }

    static void aiTurn()
    {
        Random sc = new Random();
        int x;
        int y;

        do
        {
            x = sc.nextInt(SIZE);
            y = sc.nextInt(SIZE);
        }
        while (!isCellValod(x, y));

        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
        TicTacToe.btnArray[x][y].setText(String.valueOf(DOT_0));
        TicTacToe.btnArray[x][y].setEnabled(false);
    }

    static boolean isCellValod (int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }

        if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }

        return false;
    }

    static boolean checkWin(char symb)
    {
        for (int i = 0; i < map.length; i ++)
        {
            boolean isWinColumn = true;
            boolean isWinRow = true;
            int cnt = 0;
            for (int j = 1; j < map[i].length - 1; j++)
            {

                //строки
                if (map[i][j] != symb || (map[i][0] != symb && map[i][map[i].length - 1] != symb)) {
                    isWinRow = false;
                }
                //столбцы
                if (map[j][i] != symb || (map[0][i] != symb && map[map.length - 1][i] != symb))
                {
                    isWinColumn = false;
                }
            }
            if (isWinRow || isWinColumn) return true;
        }

        //диагонали
        boolean isWinMainDiagonal = true;
        boolean isWinSecondaryDiagonal = true;
        for (int i = 0; i < map.length; i++)
        {
            if (map[i][i] != symb || (map[0][0] != symb && map[map.length - 1][map[i].length - 1] != symb))
            {
                isWinMainDiagonal = false;
            }
            if (map[i][map.length - i - 1] != symb || (map[0][map[i].length - 1] != symb && map[map.length - 1][0] != symb))
            {
                isWinSecondaryDiagonal = false;
            }
        }
        if (isWinMainDiagonal || isWinSecondaryDiagonal) return true;

        return false;
    }

    static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
