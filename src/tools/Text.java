package tools;

import interfaces.Cloneable;
import interfaces.Colorable;

import java.util.Scanner;

public class Text implements Colorable, Cloneable {

    public static String someTextInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть Ваш текст");
        String inputText = scanner.nextLine();

        scanner.close();
        return inputText;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String setColor(String colorName) {
        return colorName;
    }

    public static void main(String[] args) {

        System.out.println("inputText = " + someTextInput());
    }

}

