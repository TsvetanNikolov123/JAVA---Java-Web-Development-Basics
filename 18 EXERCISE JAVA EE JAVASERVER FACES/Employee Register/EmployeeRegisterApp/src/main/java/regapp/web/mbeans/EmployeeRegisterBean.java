package regapp.web.mbeans;

import org.modelmapper.ModelMapper;
import regapp.domain.model.binding.EmployeeRegisterBindingModel;
import regapp.domain.model.service.EmployeeServiceModel;
import regapp.services.EmployeeService;
import regapp.util.ValidationUtil;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class EmployeeRegisterBean {

    private EmployeeRegisterBindingModel employeeRegisterBindingModel;
    private EmployeeService employeeService;
    private ModelMapper modelMapper;
    private ValidationUtil validationUtil;

    public EmployeeRegisterBean() {
        this.employeeRegisterBindingModel = new EmployeeRegisterBindingModel();
    }

    @Inject
    public EmployeeRegisterBean(EmployeeService employeeService, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this();
        this.employeeService = employeeService;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    public EmployeeRegisterBindingModel getEmployeeRegisterBindingModel() {
        return employeeRegisterBindingModel;
    }

    public void setEmployeeRegisterBindingModel(EmployeeRegisterBindingModel employeeRegisterBindingModel) {
        this.employeeRegisterBindingModel = employeeRegisterBindingModel;
    }

    public void register() throws IOException {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        if (!this.validationUtil.isValid(employeeRegisterBindingModel)) {
            context.redirect("/");
        }else {
            this.employeeService
                    .saveEmployee(this.modelMapper.map(this.employeeRegisterBindingModel, EmployeeServiceModel.class));
            context.redirect("/");
        }
    }
}
