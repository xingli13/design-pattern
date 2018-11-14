import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
/**
 * @author xingli13
 * @date 2018/11/14
 */
public class TestAssertJ {
	@Test
	public void test(){
		assertThat("abc").isEqualTo("abc");
	}
}
