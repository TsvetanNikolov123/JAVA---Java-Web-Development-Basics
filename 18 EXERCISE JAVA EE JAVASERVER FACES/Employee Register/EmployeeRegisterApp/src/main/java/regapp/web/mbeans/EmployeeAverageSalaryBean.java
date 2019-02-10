package regapp.web.mbeans;

import regapp.services.EmployeeService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named
@RequestScoped
public class EmployeeAverageSalaryBean {

    private BigDecimal averageSalary;

    private EmployeeService employeeService;

    public EmployeeAverageSalaryBean() {
    }

    @Inject
    public EmployeeAverageSalaryBean(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.averageSalary = this.employeeService.averageEmployeeSalary();
    }

    public BigDecimal getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(BigDecimal averageSalary) {
        this.averageSalary = averageSalary;
    }
}
