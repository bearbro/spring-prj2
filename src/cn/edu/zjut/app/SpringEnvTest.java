package cn.edu.zjut.app;

import cn.edu.zjut.bean.IItem;
import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.ShoppingCart;
import cn.edu.zjut.event.EmailEvent;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Date;
import java.util.Locale;

//import cn.edu.zjut.dao.ICustomerDAO;
public class SpringEnvTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        EmailEvent ele = new EmailEvent("hello",
                "spring_test@zjut.edu.cn", "this is a test");
        ctx.publishEvent(ele);
    }

//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        Object[] objects = new Object[]{"HelloWorld", new Date()};
////        String message =
////                ctx.getMessage("HelloWorld", objects, Locale.CHINA);
////        System.out.println(message);
//        String message2 =
//                ctx.getMessage("HelloWorld", objects, Locale.US);
//        System.out.println(message2);
//    }

//        ApplicationContext ctx = new FileSystemXmlApplicationContext(
//                "src/applicationContext.xml");
//        IItemOrder itemorder3 = (IItemOrder) ctx.getBean("itemorder3");
//    }
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IItemOrder itemorder3 = (IItemOrder)ctx.getBean("itemorder3");
//    }
//
//        ClassPathResource res = new
//                ClassPathResource("applicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(res);
//        IItemOrder itemorder3 = (IItemOrder)
//                factory.getBean("itemorder3");
//        }

//        FileSystemResource isr = new
//                FileSystemResource("src/applicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(isr);
//        IItemOrder itemorder3 = (IItemOrder)
//                factory.getBean("itemorder3");
//    }
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IItemOrder itemorder2 = (IItemOrder) ctx.getBean("itemorder2");
//    }
//        IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemorder1");
//        ((ClassPathXmlApplicationContext)ctx).close();
//    }
//            System.out.println("getBean(item1)---1");
//            IItem item11 = (IItem) ctx.getBean("item1");
//            System.out.println("getBean(item1)---2");
//            IItem item12 = (IItem) ctx.getBean("item1");
//            System.out.println("getBean(item2)---1");
//            IItem item21 = (IItem) ctx.getBean("item2");
//            System.out.println("getBean(item2)---2");
//            IItem item22 = (IItem) ctx.getBean("item2");
//    }
//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IItemOrder itemorder1 = (IItemOrder)
//                ctx.getBean("itemorder1");
//        System.out.println("书名：" + itemorder1.getItem().getTitle());
//        System.out.println("数量：" + itemorder1.getNumItems());
//        IItemOrder itemorder2 = (IItemOrder)
//                ctx.getBean("itemorder2");
//        System.out.println("书名：" + itemorder2.getItem().getTitle());
//        System.out.println("数量：" + itemorder2.getNumItems());
//    }
//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        ShoppingCart shoppingCart =(ShoppingCart ) ctx.getBean("shoppingcart");
//        for (Object i:shoppingCart.getItemsOrdered().values()) {
//            IItemOrder  itemorder=(IItemOrder)i;
//            System.out.println("书名：" + itemorder.getItem().getTitle());
//            System.out.println("数量：" + itemorder.getNumItems());
//            System.out.println("总价：" + itemorder.getTotalCost());
//        }
//    }
}