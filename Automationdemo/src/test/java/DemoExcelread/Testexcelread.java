package DemoExcelread;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelRead;

public class Testexcelread {
	
	
		@Test(testName = "demo", dataProvider = "TestDemo")
		public void excelreads(String a, String pass) {
			System.out.println(a);
			System.out.println(pass);
		}

		@DataProvider(name = "TestDemo")
		public Object[][] dataproviders() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			Object[][] obj= ExcelRead.getDataFromExcel("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\demoexceldata.xlsx", "demo");
			return obj;
		}
	}

