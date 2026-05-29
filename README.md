# Bookstore CLI Application

A console-based Java application for managing a bookstore inventory, performing sales, and tracking cash flow. This project demonstrates object-oriented programming concepts including inheritance, polymorphism, and interface implementation in Java 24.

## Features

*   **Inventory Management:**
    *   **Books:** Manage items with Title, Author, Price, and Copies.
    *   **Magazines:** Manage periodicals with Order Quantity and Issue Date.
    *   **Disc Magazines:** Specialized magazines that include a disc.
    *   **Tickets:** Simple saleable items with a description and price.
*   **CRUD Operations:** Add, Edit, and Delete items from the inventory.
*   **Sales System:** Sell items to decrement inventory count and increase the Cash Till total.
*   **Data Generation:** Uses `JavaFaker` to populate the inventory with realistic dummy data.
*   **Menu System:** Interactive console menu for navigation.

## Class Hierarchy

![Class Diagram](documentation/bookstore-2026-01-30-142617.png)

The hierarchy implements the following structure:
*   **SaleableItem (Interface):** Defines `sellItem()` and `getPrice()`.
*   **Editable (Abstract):** Handles console input/output and parsing.
*   **Publication:** Base class for Books and Magazines (Title, Price, Copies).

## Prerequisites

*   **Java JDK:** Version 24
*   **Maven:** 3.6+

## Dependencies

*   [JavaFaker](https://github.com/DiUS/java-faker) (1.0.2): For generating random test data.
*   [JUnit 5](https://junit.org/junit5/) (5.10.0): For unit testing.

## How to Run

1.  **Compile the project:**
    ```bash
    mvn clean compile
    ```

2.  **Run the application:**
    ```bash
    mvn exec:java -Dexec.mainClass="csd214.bookstore.Main"
    ```

## Usage

Upon starting, the application will populate the list with random data. You will see the following menu:

```text
***********************
 1. Add Items
 2. Edit Items
 3. Delete Items
 4. Sell item(s)
 5. List items
99. Quit
***********************
```

*   **Add Items:** Choose a specific type (Book, Magazine, etc.) and follow the prompts.
*   **Edit Items:** Select an index from the list to modify fields.
*   **Sell Items:** Select an index to sell. This decreases the 'Copies' count (for Publications) and adds the price to the internal Cash Till.

## Running Tests

Unit tests are implemented using JUnit 5 to verify the logic of POJOs and input mocking.

Run the tests using Maven:

```bash
mvn test
```

## Project Structure

```
src/
├── main/
│   └── java/
│       └── csd214/
│           └── bookstore/
│               ├── Main.java           # Entry point
│               ├── App.java            # Controller / Menu Logic
│               └── pojos/              # Data Models
│                   ├── Editable.java
│                   ├── SaleableItem.java
│                   ├── Product.java
│                   ├── Publication.java
│                   ├── Book.java
│                   ├── Magazine.java
│                   ├── DiscMag.java
│                   ├── Ticket.java
│                   └── CashTill.java
└── test/
    └── java/
        └── csd214/
            └── bookstore/
                └── pojos/              # Unit Tests
```


# Lab 1: Analysis — Skincare Niche

### 1. Problem Statement

My niche store specializes in skincare products designed for daily facial care.
The goal is to offer items that support hydration, cleansing, treatment, and sun protection.
Each product includes specific characteristics such as recommended skin type, active ingredients, and intended purpose.
The system must allow users to create, edit, list, and sell skincare items within the existing Product hierarchy.

### 2. Noun / Verb Table

> Nouns

Serum; Moisturizer; Sunscreen; SkinType; Ingredient; Brand; TreatmentLevel; PackagingSize;
> Verbs

hydrate; apply; absorb; protect; treat

### 3. Synonyms

Serum = Essence
Moisturizer = Cream

### 4. AI-Assisted Architectural Blueprint
I am a Java student building a system using a base class called 'Product'. I need to design a sub-hierarchy for a store that sells skincare products.
   Based on the principles of OO Analysis, please design:

An Abstract Class representing the category (e.g., SkincareProduct) that extends Product. It should have 1 unique field common to all items in this niche.

Two Concrete Classes (e.g., Serum, Moisturizer) that extend that abstract class. Each should have 1 unique field specific to them.
List the class names, their parent class, and their specific fields with data types."

### AI Response:

> Abstract Class:

SkincareProduct extends Product
Shared field: String skinType

> Concrete Classes:

### Implementation
Serum extends SkincareProduct
Unique field: String activeIngredient

Moisturizer extends SkincareProduct
Unique field: boolean oilFree

> SkincareProduct (Abstract Parent); Extends Product; Fields: skinType, price
Overrides: initialize(), edit(), toString()

> Serum (Concrete Child); Field: activeIngredient
Overrides: initialize(), edit(), sellItem()

> Moisturizer (Concrete Child); Field: oilFree
Overrides: initialize(), edit(), sellItem()

> Menu Integration; Added to Add, Edit, Delete, Sell, and List menus

### 6 How to Run the Project

> C:\Users\hanna\OneDrive\Documents\3th SEMESTER\CSD214_PRG CON\LAB1> `mvn exec:java -Dexec.mainClass=bookstore.Main`