package practicepurpose;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
//	@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
//	public void invocationTest() {
//		int i = 1;
//		while(i==1) {
//			System.out.println(i);
//			
//		}
//		
//	}
	@Test(expectedExceptions=NumberFormatException.class)
	public void test() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
