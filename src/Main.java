import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);

        System.out.println("Ange ord att lära din tamagotchi: ");
        String word = tb.nextLine();
        Tamagotchi.teach(word);
    }


}