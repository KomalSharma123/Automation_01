package ExltechPackage1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ComingData_DDT {
  

	@DataProvider(name="Google")
	  public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "Komal", "Lubnakomal" },
	      new Object[] { "Geeta", "Geeta123" },
	    };
  }
}
