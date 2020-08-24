import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String name;
        String day;
        String special; //Indicated here as special, this refers to new, critical
                        //information that sticks out on the mind of users.

        System.out.println("Welcome to ZBot! My name is Z, who am I speaking with?");
        name = keybd.nextLine();
        System.out.print("It's nice to meet you, " + name);
        System.out.println(", how are ya today?");
        day = keybd.nextLine();
        System.out.println("Okay, well did anything special or unexpected happen today?");
        special = keybd.nextLine();
        System.out.print("Hmmm... well '" + special);
        System.out.println("' is fine.");
        System.out.print("Oh, dang I'm outta time! My wife found my Internet history, I'm-I'm... I'm screwed! Talk to ya next time, " + name);
        System.out.println(".");
        System.out.println("This conversation has been terminated.\n\nYour Responses were as follows, in this order:\n" + name );
        System.out.println(""+ day);
        System.out.println(""+ special);
        System.out.println("\n\nPlease Come chat with ZBot again! I don't say much, but I'm oiginal!");

    }
}
