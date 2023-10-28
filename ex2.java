import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество повторений");
        int reps = scanner.nextInt();

        System.out.println("Сколько литров пива за раз?");
        int liters = scanner.nextInt();

        if (liters<=0 || reps<=0){
            System.out.println("Введены некорректные данные");
            return;
        }

        int sum = 0;
        for (int i=1;i<=16;i++){
            sum+=liters*reps;
            System.out.println("К " + i + " неделе будет выпито " + sum + " литров жидкости");
        }

        if (sum>=120) {
            System.out.println("Студент принят в IT-клуб");
        } else {
            System.out.println("К сожалению, студент не принят в клуб");
        }
    }
}
