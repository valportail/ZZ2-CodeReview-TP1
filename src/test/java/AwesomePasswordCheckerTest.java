import fr.isima.AwesomePasswordChecker;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AwesomePasswordCheckerTest {
  @Test
  public void testEmptyPassword() throws IOException {
    assertEquals(AwesomePasswordChecker.computeMD5(""), "d41d8cd98f00b204e9800998ecf8427e");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance(""), 5.073797971765403, 1e-12);
  }

  @Test
  public void testNumberPassword() throws IOException {
    assertEquals(AwesomePasswordChecker.computeMD5("44"), "f7177163c833dff4b38fc8d2872f1ec6");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance("44"), 10.400762389879079, 1e-12);
  }

  @Test
  public void testLowercasePassword() throws IOException {
    assertEquals(AwesomePasswordChecker.computeMD5("aaaaaaaa"), "3dbe00a167653a1aaee01d93e77e730e");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance("aaaaaaaa"), 7.641470703139506, 1e-12);
  }
}
