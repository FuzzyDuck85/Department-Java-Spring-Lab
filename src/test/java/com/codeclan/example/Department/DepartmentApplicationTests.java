package com.codeclan.example.Department;

import com.codeclan.example.Department.models.Department;
import com.codeclan.example.Department.models.Employee;
import com.codeclan.example.Department.models.Project;
import com.codeclan.example.Department.repositories.DepartmentRepository;
import com.codeclan.example.Department.repositories.EmployeeRepository;
import com.codeclan.example.Department.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DepartmentApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEverything(){

		Department department = new Department("Productivity");
		departmentRepository.save(department);

		Employee employee = new Employee("Trello", "Board", 1, department);
		employeeRepository.save(employee);

		Project project = new Project("First Project", 7);
		projectRepository.save(project);



		project.addEmployee(employee);
		department.addEmployee(employee);
		employee.getProjects();
		employee.addProject(project);
	}

}
