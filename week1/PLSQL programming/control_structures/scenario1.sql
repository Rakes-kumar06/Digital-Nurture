CREATE TABLE Customers(
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    age NUMBER,
    balance NUMBER,
    is_vip VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE Loans(
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    interest_rate NUMBER,
    due_date DATE
);

INSERT INTO Customers VALUES (1, 'Alice', 65, 5000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Bob', 45, 15000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Charlie', 70, 12000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 5.5, SYSDATE + 15);
INSERT INTO Loans VALUES (102, 2, 4.0, SYSDATE + 45);
INSERT INTO Loans VALUES (103, 3, 6.0, SYSDATE + 10);
COMMIT;

BEGIN
    FOR customer IN (SELECT customer_id, customer_name, age FROM Customers) LOOP
        IF customer.age >= 60 THEN
            
            UPDATE Loans
            SET interest_rate = interest_rate - 1
            WHERE customer_id = customer.customer_id;

            DBMS_OUTPUT.PUT_LINE('Customer ' || customer.customer_name || ' is eligible for a reduced interest rate.');
        END IF;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Scenario 1 completed');
    
END;
