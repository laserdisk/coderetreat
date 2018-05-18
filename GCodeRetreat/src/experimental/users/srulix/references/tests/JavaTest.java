package experimental.users.srulix.references.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JavaTest {

  @Test
  public void fooBar() {
    Java j = new Java();
    System.out.println("hi");
    assertEquals("fubar", j.bar());
  }
}