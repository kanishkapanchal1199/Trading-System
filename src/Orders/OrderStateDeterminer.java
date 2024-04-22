package Orders;

import Enums.OrderState;
import Model.OrderEvent;
import java.util.List;

public class OrderStateDeterminer {

    public static OrderState determineOrderState(List<OrderEvent> events) {
        OrderState state = OrderState.NONE;
        int requestedAmount = 0;
        int executedAmount = 0;

        for (OrderEvent event : events) {
            switch (event.getType()) {
                case ORDER_REQUESTED:
                    requestedAmount = event.getAmount();
                    state=OrderState.NEW;
                    break;
                case ORDER_EXECUTED:
                    executedAmount += event.getAmount();
                    if (executedAmount == requestedAmount) {
                        state = OrderState.FILLED;
                    } else if (executedAmount < requestedAmount) {
                        state = OrderState.PARTIALLY_FILLED;
                    }
                    else {
                        state = OrderState.OVERFILLED;
                    }
                    break;
                case ORDER_CANCELLED:
                    state = OrderState.CANCELLED;
                    break;
            }
        }

        return state;
    }

    public static void printOrderState(String eventName, List<OrderEvent> events) {
        System.out.println("Order state for " + eventName + ": ");
        System.out.println("----------------------------------------------");
        for (OrderEvent event : events) {
            System.out.println("Event: " + event.getType() + ", Amount: " + event.getAmount());
        }
        System.out.println("Order state: " + OrderStateDeterminer.determineOrderState(events));
        System.out.println();
    }
}
