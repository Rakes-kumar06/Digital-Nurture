CREATE TABLE Accounts(
    account_id NUMBER PRIMARY KEY,
    account_type VARCHAR2(20),
    balance NUMBER
);

CREATE TABLE Employees(
    emp_id NUMBER PRIMARY KEY,
    department VARCHAR2(50),
    salary NUMBER
);

INSERT INTO Accounts VALUES (101, 'Savings', 5000);
INSERT INTO Accounts VALUES (102, 'Checking', 2000);
INSERT INTO Accounts VALUES (103, 'Savings', 10000);

INSERT INTO Employees VALUES (1, 'IT', 60000);
INSERT INTO Employees VALUES (2, 'HR', 50000);
INSERT INTO Employees VALUES (3, 'IT', 75000);
COMMIT;