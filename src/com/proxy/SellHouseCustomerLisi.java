package com.proxy;

/**
 * 卖房子的客户 李四
 *
 * @author wxf
 * @date 2020/6/3 21:07
 */
public class SellHouseCustomerLisi implements HouseSales {
    /**
     * 卖房子
     *
     * @auther: wxf
     * @date: 2020/6/3 20:37
     */
    @Override
    public void sellTheHouse() {
        System.out.println("我是卖主 李四 我要卖房子");
    }

    /**
     * 房子卖了收钱
     *
     * @auther: wxf
     * @date: 2020/6/3 20:40
     */
    @Override
    public void collectMoney() {
        System.out.println("我是李四 我的房子卖出去了，钱也收到了");
    }
}
