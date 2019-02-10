package regapp.services;

import regapp.domain.model.service.EmployeeServiceModel;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {

    boolean saveEmployee(EmployeeServiceModel employeeServiceModel);

    List<EmployeeServiceModel> findAllEmployees();

    boolean removeEmployee(String id);

    BigDecimal averageEmployeeSalary();

    BigDecimal employeeSalarySum();
}
