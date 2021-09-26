package programs;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(101, "x", 1.0));
        list.add(new Book(201, "x", 2.0));
        list.add(new Book(301, "c", 3.0));
        list.add(new Book(401, "c", 3.2));
        list.add(new Book(501, "f", 5.0));
        return list;
    }
}
