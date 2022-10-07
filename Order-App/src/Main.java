import com.example.model.Customer;
import com.example.model.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("--------------Order 1--------------");
        Order order1 = (Order) context.getBean("order1");
        order1.setOrderId(001);
        order1.setQty(10);
        order1.setTotalPrice(order1.getQty(), order1.getItem().getPrice());
        System.out.println(order1);


        System.out.println("\n--------------Order 2--------------");
        Order order2 = (Order) context.getBean("order2");
        order2.setOrderId(002);
        order2.setQty(5);
        order2.setTotalPrice(order2.getQty(), order2.getItem().getPrice());
        System.out.println(order2);

//        System.out.println(order1);




    }
}