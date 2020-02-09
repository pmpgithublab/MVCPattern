package mvc_pattern;

import java.util.Scanner;

public class Controller {
    private static final String HELLO = "Hello";
    private static final String JAVA = "Java!";
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void getHelloJava() {
        Scanner scanner = new Scanner(System.in);

        view.ShowMessage(model.combineTwoStrings(getInputString(scanner, HELLO), getInputString(scanner, JAVA)));

        scanner.close();

    }

    private String getInputString(Scanner scanner, String require){
        view.ShowMessage(view.INPUT_DATA + require);

        while (!scanner.hasNext(require)) {
            view.ShowMessage(view.WRONG_INPUT_DATA);
            scanner.next();
        }
        return scanner.next();

    }
}
