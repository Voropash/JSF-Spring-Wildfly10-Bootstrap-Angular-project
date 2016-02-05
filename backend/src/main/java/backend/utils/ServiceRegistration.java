package backend.utils;

import backend.BackendImpl;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class ServiceRegistration extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public ServiceRegistration () {
        singletons.add(new BackendImpl());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}