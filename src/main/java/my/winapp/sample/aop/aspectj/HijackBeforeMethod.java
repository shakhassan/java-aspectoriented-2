package my.winapp.sample.aop.aspectj;

import java.lang.reflect.Method;


public class HijackBeforeMethod {
	
	public void before(Method method, Object[] args, Object target)
		throws Throwable {
	        System.out.println("HijackBeforeMethod : Before method hijacked!");
	}

}
