package com.springboot_connecting_apis_employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public abstract class EmployeeService implements EmployeeRepository {

	private static Map<Long, Employee> employeeRepo = new HashMap<>();

	static {
		Employee emp1 = new Employee();
		emp1.seteId((long) 1);
		emp1.setEmployeeName("emp1");
		employeeRepo.put(emp1.geteId(), emp1);
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeRepo.put(employee.geteId(), employee);
	}

	@Override
	public void updateEmployee(Long id, Employee employee) {
		employeeRepo.remove(id);
		employee.seteId(id);
		employeeRepo.put(id, employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepo.remove(id);

	}

	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepo.values();
	}
}
