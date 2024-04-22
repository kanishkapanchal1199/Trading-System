package Model;

import Enums.OrderEventType;

public class OrderEvent {
    private OrderEventType type;
    private int amount;

    public OrderEvent(OrderEventType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public OrderEventType getType() {
        return type;
    }

    public void setType(OrderEventType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
