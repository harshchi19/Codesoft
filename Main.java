import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    private BankAccount bankAccount;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        bankAccount = new BankAccount(1000.0); // Initial balance

        primaryStage.setTitle("ATM Machine");
        BorderPane borderPane = new BorderPane();

        // Create buttons and labels
        Button withdrawButton = new Button("Withdraw");
        Button depositButton = new Button("Deposit");
        Button balanceButton = new Button("Check Balance");
        Label balanceLabel = new Label("Balance: ₹" + bankAccount.getBalance()); // Rupee symbol

        // Create text field for amount input
        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount");

        // Define button actions
        withdrawButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (bankAccount.withdraw(amount)) {
                    balanceLabel.setText("Balance: ₹" + bankAccount.getBalance()); // Rupee symbol
                    showMessage("Withdrawal successful.");
                } else {
                    showMessage("Insufficient funds.");
                }
            } catch (NumberFormatException ex) {
                showMessage("Invalid input. Please enter a valid amount.");
            }
            amountField.clear();
        });

        depositButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                bankAccount.deposit(amount);
                balanceLabel.setText("Balance: ₹" + bankAccount.getBalance()); // Rupee symbol
                showMessage("Deposit successful.");
            } catch (NumberFormatException ex) {
                showMessage("Invalid input. Please enter a valid amount.");
            }
            amountField.clear();
        });

        balanceButton.setOnAction(e -> {
            // Display the current balance
            balanceLabel.setText("Balance: ₹" + bankAccount.getBalance()); // Rupee symbol
        });

        // Create a VBox for buttons
        VBox buttonBox = new VBox(10);
        buttonBox.getChildren().addAll(withdrawButton, depositButton, balanceButton, amountField);
        buttonBox.setPadding(new Insets(10, 10, 10, 10));

        // Add elements to the layout
        borderPane.setLeft(buttonBox);
        borderPane.setRight(balanceLabel);

        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("ATM Message");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
