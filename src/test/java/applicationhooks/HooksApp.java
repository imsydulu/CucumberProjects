package applicationhooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksApp {
	
	@Before
	public void setUp() {
		System.out.println("setUp()");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("beforeStep() ");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("afterStep()");
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown()");
	}

}
