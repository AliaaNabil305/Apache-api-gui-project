import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utillity {
	private XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	public utillity(String path) throws IOException {
		 File file = new File(path);
		    FileInputStream fis =new FileInputStream(file);
		    workbook = new XSSFWorkbook(fis);
		   sheet = workbook.getSheetAt(0);
		
	}
	
	public utillity () {
		
	}
	public static XSSFSheet getSheet() {
		return sheet;
	}
	public void setSteet(XSSFSheet newsheet) {
		sheet=newsheet;
	}
	public XSSFWorkbook getworkbook() {
		return workbook;
	}
	public void setworkbook(XSSFWorkbook workbook) {
		this.workbook = workbook;
	}

}
