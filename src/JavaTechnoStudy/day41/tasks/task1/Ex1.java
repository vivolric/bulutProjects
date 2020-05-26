package JavaTechnoStudy.day41.tasks.task1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class Ex1 {
    /*
     Test if you Book class works correctly, add test cases for hasThreePrices()
    a. add case where it returns true
    b. add case where it returns false
     */

    @Test
    public void testHasThreePrices_success() {
        Book book = new Book("Dogan", "ALi", LocalDate.of(2010, Month.NOVEMBER, 11), 100.00, 85.00, 0.00);


        boolean actual = book.hasThreePrices();

        Assert.assertTrue(actual);
    }

    @Test
    public void testHasThreePrices_fail() {
        Book book = new Book("Dogan", "Yakup", LocalDate.of(2015, Month.MAY, 22));

//        book.setName("Life of QA");
//        book.setAuthor("Yusuf Esenboga");
//        book.setLeatherBoundPrice(100.0);

        boolean actual = book.hasThreePrices();

        Assert.assertFalse(actual);
    }
}
