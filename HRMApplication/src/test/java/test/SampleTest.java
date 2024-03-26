package test;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void sampleTest() {
		System.out.println("execute test1");
		
		String data = System.getProperty("URL", "defaultData");
		System.out.println(data);
	}
	

}
