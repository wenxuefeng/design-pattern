package com.singleton;

/**
 * @author wxf
 * @date 2020/6/19 14:40
 * @description 简单描述
 **/
public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    /**
     * 限制住不能直接产生一个实例
     * @auther: wxf
     * @date: 2020/7/19 10:27
     * @return: {@link Singleton}
     */
    private Singleton(){
    }

    public synchronized static Singleton getInstance(){
        return SINGLETON;
    }
}
