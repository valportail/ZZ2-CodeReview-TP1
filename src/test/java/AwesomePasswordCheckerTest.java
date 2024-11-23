import fr.isima.AwesomePasswordChecker;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AwesomePasswordCheckerTest {
  @Test
  public void testEmptyPassword() throws IOException {
    String password = "";
    assertEquals(AwesomePasswordChecker.computeMD5(password), "d41d8cd98f00b204e9800998ecf8427e");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance(password), 5.073797971765403, 1e-12);
  }

  @Test
  public void testNumberPassword() throws IOException {
    String password = "44";
    assertEquals(AwesomePasswordChecker.computeMD5(password), "f7177163c833dff4b38fc8d2872f1ec6");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance(password), 10.400762389879079, 1e-12);
  }

  @Test
  public void testLowercasePassword() throws IOException {
    String password = "aaaaaaaa";
    assertEquals(AwesomePasswordChecker.computeMD5(password), "3dbe00a167653a1aaee01d93e77e730e");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance(password), 7.641470703139506, 1e-12);
  }

  @Test
  public void testUppercasePassword() throws IOException {
    String password = "ESSAIMOTDEPASSE";
    assertEquals(AwesomePasswordChecker.computeMD5(password), "b45f9d99c556363b330a66dad80a4501");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance(password), 17.15706989785588, 1e-12);
  }

  @Test
  public void testSpecialCharPassword() throws IOException {
    String password = "mF33<8G§y";
    assertEquals(AwesomePasswordChecker.computeMD5(password), "b8a441d67b76a2873f767df6ae96cb46");
    assertEquals(AwesomePasswordChecker.getInstance().getDistance(password), 18.591996793706954, 1e-12);
  }
}
