package com.strategy;

/**
 * 策略实现类 孙夫人断后，挡住追兵
 *
 * @author wxf
 * @date 2020/6/3 17:00
 */
public class BlockEnemy implements StrategyInterface{
    /**
     * 策略方法 孙夫人断后，挡住追兵
     *
     * @auther: wxf
     * @date: 2020/6/3 16:52
     */
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
