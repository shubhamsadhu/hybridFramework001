package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
			System.out.println(result.getName()+"Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"TestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"");
	}

		
}
