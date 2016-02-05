package ru.artmordent.baseapp.utils;

import backend.BackendInterface;
import constants.ProjectAdreses;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.stereotype.Service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

@ManagedBean
@SessionScoped
@Service
public class BackEndConnector {

    Client client = ResteasyClientBuilder.newClient();

    public String postBasic(String string) {
        BackendInterface backendInterface = getBackendInterface();
        String response = backendInterface.postBasic(string);
        return response;
    }

    private BackendInterface getBackendInterface() {
        WebTarget target = client.target(ProjectAdreses.BACKEND.getAdress());
        ResteasyWebTarget rtarget = (ResteasyWebTarget) target;
        BackendInterface backendInterface = rtarget.proxy(BackendInterface.class);
        return backendInterface;
    }
}
