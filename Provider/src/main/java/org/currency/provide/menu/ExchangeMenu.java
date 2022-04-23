package org.currency.provide.menu;

import org.currency.exchange.ExchangeRate;
import org.currency.menu.Command;
import org.currency.menu.ConsoleMenu;
import org.currency.provide.amount.Amount;
import org.currency.provide.convert.CurrencyConverter;

import java.util.Scanner;

@ConsoleMenu
public class ExchangeMenu implements Command {


    private static double currentRate = 0;
    private static double currentAmount = 0;
    private static double convertedAmount = 0;
    private String currency;
    private final Amount money = new Amount();
    private final CurrencyConverter converter = new CurrencyConverter();
    private final Scanner scanner = new Scanner(System.in);
    private final Command[] commands = new Command[4];
    private final ConsoleMenu menu = getClass().getAnnotation(ConsoleMenu.class);

    public ExchangeMenu(ExchangeRate exchange) {
        commands[1] = () -> exchangeRate(exchange);
        commands[2] = this::setAmount;
        commands[3] = this::convert;
        commands[0] = this::shutdown;
    }

    private void convert() {
        convertedAmount = converter.convert(currentAmount, currentRate);
    }

    private void exchangeRate(ExchangeRate exchange) {
        currency = scanner.next();
        currentRate = exchange.rate().get(currency);
        convertedAmount = 0;
    }

    private void setAmount() {
        double value = scanner.nextDouble();
        currentAmount = value;
        money.amount(value);
        convertedAmount = 0;
    }

    public void shutdown() {
        System.exit(0);
    }

    private void exchangeMenu() {
        System.out.println("CURRENT EXCHANGE: " + currency);
        System.out.println("CURRENT AMOUNT:" + currentAmount);
        System.out.println("RESULT: " + convertedAmount + " " + currency);
    }

    private void run() {
        int choice = 0;
        do {
            System.out.println(menu.exchangeMenuOption());
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
