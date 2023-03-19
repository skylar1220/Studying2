package DBproject;

public class DbManagerDemo_my {

	public static void main(String[] args) {
		
		DbManager_my dbSel = new DbManager_my();
		String strSel = "select * from student";
		dbSel.Select(strSel);

		DbManager_my dbDel = new DbManager_my();
		String strDel = " DELETE FROM student WHERE id = 3";
		dbDel.Delete(strDel);
		
		
	}

}
