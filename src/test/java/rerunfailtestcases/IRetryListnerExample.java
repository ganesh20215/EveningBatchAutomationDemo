package rerunfailtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryListnerExample implements IRetryAnalyzer {

    private int minRetryCount = 0;
    private int maxCount = 3;

    public boolean retry(ITestResult iTestResult) {
        if (minRetryCount < maxCount) {
            minRetryCount++;
            return true;
        }
        return false;
    }
}
