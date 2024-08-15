# ATM System Design

## Overview

This project simulates an ATM system using Java. It demonstrates key Object-Oriented (OO) principles such as inheritance and encapsulation, while also implementing exception handling. The system supports basic ATM functionalities like depositing and withdrawing money, checking the balance, and handling errors effectively.

## Key Components

### ATM Class
- **Purpose**: Manages the account balance and provides methods for balance manipulation.
- **Methods**:
    - `getAccountBalance()`: Returns the current balance.
    - `addMoney(int amountToBeDeposited)`: Adds the specified amount to the balance.
    - `deductMoney(int amountToBeWithDrawn)`: Deducts the specified amount from the balance.

### StateBankOfIndia Class
- **Purpose**: Extends `ATM` to handle user interactions and specific ATM operations.
- **Methods**:
    - `initialize()`: Manages user menu for deposit, withdrawal, balance check, and exit options.
    - `isValidAmount(int inputAmount)`: Validates if the amount is greater than zero.
    - `checkBalance()`: Displays the current account balance.
    - `withDrawAmount(int inputAmount)`: Withdraws the amount and updates the balance.
    - `depositAmount(int inputAmount)`: Deposits the amount and updates the balance.

### Main Class
- **Purpose**: Entry point of the application.
- **Methods**:
    - `main(String[] args)`: Creates an instance of `StateBankOfIndia` and starts the ATM system.

### Exception Classes
- **InvalidAmountException**: Custom exception for invalid input amounts.
- **InsufficientBalanceException**: Custom exception for insufficient balance scenarios.

## Design Principles

- **Encapsulation**: The `ATM` class encapsulates account balance and exposes methods to interact with it.
- **Inheritance**: `StateBankOfIndia` inherits from `ATM`, extending its functionality for ATM-specific operations.
- **Exception Handling**: Custom exceptions handle specific error conditions, providing meaningful feedback to users.
- **Code Redundancy Avoidance**: Common functionalities are abstracted into methods to reduce duplication and enhance maintainability.

