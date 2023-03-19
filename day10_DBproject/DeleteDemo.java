package day10_DBproject;

public class DeleteDemo {

	public static void main(String[] args) {
		// delete
		DbManager dbm = new DbManager();
		System.out.println("before delete..........");
		dbm.selectData().forEach(x -> System.out.println(x));
		dbm.deleteData("5");
		System.out.println("after delete..........");
		dbm.selectData().forEach(x -> System.out.println(x));
	}

}
