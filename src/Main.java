import java.util.Random;
import java.util.Scanner;

public class Main {

    static char[][] map;
    static final int SIZE = 6;
    static final int DOTS_FOR_WIN = 4;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_0 = '0';

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true)
        {
            humanTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Победил человек");
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

        System.out.println("Игра окончена.");
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
            System.out.print(i + "    ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + "    ");

            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(map[i][j] + "    ");
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

        map[y][x] = DOT_X;
    }

    static void aiTurn()
    {
        Random sc = new Random();
        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt(SIZE);
            y = sc.nextInt(SIZE);
        }
        while (!isCellValod(x, y));

        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
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
        int cntMove = map.length - DOTS_FOR_WIN + 1;

        /*Решать задачу будем делением игрового поля на миниполя с размерностью равной необходимому кол-во символов подрял для победы*/
        for (int iMove = 0; iMove < cntMove; iMove++)
        {
            for (int jMove = 0; jMove < cntMove; jMove++)
            {
                //зная координаты левого верхнего квадрата миниполя, начинаем работать с ним
                for (int i = iMove; i < iMove + DOTS_FOR_WIN; i ++)
                {
                    boolean isWinColumn = true;
                    boolean isWinRow = true;
                    int cnt = 0;
                    for (int j = jMove; j < jMove + DOTS_FOR_WIN; j++)
                    {
                        //строки
                        if (map[i][j] != symb)
                        {
                            isWinRow = false;
                        }
                        //столбцы
                        if (map[j][i] != symb)
                        {
                            isWinColumn = false;
                        }
                    }
                    if (isWinRow || isWinColumn) return true;
                }

                //диагонали
                boolean isWinMainDiagonal = true;
                boolean isWinSecondaryDiagonal = true;
                int i = 0;
                int j = 0;
//                System.out.println(" -------------------------------- " + iMove + " ---------- " + jMove);
                for (i = iMove, j = 0; i < iMove + DOTS_FOR_WIN && j < DOTS_FOR_WIN; i++, j++)
                {
                    //основная
                    if (map[i][jMove + j] != symb)
                    {
                        isWinMainDiagonal = false;
                    }
                    //побочная
                    if (map[i][jMove + DOTS_FOR_WIN - j - 1] != symb)
                    {
                        isWinSecondaryDiagonal = false;
                    }
//                    System.out.println("                                 [" + i + "][" + (jMove + j) + "]         [" + i + "][" + (jMove + DOTS_FOR_WIN - j - 1) + "]");
                }
                if (isWinMainDiagonal || isWinSecondaryDiagonal) return true;
            }
        }

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
