package lesson6;

public class PracticeBubbleSorting {
    public static void main(String[] args){
        boolean swapFlag = true; // проинициализируем флаг true для работы массива
        int tempInt; // Временная переменная для сохранения изменяемого элемента
        int[] intArrey = {3, 8, -11, 7, 10, 2, 0, 0, 0}; // инициализация массива, который будем сортировать
        while (swapFlag){ // начинаем процесс сортировки
            swapFlag = false; // Назначаем флаг false (мы его изменим если нужно будет еще выполнять цикл сортировки)
            for (int i = 0; i < intArrey.length-1; i++) { // начинаем перебор всех элементов массива
                if (intArrey[i] < intArrey[i + 1]) { // проверяем, что текущий элемент меньше, чем следующий
                    tempInt = intArrey[i]; // "сохраняем" значение текущего элемента массива
                    intArrey[i] = intArrey[i + 1]; // значение большего элемента записываем в текущий
                    intArrey[i + 1] = tempInt; // значение текущего элемента записываем в следующий (меняем местами)
                    swapFlag = true; // изменение массива произошло значит его еще можно сортировать. ставим true
                }
            }
        }
        for (int item : intArrey){
                System.out.println(item); // выводим в консоль результат сортировки
        }
    }
}
