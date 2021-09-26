package service;

public class FactoryService {

    public static Operation callService(String type) {

        if (type == "Customer") {
            return new service.CustomerService();
        }
        if (type == "Order") {
            return new service.OrderService();

        }
        if (type == "Balance") {
            return new service.WalletService();
        }
        return null;

    }

}
