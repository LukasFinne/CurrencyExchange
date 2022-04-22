package org.currency.provide.menu;

import org.currency.menu.Command;
import org.currency.provide.exchange.SEK;

import java.util.Scanner;

public class Menu implements Command{
    private final Scanner scanner = new Scanner(System.in);
    private final Command[] commands = new Command[2];

    public Menu(){
        commands[1] = new ExchangeMenu(new SEK());
    }

    private void run() {
        int choice = 0;
        do {
            printMenuOption();
            choice = readChoice(scanner);
            executeChoice(choice);
        } while (choice != 0);
    }

    private void executeChoice(int choice) {
        commands[choice].execute();
    }


    private void printSEK(){
        System.out.println("SEK");
    }
    private int readChoice(Scanner scanner) {
        return scanner.nextInt();
    }
    private void printMenuOption(){
        System.out.println("Which Currency do you want to exchange from?");
        System.out.println("1.SEK");
    }


    @Override
    public void execute() {
        run();
    }
}
