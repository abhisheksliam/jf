package testcase.excel;
import org.testng.annotations.Test;
import runner.TestRunner;
public class Test_SKL16_XL_01_01_01_A1 extends TestRunner {
    @Test(groups = {
        "Ribbon"
    }) public void SKL16_XL_01_01_01_A1_1() throws Exception {
        System.out.println("START..");
        executeItem("SKL16.XL.01.01.01.A1", "A1", "1", "1");
        executeItem("SKL16.XL.01.01.01.A1", "A1", "2", "1");
        Thread.sleep(3000);
        System.out.println("DONE.");
    }
}