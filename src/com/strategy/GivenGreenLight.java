package com.strategy;

/**
 * 策略实现类 打不过绿灯放行
 *
 * @author wxf
 * @date 2020/6/3 16:57
 */
public class GivenGreenLight implements StrategyInterface{
    /**
     * 策略方法
     * 打不过绿灯放行
     * @auther: wxf
     * @date: 2020/6/3 16:52
     */
    @Override
    public void operate() {
        System.out.println("打不过绿灯放行");
    }
}
