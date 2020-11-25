import org.testng.annotations.Test;

public class OverridingSameClass {
	String name;
	int age;
	void abc() {
		System.out.println(name);
		System.out.println(age);
	}
	public class A  {
		String job="qa";
		@Test
		void abc() {
			name="shamim";
			age=40;
			
			abc();
			System.out.println(job);
		}
	}

}
