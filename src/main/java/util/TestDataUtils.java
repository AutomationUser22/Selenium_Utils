package util;

public class TestDataUtils {
    public String generateRandomEmail() {
        return "test" + System.currentTimeMillis() + "@example.com";
    }

    public String getTestData(String key) {
        return "testData_"+ ((Math.random()*100) + (Math.random()*999));
    }
}
