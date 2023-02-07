package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao dp = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: department findById ===");
		Department dep = dp.findById(2);
		System.out.println(dep);
	}

}
