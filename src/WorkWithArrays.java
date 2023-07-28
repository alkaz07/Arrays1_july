import java.util.Arrays;
import java.util.Scanner;

public class WorkWithArrays {
    //1) сгенерировать массив заданной длины из случайных чисел от 0 до 99
    //2) найти номер минимального элемента в массиве
    //3) найти разность между максимальным и минимальным элементами
    //4) найти среднее арифметическое элементов массива
    //5) найти номер элемента, значение которого равно x
    //6) найти, сколько раз в массиве встречается число x
    //7) отфильтровать массив, сделав новый массив, содержащий элементы исходного массива,
    //   значения которых в интервале от p до q
    //8) найти значение элемента массива, максимально близкое к числу x




    public static void main(String[] args) {
        int ar1[] = inputArray();
        //System.out.println(Arrays.toString(ar1)); // вывод с помощью библиотечной функции преобразования массива интов в строку
        outputArray(ar1);
    }

    //ввести массив произвольной длины
    static int[] inputArray()
    {
        System.out.println("какой длины массив изволите?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int massiv[] = new int[size];   // выделяем в куче место под size целых чисел
                                        // и присваиваем адрес начальной ячейки в ссылочную
                                        // переменную massiv
        System.out.println("Вводите элементы массива");
        for (int i = 0; i < size; i++) {
            massiv[i] = scanner.nextInt();
        }
        return massiv;
    }

    static void outputArray(int massiv[])
    {
        System.out.print("Массив: ");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(" " + massiv[i]);
        }
        System.out.println(";");
    }


}