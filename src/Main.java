import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);

        System.out.print("Ange namn för din tamagotchi: ");
        String playerName = tb.nextLine();
        Tamagotchi player1 = new Tamagotchi(playerName);

        System.out.println("Ange ord att lära din tamagotchi: ");
        String word = tb.nextLine();
        player1.teach(word);


    }


}