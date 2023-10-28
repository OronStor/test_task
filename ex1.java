import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        System.out.println("Введите количество повторений");
        int reps = scanner.nextInt();
        if (reps<1){
            System.out.println(str);
            return;
        }

        for (int i=0;i<reps;i++){
            System.out.println(str);
        }
    }
}
