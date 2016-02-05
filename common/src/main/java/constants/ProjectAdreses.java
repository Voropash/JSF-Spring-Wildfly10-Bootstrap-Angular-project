package constants;

public enum ProjectAdreses {
    BACKEND("http://localhost:8080/backend/"),GUI("http://localhost:8080/baseapp/");

    private String adress;

    ProjectAdreses(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }
}
