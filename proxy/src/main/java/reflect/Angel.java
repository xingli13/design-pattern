package reflect;

/**
 * @author xingli13
 * @date 2018/11/14
 */
public class Angel implements Subject {
	@Override
	public String sing(String name) {
		return "angel is singing " + name;
	}
}
