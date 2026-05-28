package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// This class listens to everything TestNG does during test execution
public class Listener implements ITestListener {

    private static ExtentReports extent;

    private static ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {

        extentTest = extent.createTest(result.getMethod().getMethodName());
    }

    // Runs when a test FAILS
    @Override
    public void onTestFailure(ITestResult result) {

        extentTest.log(Status.FAIL, "Test Case " + result.getMethod().getMethodName() + " Has failed");
    }

    // Runs when a test PASSES
    @Override
    public void onTestSuccess(ITestResult result) {

        extentTest.log(Status.PASS, "Test Case " + result.getMethod().getMethodName() + " Has passed");
    }

    // Runs when a test is SKIPPED (e.g., due to dependency failure)
    @Override
    public void onTestSkipped(ITestResult result) {

        extentTest.log(Status.SKIP, "Test Case " + result.getMethod().getMethodName() + " Has been skipped");
    }

    @Override
    public void onFinish(ITestContext result) {
        extent.flush();
    }

    @Override
    public void onStart(ITestContext result) {
        extent = ExtendReportManager.extentReports();

    }

}