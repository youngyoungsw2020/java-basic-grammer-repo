package constructorSample.test1.vo;

public class NexonUserInfo extends UserInfo {

    private boolean nexonPrime = false;

    public NexonUserInfo(String id, String pw, String email, boolean nexonPrime) {
        super(id, pw, email);
        this.nexonPrime = nexonPrime;
    }

    public boolean getNexonPrime() {
        return this.nexonPrime;
    }

}
