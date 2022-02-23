package Files;

public class MathOperations {
    public static int sum(int[] array){
        int sum = 0;
        for(int elem:array)
            sum+=elem;
        return sum;
    }
    public static int max(int[] array){
        int max = array[0];
        for(int elem:array)
            if(elem>max)
                max = elem;
        return max;
    }
    public static int min(int[] array){
        int min = array[0];
        for(int elem:array)
            if(elem<min)
                min = elem;
        return min;
    }
}
