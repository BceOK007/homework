import java.util.Random;
import java.util.Scanner;

public class Main {

    static char[][] map;
    static final int SIZE = 5;
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
//        for (int i = 0; i < map.length; i ++)
//        {
//            boolean isWinColumn = true;
//            boolean isWinRow = true;
//            int cnt = 0;
//            for (int j = 0; j < map[i].length; j++)
//            {
//                //строки
//                if (map[i][j] != symb && cnt < map.length)
//                {
//                    isWinRow = false;
//                }
//                //столбцы
//                if (map[j][i] != symb)
//                {
//                    isWinColumn = false;
//                }
//            }
//            if (isWinRow || isWinColumn) return true;
//        }

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

        //строки
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb)
//        {
//            return true;
//        }
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb)
//        {
//            return true;
//        }
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb)
//        {
//            return true;
//        }
//        //столбцы
//        if (map[0][0] == symb  &&  map[1][0] == symb && map[2][0] == symb)
//        {
//            return true;
//        }
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb)
//        {
//            return true;
//        }
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb)
//        {
//            return true;
//        }
//        //Диагонали
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb)
//        {
//            return true;
//        }
//        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb)
//        {
//            return true;
//        }

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
