package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTestNG {

    @Test(dataProvider="credentials")
    public void dataProviderTest
            (String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider(name="credentials")
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "donhere";
        data[0][1] = "don@123";

        data[1][0] = "donhere1";
        data[1][1] = "don@123";

        data[2][0] = "donhere2";
        data[2][1] = "don@123";

        return data;

    }
}
