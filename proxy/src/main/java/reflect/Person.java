package reflect;

/**
 * @author xingli13
 * @date 2018/11/14
 */
public class Person implements Subject {
	@Override
	public String sing(String name) {
		return "I'm singing "+ name;
	}
}
