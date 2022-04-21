package org.currency.provide.menu;

import org.currency.menu.Command;
import org.currency.provide.amount.Amount;
import org.currency.provide.convert.CurrencyConverter;
import org.currency.provide.exchange.SEK;

import java.util.Scanner;

public class ExchangeFromSEK implements Command {


    private static double currentRate = 0;
    private static double currentAmount = 0;

    private static double convertedAmount = 0;

    private final SEK exchange = new SEK();
    private final Amount sek = new Amount();

    private final CurrencyConverter converter = new CurrencyConverter();

    private final Scanner scanner = new Scanner(System.in);

    private final Command[] commands = new Command[4];
    public ExchangeFromSEK(){
        commands[1] = this::exchangeRate;
        commands[2] = this::setAmount;
        commands[3] = this::convert;
        commands[0] = this::shutdown;
    }

    private void convert(){
        convertedAmount = converter.convert(currentAmount,currentRate);
    }

    private void exchangeRate(){
        String currency = scanner.next();
        currentRate = exchange.rate().get(currency);
        convertedAmount = 0;
    }

    private void setAmount(){
        double value = scanner.nextDouble();
        currentAmount = value;
        sek.amount(value);
        convertedAmount = 0;
    }

    public void shutdown(){
        System.exit(0);
    }
    private void printMenuOption(){
        System.out.println("----SEK----");
        System.out.println("1.CURRENCY");
        System.out.println("2.AMOUNT");
        System.out.println("3.CONVERT ");
    }

    private void exchangeMenu(){
        System.out.print("CURRENT EXCHANGE:");
        exchange.rate().entrySet().stream().filter(e-> e.getValue().equals(currentRate)).forEach(System.out::print);
        System.out.println("");
        System.out.println("CURRENT AMOUNT:"+ currentAmount);
        System.out.println("Result: " + convertedAmount + " USD");
    }

    private void run() {
        int choice = 0;
        do {
            printMenuOption();
            exchangeMenu();
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
