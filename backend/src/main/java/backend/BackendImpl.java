package backend;


import javax.faces.bean.ApplicationScoped;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/")
public class BackendImpl implements BackendInterface {

    public String getBasic() {
        return "123";
    }

    public void putBasic(String body) {
        System.out.println("put " + body);
    }

    public String postBasic(String body) {
        System.out.println("post " + body);
        return "post " + body;
    }
}
