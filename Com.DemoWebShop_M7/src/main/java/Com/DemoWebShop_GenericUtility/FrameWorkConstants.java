package Com.DemoWebShop_GenericUtility;

public interface FrameWorkConstants {

	JavaUtility javaUtility = new JavaUtility();

	static String propertyFilePath = "./src/test/resources/TestData/commonData.properties";

	static String excelFilePath = "./src/test/resources/TestData/testScriptData.xlsx";

	static String screenShotsPath = "./screenshots/" + javaUtility.localDateAndTime() + ".png";

	static String reportsPath = "./reports/" + javaUtility.localDateAndTime() + ".html";

}
