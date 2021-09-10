package class_AugTwentytwo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test(priority=1)
	public void call() {
		Reporter.log("call",true);
	}

	@Test(priority=-1)
	public void settings() {
		Reporter.log("settings",true);
	}
	@Test(priority=2)
	public void chat() {
		Reporter.log("chat",true);
	}
}
