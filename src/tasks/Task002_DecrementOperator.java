package tasks;

public class Task002_DecrementOperator {
    public static void main(String[] args) {
        int a= 10;
        int b= a-- - --a + a--;

        System.out.printf("Value of a= %d",a);
        System.out.printf("\nValue of b= %d",b);
    }
}