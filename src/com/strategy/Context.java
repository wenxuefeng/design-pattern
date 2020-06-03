package com.strategy;

/**
 * 策略统一暴露类
 *
 * @author wxf
 * @date 2020/6/3 17:07
 */
public class Context {
    // 指定是哪个策略
    private StrategyInterface strategyInterface;
    public Context(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }
    // 使用对应的策略
    public void operate() {
        this.strategyInterface.operate();
    }
}
