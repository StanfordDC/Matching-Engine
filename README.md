# Matching-Engine

A simple matching engine system that accepts and matches orders built using Java with **Singleton design pattern**

## Usage Overview
User can write commands to simulate submitting orders, viewing orders, and quoting stocks (New order types incoming)

## Order Types

- **Limit order** -> Order is executed with a price restriction

- **Market order** -> Order is executed without any price restriction

- **Immediate-Or-Cancel(IOC) order** -> Order is executed immediately, remaining quantity will be cancelled

- **Fill-Or-Kill(FOK) order** -> Order is executed as a whole quantity or none at all

- **Iceberg order** -> Order is executed only a portion of the quantity



## Functionalities
Use the command template provided to use the functions of the stock exchange.

#### Submit buy orders
- **Limit order** -> `BUY {STOCK_NAME} LMT ${PRICE} {QUANTITY}`

- **Market order** -> `BUY {STOCK_NAME} MKT {QUANTITY}`

- **Immediate-Or-Cancel(IOC) order** -> `BUY {STOCK_NAME} IOC ${PRICE} {QUANTITY}`

- **Fill-Or-Kill(FOK) order** -> `BUY {STOCK_NAME} FOK ${PRICE} {QUANTITY}`

- **Iceberg order** -> `BUY {STOCK_NAME} ICEBERG ${PRICE} {QUANTITY}`

#### Submit sell orders

- **Limit order** -> `SELL {STOCK_NAME} LMT ${PRICE} {QUANTITY}`

- **Market order** -> `SELL {STOCK_NAME} MKT {QUANTITY}`

- **Immediate-Or-Cancek(IOC) order** -> `SELL {STOCK_NAME} IOC ${PRICE} {QUANTITY}`

- **Fill-Or-Kill(FOK) order** -> `SELL {STOCK_NAME} FOK ${PRICE} {QUANTITY}`

- **Iceberg order** -> `SELL {STOCK_NAME} ICEBERG ${PRICE} {QUANTITY}`

#### Others

- **View submitted orders and their status** -> `VIEW ORDERS`

- **Quote orders** -> `QUOTE {STOCK_NAME}`

Order matching is executed automatically upon submitting.

## How to run

1. Clone the repository on local computer
2. Open the repository on an IDE and navigate to the repository folder on IDE terminal
3. Compile the code : `javac Main.java`
4. Run the code : `java Main` 
5. Commands are written on test.txt file and can be modified as required


