package lecture1.constructorlecture.ex2;

public class TargetB {

    private String id;
    private String pwd;

    // 이 구문을 생성자로 변경
    public TargetB(String id, String pwd) {
        System.out.println("생성자 B 호출!");
        this.id = id;
        this.pwd = pwd;
    }

    /*public void setIdPw(String id, String pwd) {
        System.out.println("생성자 B 호출!");
        this.id = id;
        this.pwd = pwd;
    }*/

    public void printB() {
        System.out.println("id=>"+id+",pwd=>"+pwd);
    }
}
