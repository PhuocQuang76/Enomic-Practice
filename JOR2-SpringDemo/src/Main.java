import com.example.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        Employee e1=(Employee) context.getBean("emp");

        e1.setId(1);
        e1.setName("Nitin");
//		e2.getAdd().setCity("Jersey");
//		e2.getAdd().setStreet("7th Cross");
        System.out.println(e1);
        System.out.println(e1.getAdd());



//        Employee e2=(Employee) context.getBean("mgr");
//        System.out.println(e2);
//        System.out.println(e2.getAdd());
//
//        Employee e3=(Employee) context.getBean("adm");
//        System.out.println(e3);
//        System.out.println(e3.getAdd());
        //e2.getAdd().forEach(add->add.setCity("Dallas"));

    }
}