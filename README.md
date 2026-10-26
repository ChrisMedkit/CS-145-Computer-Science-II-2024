# CS-145 Computer Science II (Java) Coursework

Coursework from **Spring 2024** at **UW-Stout**.

Programs from a Java course covering 2D arrays, classes and objects, game
logic, inheritance, interfaces, exceptions, file input, and linked lists.

## Contents

| Folder | Topic | Concepts practiced |
|--------|-------|--------------------|
| [`2DArrayLab/`](2DArrayLab) | Precipitation data analysis | 2D arrays, nested loops, row/column totals and averages, finding max/min, `printf` formatting |
| [`Car/`](Car) | Car inventory from a file | File input with `Scanner`, parsing CSV, `LinkedList`, filtering lists by make and year |
| [`EmailChecker/`](EmailChecker) | Email format validation | Custom exception class, `try`/`catch`, `throws`, string searching |
| [`Enemy/`](Enemy) | Game enemies with stomp damage | Interfaces and constants, `Comparable`, `ArrayList`, `Random`, sorting |
| [`Game/`](Game) | `Game` class and driver | Instance variables, constructors, getters/setters, `toString()` |
| [`InputInteger/`](InputInteger) | Safe integer input loop | `do`/`while` loops, input validation, avoiding division by zero |
| [`LinkedList/`](LinkedList) | Linked list built from scratch | Generics, nodes, head/tail pointers, list traversal |
| [`Retail/`](Retail) | Songs and movies as retail items | Abstract classes, inheritance, overloaded constructors, sorting with `Collections.sort` |
| [`StoutPerson/`](StoutPerson) | Class hierarchy of campus people | Inheritance, abstract classes, method overriding, `Comparable`, sorting arrays of objects |
| [`TicTacToe/`](TicTacToe) | Playable two-player Tic Tac Toe | Multiple classes working together, 2D `char` arrays, win/draw detection, console input |
| [`JavaFX Practice/`](JavaFXPractice) | Testing out features of JavaFX | Multiple class, input strings, image display, buttons, etc |
| [`Fifa Card Game/`](FifaCardGame) | Card Game with Fifa cards | Built an app to randomly give 2 players a formation of 7 players. The player with higher ratings wins. Custom player list, custom cards. |


## Requirements

- Java Development Kit (JDK) 11 or newer

## Project details

### 2DArrayLab
Stores five years of monthly precipitation in a 2D array, then prints a
table with yearly totals and monthly averages, plus the wettest and driest
months on record.

### Car
Reads about 1,000 cars (VIN, make, model, year) from `cars.txt` into a
`LinkedList<Car>`, then filters the list by make and by year range, such as
BMWs, cars from 1988 to 2003, and Fords from 2000 to 2009.

### EmailChecker
Prompts for email addresses and checks that each has an `@` followed by a
dot. Invalid addresses throw a custom `EmailFormatException`, which the
program catches and reports. Type `exit` to quit.

### Enemy
An `Enemy` class implementing the `Stompable` interface. Stomping reduces
health without going below zero, and enemies are sorted by health using
`compareTo`.

### Game
A `Game` class (title, genre, platform, cover art) with a driver that
creates objects and updates them through setters.

### InputInteger
Repeatedly asks for a score out of 100 and divides 100 by it. Handles
non-numeric input, out-of-range scores, and zero. Enter `-1` to exit.

### LinkedList
A generic singly linked list built from `Node<T>` objects, with `add` and
`printList` methods and a tester that fills and prints a list of integers.

### Retail
An abstract `RetailItem` base class with `Song` and `Movie` subclasses.
A mixed list of songs and movies is sorted by star rating.

### StoutPerson
An abstract `StoutPerson` base class with `Student`, `Instructor`, and
`SupplementalInstructor` subclasses. People are sorted by ID using
`compareTo`. All sample data in the driver is fictional.

### TicTacToe
A two-player console game. `TicTacToeBoard` handles the grid and win
checks; `TicTacToe` handles turns, input validation, and the game loop.

### JavaFX Practice
Messing around to make a deployable front end for different situations.
Fun starter use of JavaFX

### Fifa Card Game
Built a card game which acts like a roulette. This card game involves 
2 players where each player gets a shuffled formation of 7 players
The player with a higher total score of cards wins.

## Notes
- Original assignment text is not included.
  
## Author

Christopher Medina
