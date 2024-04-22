import Enums.OrderEventType;
import Model.OrderEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Orders.OrderStateDeterminer.printOrderState;

public class OrderStateMainWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderEvent> events = new ArrayList<>();
        while (true) {
            System.out.print("Enter order event type (ORDER_REQUESTED/ORDER_EXECUTED/ORDER_CANCELLED) or 'done' to finish: ");
            String eventTypeInput = scanner.nextLine().toUpperCase();
            if (eventTypeInput.equals("DONE")) {
                break;
            }
            OrderEventType eventType = null;
            try {
                eventType = OrderEventType.valueOf(eventTypeInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter 'ORDER_REQUESTED', 'ORDER_EXECUTED', 'ORDER_CANCELLED', or 'done'.");
                continue;
            }
            int amount;
            while (true) {
                System.out.print("Enter order amount: ");
                amount = scanner.nextInt();
                scanner.nextLine();

                if (amount < 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                } else {
                    break;
                }
            }
            events.add(new OrderEvent(eventType, amount));
        }
        printOrderState("User Input Events", events);
    }
}

