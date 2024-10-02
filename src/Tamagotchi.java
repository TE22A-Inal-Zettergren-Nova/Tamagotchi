import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    private int hunger;
    private int boredom;
    private boolean isAlive;
    private ArrayList<String> words;
    private Random Generator = new Random();
    public String name;

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

    }

    public boolean getAlive(){
        return false;
    }

    private void reduceBoredom(){
        boredom = boredom - 1;
    }
}
