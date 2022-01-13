import org.sibadi.staff.Administrator;
import org.sibadi.product.Paste;
import org.sibadi.staff.Waiter;
import org.sibadi.Customer;
import org.sibadi.Schedule;
import org.sibadi.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        var customer = new Customer("A", 20);

        System.out.println(customer + "\n");

        var table_0 = new Table(LocalDate.now(), customer, 1, 5);
        var table_1 = new Table(LocalDate.now(), customer, 2, 5);

        System.out.println(table_0 + "\n");
        System.out.println(table_1 + "\n");

        var administrator = new Administrator("B", 20, "123");
        var waiter = new Waiter("C", 20, "123");

        System.out.println(administrator + "\n");
        System.out.println(waiter + "\n");

        var scheduleForWaiter = new Schedule(LocalDate.now(), waiter, 5);
        var scheduleForAdministrator = new Schedule(LocalDate.now(), administrator, 5);

        System.out.println(scheduleForWaiter + "\n");
        System.out.println(scheduleForAdministrator + "\n");

        var paste = new Paste("Paste", "...", new BigDecimal(1000));

        System.out.println(paste + "\n");

        customer.buy(paste);

        System.out.println(customer + "\n");
    }
}