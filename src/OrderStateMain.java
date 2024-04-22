import Enums.OrderEventType;
import Model.OrderEvent;
import java.util.List;
import static Orders.OrderStateDeterminer.printOrderState;

public class OrderStateMain {
    public static void main(String[] args) {

        List<OrderEvent> events = List.of(
                new OrderEvent(OrderEventType.ORDER_REQUESTED, 3) //NEW
        );

        List<OrderEvent> events1 = List.of(
                new OrderEvent(OrderEventType.ORDER_REQUESTED, 3), //Filled
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 3)
        );

        List<OrderEvent> events2 = List.of(
                new OrderEvent(OrderEventType.ORDER_REQUESTED, 3),//OverFilled
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 1),
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 2),
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 2)
        );

        List<OrderEvent> events3 = List.of(
                new OrderEvent(OrderEventType.ORDER_REQUESTED, 3),//Partially Filled
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 1),
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 1)
        );

        List<OrderEvent> events4 = List.of(
                new OrderEvent(OrderEventType.ORDER_REQUESTED, 3),//Cancelled
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 1),
                new OrderEvent(OrderEventType.ORDER_EXECUTED, 1),
                new OrderEvent(OrderEventType.ORDER_CANCELLED, 0)
        );


        List<OrderEvent> events5 = List.of(
                new OrderEvent(OrderEventType.ORDER_REQUESTED, 3),//Cancelled
                new OrderEvent(OrderEventType.ORDER_CANCELLED, 0)
        );

        printOrderState("events", events);
        printOrderState("events1", events1);
        printOrderState("events2", events2);
        printOrderState("events3", events3);
        printOrderState("events4", events4);
        printOrderState("events5", events5);
    }
}

