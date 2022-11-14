package constructorSample.test1.vo;

public class NCUserInfo extends UserInfo {

    private boolean isNexonPrime = false;

    public NCUserInfo(String id, String pw, String email) {
        super(id, pw, email);
    }

}
