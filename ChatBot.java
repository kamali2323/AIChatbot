import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BotLogic bot = new BotLogic();

        System.out.println("===== AI CHATBOT =====");

        while(true) {

            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = bot.reply(userInput);

            System.out.println("Bot: " + response);

            if(userInput.equalsIgnoreCase("bye"))
                break;
        }

        sc.close();
    }
}