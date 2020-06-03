package com.proxy;

/**
 * 房地产公司销售员
 *
 * @author wxf
 * @date 2020/6/3 20:50
 */
public class RealEstateSalesMan implements HouseSales{
    private HouseSales houseSales;

    // 默认是卖房子的客户 张三
    public RealEstateSalesMan() {
        this.houseSales = new SellHouseCustomerZhangSan();
    }

    // 可以是卖房子的任何客户
    public RealEstateSalesMan(HouseSales houseSale) {
        this.houseSales = houseSale;
    }

    /**
     * 卖房子
     *
     * @auther: wxf
     * @date: 2020/6/3 20:37
     */
    @Override
    public void sellTheHouse() {
        this.houseSales.sellTheHouse();
    }

    /**
     * 房子卖了收钱
     *
     * @auther: wxf
     * @date: 2020/6/3 20:40
     */
    @Override
    public void collectMoney() {
        this.houseSales.collectMoney();
    }
}
