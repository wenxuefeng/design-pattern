package com.proxy;

/**
 * 买房子的客户
 *
 * @author wxf
 * @date 2020/6/3 20:59
 */
public class BuyHouseCustomer {
    public static void main(String[] args) {
        // 我要买房子 去找房地产销售人员
        // 房地产销售人员来了
        RealEstateSalesMan realEstateSalesMan = new RealEstateSalesMan();
        // 这个房子可以 我买了
        // ok 房子给你
        realEstateSalesMan.sellTheHouse();
        // 钱给房地产销售人员
        realEstateSalesMan.collectMoney();

        // 我还想再买一套房子 去找房地产销售人员
        // 房地产销售人员了 不过这次 是卖李四的
        realEstateSalesMan = new RealEstateSalesMan(new SellHouseCustomerLisi());
        // 这个房子可以 我买了
        // ok 房子给你
        realEstateSalesMan.sellTheHouse();
        // 钱给房地产销售人员
        realEstateSalesMan.collectMoney();

    }
}
