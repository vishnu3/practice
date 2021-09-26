package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Service {
    private String filePath;
    private Util util;
    private List<String> fileData;

    public Service(Util util, String filePath) throws IOException {
        this.util = util;
        this.filePath = filePath;
    }

    public List<String> readFileData() throws Exception {
        fileData = (List<String>) Files.lines(Paths.get(this.filePath));
        return fileData;
    }

    public void DoTask(List<String> fileData) {

        for (String data : fileData) {
            String operationType = util.readOperationType(data);
            service.FactoryService.callService(operationType).task(data);
        }
    }

}
