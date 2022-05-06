package org.currency.menu;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ConsoleMenu {
    String exchangeMenuOption() default " 1.CURRENCY \n 2.AMOUNT \n 3.CONVERT \n 0.EXIT";
}
