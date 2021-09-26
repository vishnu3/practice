package programs;

import java.util.Collections;
import java.util.List;

public class BookServ {

    public static List<Book> BooksInSort() {
        List<Book> list = new BookDAO().getBooks();

        Collections.sort(
                list,
                (o1,o2)->
                        o1.getName().compareTo(o2.getName())
        );

        return list;
    }

    public static void main(String[] args) {
        System.out.println(
                BooksInSort()
        );
    }
}
//
//class MyComparator implements Comparator<Book> {
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
