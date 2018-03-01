package homework6;

public class InsertionSorting {
    public static void main(String[] args){
        int [] randomArrey = {0, 100, 99, 0, -77, 50, 7, 1};
        // объявляем переменные
        int i; // i - индекс элемента второго еще неотсортированного подмассива
        int j; // j - индекс элемента первого отсортированного подмассива
        int temp; // temp - временое хранилище для проверяемого элемента еще неотсортированного подмассива
        for (i = 1; i <randomArrey.length; i++)    // начинаем обход массива со второго элемента (первый элемент считаем отсортированным подмассивом)
        {
            temp = randomArrey[ i ]; // записываем проверяемый элемент массива во временное хранилище
            // сравниваем каждый элемент уже отсортированного подмассива с проверяемым элементом
            for(j = i - 1; (j >= 0) && (randomArrey[j] > temp); j--) {
                randomArrey[j+1] = randomArrey[j];
            }
            randomArrey[j+1] = temp;
        }
        for (i=0; i<randomArrey.length; i++){
            System.out.print(randomArrey[i]+"  ");
        }
    }
}