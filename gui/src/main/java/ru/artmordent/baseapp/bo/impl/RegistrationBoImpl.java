package ru.artmordent.baseapp.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.artmordent.baseapp.bo.RegistrationBo;
import ru.artmordent.baseapp.utils.BackEndConnector;

@Service
public class RegistrationBoImpl implements RegistrationBo {

    @Autowired
    BackEndConnector backEndConnector;

    public void registerUser(String firstname, String lastname, String email) {
        System.out.println(
                "RegistrationBoImpl:: Registering user " + firstname + " " + lastname + ", with email " + email);
        String response = backEndConnector.postBasic("hello ");
        System.out.println("post result:" + response);
    }

}
