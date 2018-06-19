package com.singleton.demo;

/**
 * 这个类主要是用来实现单例模式
 * 
 * 创建方式：静态内部类
 * 
 * @author gupan
 *
 */
public class SingletonDemoM5Recomend {
    private SingletonDemoM5Recomend() {
    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    public static SingletonDemoM5Recomend getInstance() {
        return SingletonLazyHolder.instance;
    }

    private static class SingletonLazyHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private final static SingletonDemoM5Recomend instance = new SingletonDemoM5Recomend();
    }
}
