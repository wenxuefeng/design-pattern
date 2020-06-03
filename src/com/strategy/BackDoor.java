package com.strategy;

/**
 * 策略实现类
 *
 * @author wxf
 * @date 2020/6/3 16:55
 */
public class BackDoor implements StrategyInterface{
    /**
     * 策略方法
     *
     * @auther: wxf
     * @date: 2020/6/3 16:52
     */
    @Override
    public void operate() {
        System.out.println("来战");
    }
}
