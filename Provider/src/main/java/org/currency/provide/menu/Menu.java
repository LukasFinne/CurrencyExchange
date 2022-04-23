package org.currency.provide.menu;

import org.currency.menu.Command;
import org.currency.menu.ConsoleMenu;
import org.currency.provide.exchange.EUR;
import org.currency.provide.exchange.SEK;
import org.currency.provide.exchange.USD;

import java.util.Scanner;

@ConsoleMenu
public class Menu implements Command{
    private final Scanner scanner = new Scanner(System.in);
    private final Command[] commands = new Command[4];
    private final ConsoleMenu menu = getClass().getAnnotation(ConsoleMenu.class);

    public Menu(){
        commands[1] = new ExchangeMenu(new SEK());
        commands[2] = new ExchangeMenu(new USD());
        commands[3] = new ExchangeMenu(new EUR());
        commands[0] = this::shutdown;
    }

    private void run() {
        int choice = 0;
        do {
            System.out.println(menu.currencyMenuOption());
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

    public void shutdown(){
        System.exit(0);
    }

    @Override
    public void execute() {
        run();
    }
}
