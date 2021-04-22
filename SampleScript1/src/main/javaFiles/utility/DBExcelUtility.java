
package utility;

import java.util.Map;
import java.util.TreeMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DBExcelUtility {

	static Fillo fillo = new Fillo();
	static Connection conn = null;
	static Recordset recordset = null;

	public static Map<String, String> getTestdata(String testDataFile, String sheetName, String testCaseId)
			throws Exception {

		Map<String, String> allTestData = new TreeMap<String, String>();
		String query = null;
		query = String.format("SELECT * FROM %s WHERE RUN='Yes' and TestScript=%s'", sheetName, testCaseId);

		try {
			conn = fillo.getConnection(testDataFile);
			recordset = conn.executeQuery(query);
			while (recordset.next()) {
				for (String field : recordset.getFieldNames()) {
					allTestData.put(field, recordset.getField(field));
				}
			}
		} catch (

		FilloException e) {
		}
		conn.close();
		return allTestData;
	}

	public String setTestData(String excelPath, String sheetName, String testCaseId, String TestScenario,
			String orderNumber, String confirmationNumber) {

		String updateQuery = null;
		try {
			conn = fillo.getConnection(excelPath);
			updateQuery = "Update   " + sheetName + " Set OrderNumber='" + orderNumber + "',ConfirmationNumber='"
					+ confirmationNumber + "' Where  TestScript='" + testCaseId + "' and TestScenario='" + TestScenario
					+ "' and  Run='Yes'";
			conn.executeUpdate(updateQuery);
		} catch (FilloException e) {
			e.printStackTrace();

		}
		conn.close();
		return updateQuery;

	}

	public Recordset getRecordset(String excelpath, String sheetName, String testCaseId) {

		String query = String.format("SELECT * FROM  " + sheetName + " WHERE Run='Yes' and TestScript='" + testCaseId + "'");
		try {
			conn = fillo.getConnection(excelpath);

			recordset = conn.executeQuery(query);

		} catch (FilloException e) {
			e.printStackTrace();
		}
		conn.close();
		return recordset;

	}

}
