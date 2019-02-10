package regapp.web.mbeans;

import regapp.services.EmployeeService;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class EmployeeRemoveBeen {

    private EmployeeService employeeService;

    public EmployeeRemoveBeen() {
    }

    @Inject
    public EmployeeRemoveBeen(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void remove(String id) throws IOException {
        this.employeeService.removeEmployee(id);
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        context.redirect("/");
    }
}
