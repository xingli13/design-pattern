package reflect;

import java.lang.reflect.Proxy;

/**
 * @author xingli13
 * @date 2018/11/14
 */
public class MyProxy {
	public static void main(String[] args) {
		Subject person = (Subject) Proxy.newProxyInstance(Person.class.getClassLoader(),
				Person.class.getInterfaces(),
				new SubjectInvocation(new Person()));
//		Person person = new Person();
//		Subject subject = ((Subject) Proxy.newProxyInstance(person.getClass().getClassLoader(),
//				person.getClass().getInterfaces(), ((proxy, method, args1) -> method.invoke(person, args1))));
		System.out.println(person.sing("abc"));
		Angel realAngel = new Angel();
		Subject angel = (Subject) Proxy.newProxyInstance(realAngel.getClass().getClassLoader(),
				realAngel.getClass().getInterfaces(),
				new SubjectInvocation(realAngel));
		System.out.println(angel.sing("xby"));
	}
}
