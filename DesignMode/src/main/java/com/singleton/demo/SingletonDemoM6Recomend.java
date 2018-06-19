package com.singleton.demo;
/**
 * 
 * 用枚举的方式创建单例，代码用到了反射的知识，暂时看不懂
 * 
 * @author gupan
 *
 */
public enum SingletonDemoM6Recomend {
	INSTANCE;
	
	@Override
	public String toString() {
		return getDeclaringClass().getCanonicalName() + "@" + hashCode();
	}
}
