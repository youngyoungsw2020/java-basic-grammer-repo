package lecture1.constructorlecture.ex4.vo;

public class UserInfo {

    private String id = "";
    private String pw = "";
    private String email = "";
    private boolean isBaramUser = false;

    public UserInfo(String id, String pw){
        this.id = id;
        this.pw = pw;
    }

    public UserInfo(String id, String pw, String email) {
        this.id = id;
        this.pw = pw;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public String getPw() {
        return this.pw;
    }

    public String getEmail() {
        return this.email;
    }

}
