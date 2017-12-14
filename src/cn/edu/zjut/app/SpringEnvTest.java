package cn.edu.zjut.app;

import cn.edu.zjut.bean.IItem;
import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import cn.edu.zjut.dao.ICustomerDAO;
public class SpringEnvTest {
//        public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IItem item1 = (IItem) ctx.getBean("item1");
//        System.out.println(item1.getItemID());
//        System.out.println(item1.getTitle());
//        System.out.println(item1.getDescription());
//        System.out.println(item1.getCost());
//        IItem item2 = (IItem) ctx.getBean("item2");
//        System.out.println(item2.getItemID());
//        System.out.println(item2.getTitle());
//        System.out.println(item2.getDescription());
//        System.out.println(item2.getCost());
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
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ShoppingCart shoppingCart =(ShoppingCart ) ctx.getBean("shoppingcart");
        for (Object i:shoppingCart.getItemsOrdered().values()) {
            IItemOrder  itemorder=(IItemOrder)i;
            System.out.println("书名：" + itemorder.getItem().getTitle());
            System.out.println("数量：" + itemorder.getNumItems());
            System.out.println("总价：" + itemorder.getTotalCost());
        }

    }
}