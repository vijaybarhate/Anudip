# Anudip

Java practice programs covering **Core Java**, **Collections**, **JDBC**, and **Array operations**.

## Programs

### Core Java (`core/`)
| Program | Description |
|---------|-------------|
| `Average.java` | Calculate average of 4 numbers |
| `Min_Max.java` | Find min and max from array |
| `Reverse_Array.java` | Print array in reverse order |
| `Static_Array.java` | Display hardcoded array elements |
| `Dynamic_Array.java` | Accept and display array from user input |
| `bubble_sort_ASC.java` | Bubble sort implementation |

### Array Lab Programs (`arrays/`)
| Program | Description |
|---------|-------------|
| `Array_Average.java` | User-defined array size + average |
| `Array_MaxElement.java` | Find maximum element from user input |
| `Array_SecondLargestThirdMin.java` | Sort array → second largest & third minimum |
| `Array_RemoveDuplicates.java` | Remove duplicates using ArrayList |

### Collections (`collections/`)
| Program | Description |
|---------|-------------|
| `Array_List1.java` | ArrayList with hardcoded employee names |
| `Array_List2.java` | ArrayList with user-defined size and loop input |
| `ShoppingCart.java` | Menu-driven cart — add, remove, view, checkout |
| `PlaylistManager.java` | Menu-driven playlist — add, remove, view songs |
| `BrowserHistory.java` | LinkedList as stack — visit pages, go back |
| `TrainWaitingList.java` | LinkedList as queue — FIFO passenger waiting list |

### JDBC & Database (`jdbc/`)
| Program | Description |
|---------|-------------|
| `CRUD.java` | Full CRUD operations on Employee table (`company` DB) |
| `Menu_Driven_Application.java` | Product management menu (`ProductDB` DB) |

## Prerequisites

- Java Development Kit (JDK) 8+
- MySQL Server (for JDBC programs)
- MySQL JDBC Driver (`mysql-connector-j-8.0.33.jar` included in `jdbc/`)

## Setup for JDBC Programs

1. Create the database and table:

   ```sql
   -- For CRUD.java
   CREATE DATABASE company;
   USE company;
   CREATE TABLE employee (
       eid INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255) NOT NULL,
       dept VARCHAR(100),
       sal DOUBLE
   );

   -- For Menu_Driven_Application.java
   CREATE DATABASE ProductDB;
   USE ProductDB;
   CREATE TABLE ProductInfo (
       pid INT PRIMARY KEY,
       pname VARCHAR(100),
       price DOUBLE,
       quantity INT
   );
   ```

2. Update database credentials in the respective `.java` files if your MySQL user/password differ.

## How to Run

### For any Java program:
```sh
javac FileName.java
java FileName
```

### Example — Run Shopping Cart:
```sh
javac collections/ShoppingCart.java
java -cp collections ShoppingCart
```

### Example — Run JDBC CRUD:
```sh
javac -cp jdbc/mysql-connector-j-8.0.33.jar jdbc/CRUD.java
java -cp jdbc;mysql-connector-j-8.0.33.jar CRUD
```

## Folder Structure

```
core/           — Basic Java programs (arrays, loops, sorting)
arrays/         — Array lab assignment programs
collections/    — ArrayList & LinkedList programs
jdbc/           — JDBC database connectivity programs
assets/         — Screenshots and flowchart images
```

## Notes

- All `.class` files are gitignored
- Lab documents (`.docx`) include actual terminal screenshots of program runs
- See `notes.md` for collection framework reference, hierarchy, array operations, and JDBC notes
