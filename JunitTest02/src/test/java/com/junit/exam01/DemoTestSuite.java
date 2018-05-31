package com.junit.exam01;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// 固定写法，传递参数Suite.class
@RunWith(Suite.class)

// 将要测试的类写到里面
@SuiteClasses({
	DemoTestCalc.class,
	DecoExamAfter.class,
	DecoExamBefore.class,
	DecoExamTest.class,
	DecoExamClassBefore2After.class
})

// 这个类为空即可，但是必须保留
public class DemoTestSuite {

}
