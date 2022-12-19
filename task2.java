// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = FillRandomArray(10);
        
        lib.PrintArray(array);
        DeleteEvenNumber(array);

        lib.PrintArray(array);
    }
    
    public static ArrayList<Integer> FillRandomArray(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
         list.add((int)(Math.random()*100));
        }
        return list;
    }
    public static void DeleteEvenNumber(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}
