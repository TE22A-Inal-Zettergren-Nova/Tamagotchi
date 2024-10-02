import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    private int hunger = 0;
    private int boredom = 0;
    private boolean isAlive = true;
    private ArrayList<String> words;
    private Random Generator = new Random();
    public String name;

    //constructor
    public Tamagotchi(String incomingName) {
        name = incomingName;

    }

    public void tick(){
        hunger += 1;
        boredom += 1;
        if(hunger > 10 || boredom >= 10){
            isAlive = false;
        }
    }

    public void feed(){
        hunger -= 1;
    }

    public void speak(){
        System.out.println();
    }

    public void teach(String word){
        words.add(word);
    }

    public void printStats(){
        System.out.println("Name: " + name);
        System.out.println("Hunger: " + hunger);
        System.out.println("Boredom: " + boredom);
    }

    public boolean getAlive(){
        return false;
    }

    private void reduceBoredom(){
        boredom = boredom - 1;
    }
}
