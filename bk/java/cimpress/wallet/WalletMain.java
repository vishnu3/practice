import service.Service;
import service.Util;

public class WalletMain {
    public static void main(String[] args) throws Exception {
        String filePath = "c://lines.txt";
        Util util = new Util();
        Service service = new Service(util,filePath);
        service. readFileData();
    }
}
