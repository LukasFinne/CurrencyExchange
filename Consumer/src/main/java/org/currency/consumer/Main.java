package org.currency.consumer;

import org.currency.menu.Command;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Command> serviceLoader = ServiceLoader.load(Command.class);
        for (Command c : serviceLoader) {
            c.execute();
        }
    }
}
