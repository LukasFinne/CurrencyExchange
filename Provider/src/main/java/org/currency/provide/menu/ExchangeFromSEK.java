package org.currency.provide.menu;

import org.currency.menu.Command;
import org.currency.provide.exchange.SEK;

import java.util.Scanner;

public class ExchangeFromSEK implements Command {


    private static double currentRate = 0;
    private final Scanner scanner = new Scanner(System.in);

    private final Command[] commands = new Command[3];
    public ExchangeFromSEK(){
        commands[1] = this::exchangeRate;
        commands[2] = () -> System.out.println(currentRate);
        commands[0] = this::shutdown;
    }

    private void exchangeRate(){
        String rate = scanner.next();
        SEK sek = new SEK();
        currentRate = sek.rate().get(rate);
    }

    public void shutdown(){
        System.exit(0);
    }
    private void printMenuOption(){
        System.out.println("----SEK----");
        System.out.println("1.CURRENCY");
        System.out.println("2.AMOUNT");
        System.out.println("3.CONVERT");
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

    private int readChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    @Override
    public void execute() {
        run();
    }
}
