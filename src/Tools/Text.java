package Tools;

import Interfaces.Colorable;

import java.util.Scanner;

public class Text implements Colorable, Cloneable {

    public String someTextInput() {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        scanner.close();
        return inputText;
    }

    public static void main(String[] args) {
        Text text = new Text();
        System.out.println("inputText = " + text.someTextInput());
    }

    @Override
    public String color() {
        String colorOfTheTexts = "is red";
        return colorOfTheTexts;
    }
}

class TextTest {
    public static void main(String[] args) {
        Text text = new Text();
        System.out.println("This text = " + text.color());
    }
}
