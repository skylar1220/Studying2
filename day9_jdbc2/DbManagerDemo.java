package day9_jdbc2;

public class DbManagerDemo {

	public static void main(String[] args) {
		
		DbManager dbSel = new DbManager();
		String strSel = "select * from student";
		dbSel.Select(strSel);

		DbManager dbDel = new DbManager();
		String strDel = " DELETE FROM student WHERE id = 3";
		dbDel.Delete(strDel);
		
		
	}

}
