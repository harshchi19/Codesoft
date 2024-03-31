## TASK 1 
# JavaFX ATM Machine

This project implements a simple ATM Machine GUI using JavaFX. It allows users to withdraw, deposit, and check their balance. The application is designed with a clean and intuitive interface for ease of use.

## Task Description

This project is part of the Codsofe Internship Task 1. The goal is to create a basic ATM Machine application using JavaFX with the following functionalities:

- Withdraw money from the account
- Deposit money into the account
- Check the account balance

## Features

- **Withdraw Money**: Users can withdraw money from their account. If the withdrawal amount exceeds the account balance, an error message is displayed.
- **Deposit Money**: Users can deposit money into their account.
- **Check Balance**: Users can view their current account balance.
- **Input Validation**: The application performs basic input validation to ensure that only valid numeric amounts are entered.

## Requirements

- Java JDK 8 or later
- JavaFX SDK
- IntelliJ IDEA or any Java IDE of your choice

## How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your_username/javafx-atm-machine.git
   ```

2. **Open Project in IDE:**
   Open the project in your Java IDE (e.g., IntelliJ IDEA).

3. **Set Up JavaFX SDK:**
   Configure your IDE to use the JavaFX SDK. Refer to the IDE documentation for instructions.

4. **Run the Application:**
   Run the `Main.java` file. This will launch the JavaFX application.

## Usage

1. **Withdraw Money**:
   - Enter the amount you want to withdraw in the input field.
   - Click on the "Withdraw" button.
   - If the withdrawal is successful, a message indicating success is displayed. Otherwise, an error message is shown.

2. **Deposit Money**:
   - Enter the amount you want to deposit in the input field.
   - Click on the "Deposit" button.
   - A message indicating the success of the deposit operation is displayed.

3. **Check Balance**:
   - Click on the "Check Balance" button to view the current account balance.

# TASK 2
Here's a README file for your Codsoft Internship Task 2:

---

# Word Counter

This project implements a simple Word Counter program in Java. It allows users to count the total number of words in a text, either entered manually or provided via a file path. Additionally, it excludes certain stop words from the word count.

## Task Description

This project is part of the Codsoft Internship Task 2. The goal is to create a Word Counter program with the following functionalities:

- Count the total number of words in a given text.
- Exclude certain stop words (e.g., "the", "and", "in", "to", "of", "a") from the word count.
- Provide options to input text manually or via a file path.

## Features

- **Manual Text Input**: Users can enter text manually through the console.
- **File Input**: Users can provide a file path containing the text to be analyzed.
- **Stop Words Exclusion**: Certain common stop words are excluded from the word count.
- **Error Handling**: Proper error handling is implemented for file reading operations.

## Requirements

- Java JDK 8 or later

## How to Run

1. **Compile the Java File:**
   ```bash
   javac main(1).java
   ```

2. **Run the Program:**
   ```bash
   java main
   ```

3. **Follow On-Screen Instructions:**
   - Choose an option: enter text manually (1) or provide a file path (2).
   - If choosing option 1, type the text when prompted.
   - If choosing option 2, provide the file path when prompted.

## Usage

1. **Manual Text Input**:
   - Choose option 1 when prompted.
   - Enter the text manually when prompted.
   - The program will display the total word count excluding stop words.

2. **File Input**:
   - Choose option 2 when prompted.
   - Provide the file path containing the text to be analyzed.
   - The program will read the text from the file, count the words excluding stop words, and display the total word count.
  
# TASK 3
Here's a README file for your Codsoft Internship Task 3:

---

# Number Game

This project implements a simple Number Guessing Game in Java. The game randomly generates a target number within a specified range, and the player has a limited number of attempts to guess the correct number.

## Task Description

This project is part of the Codsoft Internship Task 3. The goal is to create a Number Guessing Game with the following functionalities:

- Generate a random target number within a predefined range.
- Allow the player to guess the number within a limited number of attempts.
- Provide feedback on whether the guess is too high or too low.
- Keep track of the player's score based on the number of correct guesses.

## Features

- **Random Number Generation**: The game generates a random target number within a specified range.
- **Limited Attempts**: Players have a limited number of attempts to guess the correct number.
- **Feedback**: Players receive feedback on whether their guess is too high or too low.
- **Score Tracking**: The game keeps track of the player's score based on the number of correct guesses.
- **Play Again Option**: After each round, players have the option to play again or exit the game.

## Requirements

- Java JDK 8 or later

## How to Run

1. **Compile the Java File:**
   ```bash
   javac mm.java
   ```

2. **Run the Program:**
   ```bash
   java mm
   ```

3. **Follow On-Screen Instructions:**
   - Guess a number within the specified range.
   - Receive feedback on each guess and attempt to guess the correct number.
   - Choose whether to play again or exit the game after each round.

## Usage

1. **Guessing the Number**:
   - Enter your guess when prompted.
   - Receive feedback on whether your guess is too high, too low, or correct.
   - Keep track of your attempts and try to guess the correct number within the limited attempts.

2. **Play Again**:
   - After each round, choose whether to play again or exit the game.
   - Your total score will be displayed when you choose to exit the game.


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
