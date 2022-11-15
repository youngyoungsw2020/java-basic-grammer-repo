package lecture1.constructor.ex1.main;

import lecture1.constructor.ex1.UserInfo;

public class TestMain {

    public static void main(String args[]) {
        UserInfo userInfo = new UserInfo("ID입니다~", "비밀번호입니다~");
        userInfo.printId();
    }

}
