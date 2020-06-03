package com.strategy;

/**
 * 策略模式 测试类
 *
 * @author wxf
 * @date 2020/6/3 17:03
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        // 策略上下文
        Context context;
        // 刘备娶亲遇敌人 来战
        context = new Context(new BackDoor());
        context.operate();
        // 打不过 开绿灯放行
        context = new Context(new GivenGreenLight());
        context.operate();
        // 来追兵了 孙夫人短后，挡住追兵
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
