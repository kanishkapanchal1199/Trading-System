# Trading-System
-------------------------------------------------------
## Technology Stack Used : Java17

-------------------------------------------------------

## **Assumptions :** 
1. Here Assumption is User is going to input the Event in Chronological order 
eg: ORDER_REQUESTED, ORDER_EXECUTED, ORDER_CANCELLED.
2. Amount will be always a positive value.

------------------------------------------------------

## **Objective of classes :**

**OrderEventType** - This is ENUM which consists of order event type ORDER_REQUESTED,
ORDER_EXECUTED,
ORDER_CANCELLED.

**OrderState** - This is ENUM which consists order state NEW,
FILLED,
PARTIALLY_FILLED,
CANCELLED ,
NONE,
OVERFILLED

**OrderEvent** - This is the OrderEvent model which consist two properties OrderEventType and amount.

**OrderStateDeterminer** - This is the class which have static determineOrderState()
 method which accepts list of orderEventType as and argument.

**OrderStateMain** - This is the main class from which has statically defined input of the order event type and order amount and based on that Order state will be printed on the console.

**OrderStateMainWithScanner** - This is the main class from which user can input the order event type and order amount and based on that Order state will be printed on the console.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**NOTE : THERE ARE TWO MAIN CLASS TO EXECUTE THIS PROGRAM ** 
1. With OrderStateMain class which has statically values entered.
2. With OrderStateMainScanner class which has dynamically values entered through console.


## **Example to input through scanner :**

Enter order event type (ORDER_REQUESTED/ORDER_EXECUTED/ORDER_CANCELLED) or 'done' to finish: ORDER_REQUESTED<br/>
Enter order amount: 3<br/>
Enter order event type (ORDER_REQUESTED/ORDER_EXECUTED/ORDER_CANCELLED) or 'done' to finish: ORDER_EXCUTED<br/>
Invalid input. Please enter 'ORDER_REQUESTED', 'ORDER_EXECUTED', 'ORDER_CANCELLED', or 'done'.<br/>
Enter order event type (ORDER_REQUESTED/ORDER_EXECUTED/ORDER_CANCELLED) or 'done' to finish: ORDER_EXECUTED<br/>
Enter order amount: 3<br/>
Enter order event type (ORDER_REQUESTED/ORDER_EXECUTED/ORDER_CANCELLED) or 'done' to finish: ORDER_EXECUTED<br/>
Enter order amount: 2<br/>
Enter order event type (ORDER_REQUESTED/ORDER_EXECUTED/ORDER_CANCELLED) or 'done' to finish: done<br/>
Order state for User Input Events:<br/>
----------------------------------------------<br/>
Event: ORDER_REQUESTED, Amount: 3<br/>
Event: ORDER_EXECUTED, Amount: 3<br/>
Event: ORDER_EXECUTED, Amount: 2<br/>
Order state: OVERFILLED<br/>
