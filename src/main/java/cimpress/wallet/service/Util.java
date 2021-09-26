package service;

public class Util {

    public String readOperationType(String data) {
        String[] operation = data.split(":");
        return operation[0];
    }

}
