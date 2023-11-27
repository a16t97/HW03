import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static float  minValue = 1000; // задаем мин значение
    static float  maxValue = 1125; // задаем макс значение
    static Random rand = new Random();
    static float getRandomValue() {
        return minValue + rand.nextFloat(maxValue - minValue);
    }

    static void printArray(float[] arr) {

        System.out.println("*** do...while");
        int n = 0;
        do {
            System.out.println(n + " :: " + arr[n]);
            n++;
        } while (n < arr.length);

    }
    public static void main(String[] args) {
        String lineSeparator = System.lineSeparator(); // для корректности переноса символов на новую сроку вне зависимости от платформы
        int arrayLength = 44; // длин массива

        System.out.println("*** Bubble Sorting");


        float[] arrayToSort; // определяем массив
        arrayToSort = new float[arrayLength]; // выделяем память
        for (int c = 0; c < arrayLength; c++) { // заполняем данными
            arrayToSort[c] = getRandomValue();
        }
        System.out.println("*** Before sorting");
        printArray(arrayToSort);

        for (int c = 1; c < arrayToSort.length; c++) {
            for (int v = 0; v < c; v++) {
                if (arrayToSort[c] > arrayToSort[v]) {
                    var tmp = arrayToSort[c]; // временная переменная, куда мы будем класть данные при сортировке. var - само подставляет тип переменной в зависимости от того, что нам нужно (на случай, если тип поменяется)
                    arrayToSort[c] = arrayToSort[v];
                    arrayToSort[v] = tmp;
                }
            }
        }
        System.out.println("*** After starting");
        printArray(arrayToSort);
    }
}
