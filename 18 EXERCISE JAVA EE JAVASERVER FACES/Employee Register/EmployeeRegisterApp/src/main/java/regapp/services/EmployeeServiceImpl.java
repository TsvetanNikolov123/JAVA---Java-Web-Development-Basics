package regapp.services;

import org.modelmapper.ModelMapper;
import regapp.domain.entities.Employee;
import regapp.domain.model.service.EmployeeServiceModel;
import regapp.repository.EmployeeRepository;
import regapp.util.ValidationUtil;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;

    @Inject
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    @Override
    public boolean saveEmployee(EmployeeServiceModel employeeServiceModel) {
        try {
            this.employeeRepository.save(this.modelMapper.map(employeeServiceModel, Employee.class));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public List<EmployeeServiceModel> findAllEmployees() {
        return this.employeeRepository.findAll()
                .stream()
                .map(e -> this.modelMapper.map(e, EmployeeServiceModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public boolean removeEmployee(String id) {
        try {
            this.employeeRepository.remove(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public BigDecimal averageEmployeeSalary() {
        List<BigDecimal> bdList = new ArrayList<>();
        this.employeeRepository.findAll()
                .forEach(employee -> {
                    bdList.add(employee.getSalary());
                });
        if (bdList.size() == 0) {
            return BigDecimal.ZERO;
        } else if (bdList.size() == 1) {
            String debug = "";
            return bdList.get(0);
        } else {
            return bdList.stream()
                    .reduce(BigDecimal.ZERO, BigDecimal::add)
                    .divide(BigDecimal.valueOf(bdList.size()), 2, RoundingMode.HALF_EVEN);
        }
    }

    @Override
    public BigDecimal employeeSalarySum() {
        List<BigDecimal> bdList = new ArrayList<>();
        this.employeeRepository.findAll()
                .forEach(employee -> {
                    bdList.add(employee.getSalary());
                });
        return bdList.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
