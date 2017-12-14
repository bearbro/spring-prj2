package cn.edu.zjut.app;
import cn.edu.zjut.bean.IItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import cn.edu.zjut.dao.ICustomerDAO;
public class SpringEnvTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        IItem item1 = (IItem) ctx.getBean("item1");
        System.out.println(item1.getItemID());
        System.out.println(item1.getTitle());
        System.out.println(item1.getDescription());
        System.out.println(item1.getCost());
        IItem item2 = (IItem) ctx.getBean("item2");
        System.out.println(item2.getItemID());
        System.out.println(item2.getTitle());
        System.out.println(item2.getDescription());
        System.out.println(item2.getCost());
    }
}