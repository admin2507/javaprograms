package class_AugTwentytwo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class skip {
	@Test
	public void chat() {
		Reporter.log("chat",true);
	}

	@Test(enabled=false)
	public void walk() {
		Reporter.log("walk",true);
	}
}
