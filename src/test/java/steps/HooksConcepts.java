package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class HooksConcepts {

	/*
	 * @BeforeAll public static void before_all() {
	 * 
	 * System.out.println("@BeforeAll: hook");
	 * 
	 * }
	 */

	@Before (order =0) // This @Before will get executed first
	public void setUp1() {

		System.out.println("@Before: launching browser");

	}
	
	/*
	 * @Before (order = 1) public void setUp2() {
	 * 
	 * System.out.println("@Before: launching browser");
	 * 
	 * }
	 */
	@After(order = 1) // This @After will get executed first
	public void tearDown1() {

		System.out.println("@Before: closing browser");

	}
	
	/*
	 * @After (order = 0) public void tearDown2() {
	 * 
	 * System.out.println("@Before: closing browser");
	 * 
	 * }
	 */

	/*
	 * @AfterAll public static void after_all() {
	 * 
	 * System.out.println("@AfterAll: hook");
	 * 
	 * }
	 */

}
