package web;

import domain.models.binding.LoginBindingModel;
import domain.models.service.UserServiceModel;
import org.apache.commons.codec.digest.DigestUtils;
import service.UserService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

@Named
@RequestScoped
public class LoginBean extends BaseBean {

    private LoginBindingModel loginBindingModel;

    private UserService userService;

    public LoginBean() {
    }

    @Inject
    public LoginBean(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void init() {
        this.loginBindingModel = new LoginBindingModel();
    }

    public void login() {
        UserServiceModel userServiceModel = this.userService.getByUsernameAndPassword(
                this.loginBindingModel.getUsername(), DigestUtils.sha256Hex(this.loginBindingModel.getPassword()));

        if (userServiceModel == null){
            this.redirect("/login");
        }

        Map<String, Object> sessionMap = FacesContext.getCurrentInstance()
                .getExternalContext()
                .getSessionMap();
        sessionMap.put("username", this.loginBindingModel.getUsername());
        sessionMap.put("userId", userServiceModel.getId());

        this.redirect("/home");
    }

    public LoginBindingModel getLoginBindingModel() {
        return this.loginBindingModel;
    }

    public void setLoginBindingModel(LoginBindingModel loginBindingModel) {
        this.loginBindingModel = loginBindingModel;
    }
}
