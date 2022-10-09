package utils;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class HashTable extends Base  {
	//public ExcelReader reader = new ExcelReader("./Data/data.xlsx");
		@DataProvider(name = "getdata")
		public  Object[][] getData(Method m ,Class c ) {
			String ClassName =c.getName();
			String SheetName = ClassName.substring(5);
		
			


			//int rows = reader.getRowCount(config.getProperty("testDataSheetName"));
			int rows = reader.getRowCount(SheetName);


			String testName = m.getName();
			

			// Find the test case start row

			int testCaseRowNum = 1;

			for (testCaseRowNum = 1; testCaseRowNum <= rows; testCaseRowNum++) {

				//String testCaseName = reader.getCellData(config.getProperty("testDataSheetName"), 0, testCaseRowNum);
				String testCaseName = reader.getCellData(SheetName, 0, testCaseRowNum);
				if (testCaseName.equalsIgnoreCase(testName))
					break;

			}

			

			// Checking total rows in test case

			int dataStartRowNum = testCaseRowNum + 2;

			int testRows = 0;
			//while (!reader.getCellData(config.getProperty("testDataSheetName"), 0, dataStartRowNum + testRows).equals(""))
			while (!reader.getCellData(SheetName, 0, dataStartRowNum + testRows).equals(""))
			{

				testRows++;
			}

			

			// Checking total cols in test case

			int colStartColNum = testCaseRowNum + 1;
			int testCols = 0;

		//	while (!reader.getCellData(config.getProperty("testDataSheetName"), testCols, colStartColNum).equals(""))
			while (!reader.getCellData(SheetName, testCols, colStartColNum).equals(""))
			{

				testCols++;

			}

		

			// Printing data

			Object[][] data = new Object[testRows][1];

			int i = 0;
			for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {

				Hashtable<String, String> table = new Hashtable<String, String>();

				for (int cNum = 0; cNum < testCols; cNum++) {
					//if (!reader.getCellData(config.getProperty("testDataSheetName"), testCols, colStartColNum).equals(""))
					if (!reader.getCellData(SheetName, testCols, colStartColNum).equals(""))
					{
						continue;
					}

//					String testData = reader.getCellData(config.getProperty("testDataSheetName"), cNum, rNum);
//					String colName = reader.getCellData(config.getProperty("testDataSheetName"), cNum, colStartColNum);
					String testData = reader.getCellData(SheetName, cNum, rNum);
					String colName = reader.getCellData(SheetName, cNum, colStartColNum);
					table.put(colName, testData);

				}

				data[i][0] = table;
				i++;

			}

			return data;
		}
	
//	public ExcelReader reader = new ExcelReader("./Data/data.xlsx");
//	@DataProvider(name = "getdata")
//	public  Object[][] getData(Method m ,Class c ) {
//		String ClassName =c.getName();
//		String SheetName = ClassName.substring(5);
//	
//		
//
//
//		//int rows = reader.getRowCount(config.getProperty("testDataSheetName"));
//		int rows = reader.getRowCount(SheetName);
//
//
//		String testName = m.getName();
//		
//
//		// Find the test case start row
//
//		int testCaseRowNum = 1;
//
//		for (testCaseRowNum = 1; testCaseRowNum <= rows; testCaseRowNum++) {
//
//			//String testCaseName = reader.getCellData(config.getProperty("testDataSheetName"), 0, testCaseRowNum);
//			String testCaseName = reader.getCellData(SheetName, 0, testCaseRowNum);
//			if (testCaseName.equalsIgnoreCase(testName))
//				break;
//
//		}
//
//		
//
//		// Checking total rows in test case
//
//		int dataStartRowNum = testCaseRowNum + 2;
//
//		int testRows = 0;
//		//while (!reader.getCellData(config.getProperty("testDataSheetName"), 0, dataStartRowNum + testRows).equals(""))
//		while (!reader.getCellData(SheetName, 0, dataStartRowNum + testRows).equals(""))
//		{
//
//			testRows++;
//		}
//
//		
//
//		// Checking total cols in test case
//
//		int colStartColNum = testCaseRowNum + 1;
//		int testCols = 0;
//
//	//	while (!reader.getCellData(config.getProperty("testDataSheetName"), testCols, colStartColNum).equals(""))
//		while (!reader.getCellData(SheetName, testCols, colStartColNum).equals(""))
//		{
//
//			testCols++;
//
//		}
//
//	
//
//		// Printing data
//
//		Object[][] data = new Object[testRows][1];
//
//		int i = 0;
//		for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
//
//			Hashtable<String, String> table = new Hashtable<String, String>();
//
//			for (int cNum = 0; cNum < testCols; cNum++) {
//				//if (!reader.getCellData(config.getProperty("testDataSheetName"), testCols, colStartColNum).equals(""))
//				if (!reader.getCellData(SheetName, testCols, colStartColNum).equals(""))
//				{
//					continue;
//				}
//
////				String testData = reader.getCellData(config.getProperty("testDataSheetName"), cNum, rNum);
////				String colName = reader.getCellData(config.getProperty("testDataSheetName"), cNum, colStartColNum);
//				String testData = reader.getCellData(SheetName, cNum, rNum);
//				String colName = reader.getCellData(SheetName, cNum, colStartColNum);
//				table.put(colName, testData);
//
//			}
//
//			data[i][0] = table;
//			i++;
//
//		}
//
//		return data;
//	}

}
