package Entities;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Teste da solução");
        
        TwoSum teste = new TwoSum();
        int[] result = teste.twoSum(new int[] {2,7,11,15}, 22);
        System.out.println("Teste: " + Arrays.toString(result));
        
    }

}