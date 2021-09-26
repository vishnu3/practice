package cache;

import pojo.Order;

import java.util.HashMap;
import java.util.LinkedList;

public class OrderHistory {
    private HashMap<String, LinkedList<Order>> orderList = new HashMap<>();


    public HashMap<String, LinkedList<Order>> getOrderList() {
        return orderList;
    }
}
