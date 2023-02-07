package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== TEST 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n==== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n==== TEST 3: department insert ===");
		Department dp = new Department(null, "Coffee");
		departmentDao.insert(dp);
		System.out.println("Inserted! New Id = " + dp.getId());
		
		System.out.println("\n==== TEST 4: department update ===");
		Department dep2 = departmentDao.findById(7);
		dep2.setName("Cellphones");
		departmentDao.update(dep2);
		System.out.println("Update Complete!");
		
		System.out.println("\n==== TEST 5: department delete ===");
		System.out.print("Enter id to delete department: ");
		int x = sc.nextInt();
		departmentDao.deleteById(x);
		System.out.println("Delete completed!");
		
		
		sc.close();
	}

}
