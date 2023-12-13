1. User table
Information about the library user:
- Matric No
- First Name
- Last Name
- Department
- Level
- Phone Number
- Email

1. Book Table
Information about the books in the library:
- ISBN
- Book Name
- Author
- SUBJECT
- library of congress identification 
- Availability status
- Number of copies
1. Borrowers table
Information about book borrowed:
- Borrow Unique Id
- Student Matric Number
- Libarian ID
- Book ISBN
- Borrowed date
- Return Date
- Borrow status
1. Libarian table
Information about librarian in charge
- Libarian ID
- First Name
- Last Name
- email
- phone number
- Shift(moring/afternoon)
1. Late-return table
Information about late returns:
- Unique Id
- Borrow unique Id
- Expected Return date
- actual return date
- fine
- fine-status (settled or pending)

---
# Schema
### User Table

| Field         | Data Type  | Constraints    |
|---------------|------------|-----------------|
| MatricNo      | VARCHAR(20)| PRIMARY KEY     |
| FirstName     | VARCHAR(50)|                 |
| LastName      | VARCHAR(50)|                 |
| Department   | VARCHAR(50)|                 |
| Level         | INT        |                 |
| PhoneNumber   | VARCHAR(15)|                 |
| Email         | VARCHAR(100)|                |

### Book Table

| Field                  | Data Type  | Constraints    |
|------------------------|------------|-----------------|
| ISBN                   | VARCHAR(20)| PRIMARY KEY     |
| BookName               | VARCHAR(100)|                |
| Author                 | VARCHAR(50)|                 |
| Subject                | VARCHAR(50)|                 |
| LibraryOfCongressID    | VARCHAR(20)|                 |
| AvailabilityStatus     | VARCHAR(20)|                 |
| NumberOfCopies        | INT        |                 |

### Borrowers Table

| Field             | Data Type  | Constraints                                   |
|-------------------|------------|-----------------------------------------------|
| BorrowUniqueID    | INT        | PRIMARY KEY                                   |
| StudentMatricNumber| VARCHAR(20)| FOREIGN KEY (StudentMatricNumber) REFERENCES User(MatricNo) |
| LibrarianID       | INT        | FOREIGN KEY (LibrarianID) REFERENCES Librarian(LibrarianID)|
| BookISBN          | VARCHAR(20)| FOREIGN KEY (BookISBN) REFERENCES Book(ISBN)    |
| BorrowedDate      | DATE       |                                               |
| ReturnDate        | DATE       |                                               |
| BorrowStatus      | VARCHAR(20)|                                               |

### Librarian Table

| Field         | Data Type  | Constraints    |
|---------------|------------|-----------------|
| LibrarianID   | INT        | PRIMARY KEY     |
| FirstName     | VARCHAR(50)|                 |
| LastName      | VARCHAR(50)|                 |
| Email         | VARCHAR(100)|                |
| PhoneNumber   | VARCHAR(15)|                 |
| Shift         | VARCHAR(20)|                 |

### Late-Return Table

| Field             | Data Type  | Constraints                                    |
|-------------------|------------|------------------------------------------------|
| UniqueID          | INT        | PRIMARY KEY                                    |
| BorrowUniqueID    | INT        | FOREIGN KEY (BorrowUniqueID) REFERENCES Borrowers(BorrowUniqueID)|
| ExpectedReturnDate | DATE       |                                                |
| ActualReturnDate   | DATE       |                                                |
| Fine              | DECIMAL(10, 2)|                                                |
| FineStatus        | VARCHAR(20)|                                                |


