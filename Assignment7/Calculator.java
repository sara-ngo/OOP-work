import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Calculator extends Application {
    private TextField textField;
    private final String[] btnLabels = {
            "Del", "", "%",
            "7", "8", "9",
            "4", "5", "6",
            "1", "2", "3",
            "AC", "0", "."
    };
    private final String[] opnLabels = {"+", "-", "*", "/", "="};

    // For computation
    private String input = "0";
    private double result = 0.00;
    private char lastOperator = ' ';

    // Setup the UI
    @Override
    public void start(Stage stage) {
        textField = new TextField("0");
        textField.setEditable(false);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setMinSize(200, 90);
        textField.setStyle("-fx-font-size: 30");
        textField.setBackground(new Background(new BackgroundFill(
                Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));

        // for btnLabels
        int numCols = 3;
        GridPane paneButton = new GridPane();
        paneButton.setPadding(new Insets(0, 0, 0, 0));

        ColumnConstraints[] columns = new ColumnConstraints[numCols];
        for (int i = 0; i < numCols; ++i) {
            columns[i] = new ColumnConstraints();
            columns[i].setFillWidth(true);
            columns[i].setHgrow(Priority.ALWAYS);
            paneButton.getColumnConstraints().add(columns[i]);
        }

        Button[] btn = new Button[15];
        for (int i = 0; i < btn.length; ++i) {
            btn[i] = new Button(btnLabels[i]);
            btn[i].setMinSize(60, 50);
            btn[i].setBackground(new Background(new BackgroundFill(
                    Color.LIGHTPINK, CornerRadii.EMPTY, Insets.EMPTY)));
            btn[i].setStyle("-fx-font-size: 20");
            btn[i].setOnAction(handler);
            paneButton.add(btn[i], i % numCols, i / numCols);  // control, col, row
        }

        // for opnLabels
        VBox opnButton = new VBox();
        opnButton.setPadding(new Insets(0, 0, 0, 0));

        Button[] opn = new Button[5];
        for (int i = 0; i < opn.length; ++i) {
            opn[i] = new Button(opnLabels[i]);
            opn[i].setMinSize(60, 50);
            opn[i].setBackground(new Background(new BackgroundFill(
                    Color.LIGHTCORAL, CornerRadii.EMPTY, Insets.EMPTY)));
            opn[i].setStyle("-fx-font-size: 20");
            opn[i].setOnAction(handler);
            opnButton.getChildren().add(opn[i]);
        }

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(0, 0, 0, 0));
        root.setTop(textField);
        root.setCenter(paneButton);
        root.setRight(opnButton);
        stage.setScene(new Scene(root, 240, 340));
        stage.setTitle("JavaFX Calculator");
        stage.show();
    }

    EventHandler<ActionEvent> handler = e -> {
        String currentBtnLabel = ((Button) e.getSource()).getText();
        switch (currentBtnLabel) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                if (input.equals("0")) {
                    input = currentBtnLabel;
                } else {
                    input += currentBtnLabel;
                }
                textField.setText(input);
                if (lastOperator == '=') {
                    result = 0;
                    lastOperator = ' ';
                }
                break;
            case "+":
                compute();
                lastOperator = '+';
                break;
            case "-":
                compute();
                lastOperator = '-';
                break;
            case "x":
                compute();
                lastOperator = '*';
                break;
            case "/":
                compute();
                lastOperator = '/';
                break;
            case "=":
                compute();
                lastOperator = '=';
                break;
            case "%":
                compute();
                lastOperator = '%';
                break;
            case "AC":
                result = 0;
                input = "0";
                lastOperator = ' ';
                textField.setText("0");
                break;
            case "Del":
                textField.setText(textField.getText(0, textField.getText().length() - 1));
                if (textField.getLength() == 0) {
                    result = 0;
                    input = "0";
                    textField.setText("0");
                }
                break;
            case ".":
                input += ".";
                textField.setText(input);
                break;
        }
    };

    private void compute() {
        double inNum = Double.parseDouble(input);
        input = "0";
        if (lastOperator == ' ') {
            result = inNum;
        } else if (lastOperator == '+') {
            result += inNum;
        } else if (lastOperator == '-') {
            result -= inNum;
        } else if (lastOperator == '*') {
            result *= inNum;
        } else if (lastOperator == '/') {
            result /= inNum;
        } else if (lastOperator == '%') {
            result = inNum % result;
        } else if (lastOperator == '=') {

        }
        textField.setText(result + "");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
