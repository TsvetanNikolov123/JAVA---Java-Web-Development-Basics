package app.web;

import app.domain.models.binding.RegisterBindingModel;
import app.domain.models.service.UserServiceModel;
import app.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.modelmapper.ModelMapper;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class RegisterBean extends BaseBean {

    private RegisterBindingModel registerBindingModel;

    private UserService userService;
    private ModelMapper modelMapper;

    public RegisterBean() {
    }

    @Inject
    public RegisterBean(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    public void init() {
        this.registerBindingModel = new RegisterBindingModel();
    }

    public void register() {
        if (!this.registerBindingModel.getPassword().equals(this.registerBindingModel.getConfirmPassword())) {
            this.redirect("/register");
            return;
        }
        this.registerBindingModel.setPassword(DigestUtils.sha256Hex(this.registerBindingModel.getPassword()));
        this.userService.register(this.modelMapper.map(this.registerBindingModel, UserServiceModel.class));
        this.redirect("/login");
    }

    public RegisterBindingModel getRegisterBindingModel() {
        return registerBindingModel;
    }

    public void setRegisterBindingModel(RegisterBindingModel registerBindingModel) {
        this.registerBindingModel = registerBindingModel;
    }
}
