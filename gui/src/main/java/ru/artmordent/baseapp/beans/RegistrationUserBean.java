package ru.artmordent.baseapp.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.artmordent.baseapp.bo.RegistrationBo;

@Component
@ManagedBean
@SessionScoped
@Data
public class RegistrationUserBean {

    // This is going to be injected by Spring framework
    @Autowired
    RegistrationBo registrationBo;

    private String firstname;
    private String lastname;
    private String email;

    public void register() {
        System.out.println(
                "RegistrationUserBean:: Registering user " + firstname + " " + lastname + ", with email " + email);

        registrationBo.registerUser(firstname, lastname, email);

        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registration success", "success");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
