import org.testng.annotations.Test;

public class overridingTest {
	@Test
	void abc() {
		Overriding over=new Overriding();
		over.abc();
		System.out.println("i live in NY");
	}

}
