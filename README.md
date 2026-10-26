# CS-145 Computer Science II (Java) Coursework

Coursework from **Spring 2024** at **UW-Stout**.

Programs from a Java course covering 2D arrays, classes and objects,
game logic, and inheritance with sorting.

## Contents

| Folder | Topic | Concepts practiced |
|--------|-------|--------------------|
| [`2DArrayLab/`](2DArrayLab) | Precipitation data analysis | 2D arrays, nested loops, row/column totals and averages, finding max/min, `printf` formatting |
| [`Game/`](Game) | `Game` class and driver | Instance variables, constructors, getters/setters, `toString()` |
| [`TicTacToe/`](TicTacToe) | Playable two-player Tic Tac Toe | Multiple classes working together, 2D `char` arrays, win/draw detection, console input with `Scanner` |
| [`StoutPerson/`](StoutPerson) | Class hierarchy of campus people | Inheritance, abstract classes, method overriding, `Comparable`, sorting arrays of objects |


## Project details

### 2DArrayLab
Stores five years of monthly precipitation in a 2D array, then prints a
table with yearly totals and monthly averages, plus the wettest and driest
months on record.

### Game
A `Game` class (title, genre, platform, cover art) with a driver that
creates objects and updates them through setters.

### TicTacToe
A two-player console game. `TicTacToeBoard` handles the grid and win
checks; `TicTacToe` handles turns, input validation, and the game loop.

### StoutPerson
An abstract `StoutPerson` base class with `Student`, `Instructor`, and
`SupplementalInstructor` subclasses. People are sorted by ID using
`compareTo`. All sample data in the driver is fictional.

## Notes

- Original assignment text is not included.

## Author

Christopher
