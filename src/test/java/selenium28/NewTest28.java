package selenium28;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest28 {
  @Test
  public void f() {
	  System.out.println("i am from test");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am from before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am from after suite");
  }

}
