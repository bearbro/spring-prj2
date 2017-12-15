package cn.edu.zjut.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ItemOrder implements IItemOrder,InitializingBean,DisposableBean {
    private IItem item;
    private int numItems;

    public void incrementNumItems() {
        setNumItems(getNumItems() + 1);
    }

    public void cancelOrder() {
        setNumItems(0);
    }

    public double getTotalCost() {
        return (getNumItems() * getUnitCost());
    }

    public IItem getItem() {
        return item;
    }

    public void setItem(IItem item) {
        System.out.println("Spring 注入item...");
        this.item = item;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        System.out.println("Spring 注入numItems...");
        this.numItems = numItems;
    }
    public double getUnitCost() {
        return item.getCost();
    }

    public ItemOrder() {
        System.out.println("Spring 实例化ItemOrder...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法afterPropertiesSet...");
    }

    public void init() {
        System.out.println("正在执行初始化方法init...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("正在执行bean销毁之前的方法destroy...");
    }
    public void myDestroy() throws Exception {
        System.out.println("正在执行bean销毁之前的方法myDestroy...");
    }
}

