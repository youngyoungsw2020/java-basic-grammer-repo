package lecture1.constructor.ex1;

public class UserInfo {

    // 변수
    private String id = "";
    private String pw = "";

    // 생성자(constructor)는 클래스랑 이름이 똑같다.
    // 생성자 사용이유 : 어떤 값을 꼭 넣고 싶을때.
    // 생성자는 반환값이 없다.
    public UserInfo(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    // 메소드(method)
    public void printId(){
        System.out.println("id는 " + id + "입니다.");
    }

}
