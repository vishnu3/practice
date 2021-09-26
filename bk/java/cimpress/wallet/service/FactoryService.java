package service;

import java.io.File;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FactoryService {

    public static Operation callService(String type){

        if(type == "Customer"){
          return new CustomerService();
        }
        if(type == "Order"){
            return new OrderService();

        }
        if(type == "Balance"){
           return new WalletService();
        }
        return null;

    }

}
