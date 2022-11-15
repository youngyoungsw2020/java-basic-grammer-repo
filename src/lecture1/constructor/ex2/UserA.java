package lecture1.constructor.ex2;

public class UserA {

    private TargetB target;

    // 생성자로 변경하기
    public UserA(String id, String pwd) {
        // 변경된 TargetB의 생성자에 맞게 변경하기
        target = new TargetB("아이디","패스워드~");
        //target.setIdPw(id, pwd);
        // 고칠 필요가 없이 호출 가능
        target.printB();
    }
    public static void main(String[] args) {
        //변경된 UserA의 생성자 호출로 변경하기
        UserA ref = new UserA("userA의 아이디", "userA의 패스워드");
        //ref.login("bigdaddy", "xman11");
    }

}
