package net;

import java.io.File;

import org.testng.annotations.Test;
import net.methods.*;

public class ExcelColor {
	@Test
	public void testExcelColor(){

		String sheetname = "color";
		String path =  (new File("")).getAbsolutePath();
		String fileOrigin = "origin.xlsx";
		String fileDestin = "destin.xlsx";
		Excel excel = new Excel(path+"\\excels\\"+fileOrigin,path+"\\excels\\"+fileDestin);
		
		excel.addCell(0, 0, "NAME", sheetname);
		excel.addCell(0, 1, "COLOR", sheetname);

		excel.setSizeToText(0, 0, true, false, -1, excel.BLACK, sheetname);
		excel.setSizeToText(0, 1, true, false, -1, excel.BLACK, sheetname);

		excel.addCell(1 , 0, "BLACK", sheetname);
		excel.addCell(2 , 0, "WHITE", sheetname);
		excel.addCell(3 , 0, "RED", sheetname);
		excel.addCell(4 , 0, "BRIGHT_GREEN", sheetname);
		excel.addCell(5 , 0, "BLUE", sheetname);
		excel.addCell(6 , 0, "YELLOW", sheetname);
		excel.addCell(7 , 0, "PINK", sheetname);
		excel.addCell(8 , 0, "TURQUOISE", sheetname);
		excel.addCell(9 , 0, "DARK_RED", sheetname);
		excel.addCell(10, 0, "GREEN", sheetname);
		excel.addCell(11, 0, "DARK_BLUE", sheetname);
		excel.addCell(12, 0, "DARK_YELLOW", sheetname);
		excel.addCell(13, 0, "VIOLET", sheetname);
		excel.addCell(14, 0, "TEAL", sheetname);
		excel.addCell(15, 0, "GREY_25_PERCENT", sheetname);
		excel.addCell(16, 0, "GREY_50_PERCENT", sheetname);
		excel.addCell(17, 0, "CORNFLOWER_BLUE", sheetname);
		excel.addCell(18, 0, "MAROON", sheetname);
		excel.addCell(19, 0, "LEMON_CHIFFON", sheetname);
		excel.addCell(20, 0, "ORCHID", sheetname);
		excel.addCell(21, 0, "CORAL", sheetname);
		excel.addCell(22, 0, "ROYAL_BLUE", sheetname);
		excel.addCell(23, 0, "LIGHT_CORNFLOWER_BLUE", sheetname);
		excel.addCell(24, 0, "SKY_BLUE", sheetname);
		excel.addCell(25, 0, "LIGHT_TURQUOISE", sheetname);
		excel.addCell(26, 0, "LIGHT_GREEN", sheetname);
		excel.addCell(27, 0, "LIGHT_YELLOW", sheetname);
		excel.addCell(28, 0, "PALE_BLUE", sheetname);
		excel.addCell(29, 0, "ROSE", sheetname);
		excel.addCell(30, 0, "LAVENDER", sheetname);
		excel.addCell(31, 0, "TAN", sheetname);
		excel.addCell(32, 0, "LIGHT_BLUE", sheetname);
		excel.addCell(33, 0, "AQUA", sheetname);
		excel.addCell(34, 0, "LIME", sheetname);
		excel.addCell(35, 0, "GOLD", sheetname);
		excel.addCell(36, 0, "LIGHT_ORANGE", sheetname);
		excel.addCell(37, 0, "ORANGE", sheetname);
		excel.addCell(38, 0, "BLUE_GREY", sheetname);
		excel.addCell(39, 0, "GREY_40_PERCENT", sheetname);
		excel.addCell(40, 0, "DARK_TEAL", sheetname);
		excel.addCell(41, 0, "SEA_GREEN", sheetname);
		excel.addCell(42, 0, "DARK_GREEN", sheetname);
		excel.addCell(43, 0, "OLIVE_GREEN", sheetname);
		excel.addCell(44, 0, "BROWN", sheetname);
		excel.addCell(45, 0, "PLUM", sheetname);
		excel.addCell(46, 0, "INDIGO", sheetname);
		excel.addCell(47, 0, "GREY_80_PERCENT", sheetname);
		excel.addCell(47, 0, "AUTOMATIC", sheetname);       
		
		excel.setColorCell(1 , 1, excel.BLACK, sheetname);
		excel.setColorCell(2 , 1, excel.WHITE, sheetname);
		excel.setColorCell(3 , 1, excel.RED, sheetname);
		excel.setColorCell(4 , 1, excel.BRIGHT_GREEN, sheetname);
		excel.setColorCell(5 , 1, excel.BLUE, sheetname);
		excel.setColorCell(6 , 1, excel.YELLOW, sheetname);
		excel.setColorCell(7 , 1, excel.PINK, sheetname);
		excel.setColorCell(8 , 1, excel.TURQUOISE, sheetname);
		excel.setColorCell(9 , 1, excel.DARK_RED, sheetname);
		excel.setColorCell(10, 1, excel.GREEN, sheetname);
		excel.setColorCell(11, 1, excel.DARK_BLUE, sheetname);
		excel.setColorCell(12, 1, excel.DARK_YELLOW, sheetname);
		excel.setColorCell(13, 1, excel.VIOLET, sheetname);
		excel.setColorCell(14, 1, excel.TEAL, sheetname);
		excel.setColorCell(15, 1, excel.GREY_25_PERCENT, sheetname);
		excel.setColorCell(16, 1, excel.GREY_50_PERCENT, sheetname);
		excel.setColorCell(17, 1, excel.CORNFLOWER_BLUE, sheetname);
		excel.setColorCell(18, 1, excel.MAROON, sheetname);
		excel.setColorCell(19, 1, excel.LEMON_CHIFFON, sheetname);
		excel.setColorCell(20, 1, excel.ORCHID, sheetname);
		excel.setColorCell(21, 1, excel.CORAL, sheetname);
		excel.setColorCell(22, 1, excel.ROYAL_BLUE, sheetname);
		excel.setColorCell(23, 1, excel.LIGHT_CORNFLOWER_BLUE, sheetname);
		excel.setColorCell(24, 1, excel.SKY_BLUE, sheetname);
		excel.setColorCell(25, 1, excel.LIGHT_TURQUOISE, sheetname);
		excel.setColorCell(26, 1, excel.LIGHT_GREEN, sheetname);
		excel.setColorCell(27, 1, excel.LIGHT_YELLOW, sheetname);
		excel.setColorCell(28, 1, excel.PALE_BLUE, sheetname);
		excel.setColorCell(29, 1, excel.ROSE, sheetname);
		excel.setColorCell(30, 1, excel.LAVENDER, sheetname);
		excel.setColorCell(31, 1, excel.TAN, sheetname);
		excel.setColorCell(32, 1, excel.LIGHT_BLUE, sheetname);
		excel.setColorCell(33, 1, excel.AQUA, sheetname);
		excel.setColorCell(34, 1, excel.LIME, sheetname);
		excel.setColorCell(35, 1, excel.GOLD, sheetname);
		excel.setColorCell(36, 1, excel.LIGHT_ORANGE, sheetname);
		excel.setColorCell(37, 1, excel.ORANGE, sheetname);
		excel.setColorCell(38, 1, excel.BLUE_GREY, sheetname);
		excel.setColorCell(39, 1, excel.GREY_40_PERCENT, sheetname);
		excel.setColorCell(40, 1, excel.DARK_TEAL, sheetname);
		excel.setColorCell(41, 1, excel.SEA_GREEN, sheetname);
		excel.setColorCell(42, 1, excel.DARK_GREEN, sheetname);
		excel.setColorCell(43, 1, excel.OLIVE_GREEN, sheetname);
		excel.setColorCell(44, 1, excel.BROWN, sheetname);
		excel.setColorCell(45, 1, excel.PLUM, sheetname);
		excel.setColorCell(46, 1, excel.INDIGO, sheetname);
		excel.setColorCell(47, 1, excel.GREY_80_PERCENT, sheetname);
		excel.setColorCell(47, 1, excel.AUTOMATIC, sheetname);
		
		excel.write();
		Utils.openDirectory(path+"\\excels\\"+fileDestin);
	}

}
