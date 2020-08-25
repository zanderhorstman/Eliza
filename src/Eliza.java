import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String name;
        String day;
        String special;

        System.out.println("Welcome to ZBot! My name is Z, who am I speaking with?");
        name = keybd.nextLine();
        System.out.print("It's nice to meet you, " + name);
        System.out.println(", how are ya today?");
        day = keybd.nextLine();
        System.out.println("Okay, well did anything special or unexpected happen today?");
        special = keybd.nextLine();
        System.out.print("Hmmm... well '" + special);
        System.out.println("' is fine.\nOh, dang I'm outta time! Talk to ya next time, " + name);
        System.out.println(".\nThis conversation has been terminated.\n\nYour Responses were as follows, in this order:\n" + name );
        System.out.println(""+ day);
        System.out.println(""+ special);
        System.out.println("\n\nPlease Come chat with ZBot again! I don't say much, but I'm original!");

    }
}
