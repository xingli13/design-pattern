package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xingli13
 * @date 2018/11/14
 */
public class SubjectInvocation implements InvocationHandler {
	private Object obj;

	public SubjectInvocation(Object object) {
		this.obj = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 动态代理中可以在对象执行的时候增加一些方法
		if (obj instanceof Person && "sing".equals(method.getName())) {
			System.out.println("Person is singing");
		}else if (obj instanceof Angel){
			System.out.println("Angel is singing");
		}
		return method.invoke(obj, args);
	}
}
