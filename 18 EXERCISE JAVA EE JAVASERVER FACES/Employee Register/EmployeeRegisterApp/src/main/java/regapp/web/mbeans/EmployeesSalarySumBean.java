package regapp.web.mbeans;

import regapp.services.EmployeeService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named
@RequestScoped
public class EmployeesSalarySumBean {

    private BigDecimal salarySum;

    private EmployeeService employeeService;

    public EmployeesSalarySumBean() {
    }

    @Inject
    public EmployeesSalarySumBean(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.salarySum = this.employeeService.employeeSalarySum();
    }

    public BigDecimal getSalarySum() {
        return salarySum;
    }

    public void setSalarySum(BigDecimal salarySum) {
        this.salarySum = salarySum;
    }
}
