package lecture1.constructorlecture.ex4;

import lecture1.constructorlecture.ex4.vo.UserInfo;

public class TestMain {

    public static void main(String args[]){
        UserInfo userInfo = new UserInfo("중2병도사","9292");
        System.out.println("id는 " + userInfo.getId() + " 입니다.");
        System.out.println("pw는 " + userInfo.getPw() + " 입니다.");
        System.out.println("");

        UserInfo userInfo2 = new UserInfo("라쟐","8282", "test@test.com");
        System.out.println("id는 " + userInfo2.getId() + " 입니다.");
        System.out.println("pw는 " + userInfo2.getPw() + " 입니다.");
        System.out.println("email은 " + userInfo2.getEmail() + " 입니다.");
    }

}
