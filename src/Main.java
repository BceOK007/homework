import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         * */
        int[] arrayForFirstTask = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Задача №1.\nИсходный массив:   " + Arrays.toString(arrayForFirstTask));

        for (int i = 0; i < arrayForFirstTask.length; i++)
        {
            if (arrayForFirstTask[i] == 0)
                arrayForFirstTask[i] = 1;
            else
                arrayForFirstTask[i] = 0;
        }

        System.out.println("Полученный массив: " + Arrays.toString(arrayForFirstTask) + "\n");

        /*2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         * */
        int[] arrayForSecondTask = new int[8];

        for (int i = 0; i < arrayForSecondTask.length; i++)
        {
            arrayForSecondTask[i] = i * 3;
        }

        System.out.println("Задача №2.\n" + Arrays.toString(arrayForSecondTask) + "\n");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//        int[] arrayForThirdTask = new int[12];
//        arrayForThirdTask[0] = 1;
//        arrayForThirdTask[1] = 5;
//        arrayForThirdTask[2] = 3;
//        arrayForThirdTask[3] = 2;
//        arrayForThirdTask[4] = 11;
//        arrayForThirdTask[5] = 4;
//        arrayForThirdTask[6] = 5;
//        arrayForThirdTask[7] = 2;
//        arrayForThirdTask[8] = 4;
//        arrayForThirdTask[9] = 8;
//        arrayForThirdTask[10] = 9;
//        arrayForThirdTask[11] = 1;
        int[] arrayForThirdTask =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Задача №3.\nИсходный массив:   " + Arrays.toString(arrayForThirdTask));

        for (int i = 0; i < arrayForThirdTask.length; i++)
        {
            if (arrayForThirdTask[i] < 6 )
                arrayForThirdTask[i] = arrayForThirdTask[i] * 2;
        }

        System.out.println("Полученный массив: " + Arrays.toString(arrayForThirdTask) + "\n");

        /*
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         * */

        int arrayLength = 5;
        int[][] arrayForFourthTask = new int[arrayLength][arrayLength];

        for (int i = 0; i < arrayForFourthTask.length; i++)
        {
            for (int j = 0; j < arrayForFourthTask[i].length; j++)
            {
                if (i == j || j + i == arrayForFourthTask.length - 1)
                    arrayForFourthTask[i][j] = 1;
            }
        }

        System.out.println("Задача №4.");

        for (int i = 0; i < arrayForFourthTask.length; i++)
        {
            for (int j = 0; j < arrayForFourthTask[i].length; j++)
            {
                System.out.print(arrayForFourthTask[i][j] + " ");
            }
            System.out.println();
        }

        /*
         *5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
         * */
        int[] arrayForFifthTask = new int[10];

        for (int i = 0; i < arrayForFifthTask.length; i++)
        {
            arrayForFifthTask[i] = (int) (Math.random() * 100);
        }

        int minPosition = 0;
        int maxPosition = 0;

        System.out.print("\nЗадача №5\nИсходный массив: ");

        for (int i = 0; i < arrayForFifthTask.length; i++)
        {
            System.out.print(arrayForFifthTask[i] + " ");
            if (arrayForFifthTask[minPosition] > arrayForFifthTask[i])
                minPosition = i;
            if (arrayForFifthTask[maxPosition] < arrayForFifthTask[i])
                maxPosition = i;
        }

        System.out.println("\nМинимальный элемент массива [" + (minPosition + 1) + "] = " + arrayForFifthTask[minPosition]);
        System.out.println("Максимальный элемент массива [" + (maxPosition + 1) + "] = " + arrayForFifthTask[maxPosition] + "\n");

        /*
         *6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
         * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
         * граница показана символами ||, эти символы в массив не входят.
         * */
        int[] arrayForSixthTask = {1, 2, 2, 2, 1, 2, 2, 10, 1, 1};

        System.out.println("Задача №6\nВ массиве есть две части, суммы которых равны? " +isCheckBalance(arrayForSixthTask));
        System.out.println( Arrays.toString(arrayForSixthTask) + "\n");

        /*
         *7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
         * или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
         * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
         * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
         * При каком n в какую сторону сдвиг можете выбирать сами.
         * */

        int[] arrayForSeventhTask = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10, 11};

        System.out.println("Задача №7\nИсходный массив:   " + Arrays.toString(arrayForSeventhTask));
        shiftArray(arrayForSeventhTask, -3);
        System.out.println("Полученный массив: " + Arrays.toString(arrayForSeventhTask));
    }

    static boolean isCheckBalance (int[] arr)
    {
        boolean isFound = false;
        int sumFirstPath = 0;
        int sumSecondPath = 0;

        for (int i = 2; i < arr.length - 1; i++)
        {
            sumFirstPath = 0;
            sumSecondPath = 0;

            for (int j = 0; j < i; j++)
            {
                sumFirstPath = sumFirstPath + arr[j];
            }

            for (int l = i; l < arr.length; l++)
            {
                sumSecondPath = sumSecondPath + arr[l];
            }

            if (sumFirstPath == sumSecondPath)
            {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    static void shiftArray (int[] arr, int n)
    {
        //отсекаем полные обороты, если кол-во шагов сдвига больше размера массива
        if ( Math.abs(n) >= arr.length)
            n = n % arr.length;

        int a;

        for (int i = 0; i < Math.abs(n); i++) //Универсальный цикл для левого или правого сдвига
        {
            if (n > 0) { //Для правого - двигаем массив с конца
                a = arr[arr.length - 1];//запоминаем последний элемент для записи его в первый элемент
                for (int j = arr.length - 1; j > 0; j--)
                {
                    arr[j] = arr[j - 1];
                }
//                System.arraycopy(arr, 0, arr, 1, arr.length - 1);
                arr[0] = a;
            }
            else
            { //Для левого - двигаем массив с начала
                a = arr[0]; //запоминаем первый элемент для записи его в последний элемент
                for (int j = 0; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j + 1];
                }
//                System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                arr[arr.length - 1] = a;

            }
        }
    }

}