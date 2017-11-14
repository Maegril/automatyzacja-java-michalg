import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Witaj świecie!");
        String typedString;

        do{
            System.out.println("Żeby zamknąć aplikację wpisz: 'exit' i naciśnij enter");
            typedString = keyboard.nextLine();
        }
        while (!typedString.equals("exit"));

    }
}
