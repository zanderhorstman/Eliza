import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, who am I speaking with?");
        String name = keybd.nextLine();
        System.out.println("It's nice to meet you, " + name + ", how are you today?");
        String day = keybd.nextLine();
        System.out.println("Okay, what do you think is making you feel " + day + "?");
        String special = keybd.nextLine();
        String allAnswers = ("\n" + name + "\n" + day + "\n" + special);
        System.out.println("Well I gotta go! My time is up. See ya next time, " + name + "!\nYour answers were as follows:" + allAnswers);
    }
}
