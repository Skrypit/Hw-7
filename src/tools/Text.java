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

    public static void main(String[] args) {
        Text text = new Text();
        System.out.println("inputText = " + text.someTextInput());
    }


    @Override
    public String getColor(String colorName) {
        String colorOfTheTexts = colorName;
        return colorOfTheTexts;
    }
}

