package lecture1.constructorlecture.ex4;

import lecture1.constructorlecture.ex4.vo.NexonUserInfo;

public class TestMain2 {

    public static void main(String args[]){
        NexonUserInfo nexonUserInfo1 = new NexonUserInfo("testId", "testPw", "test@test.com", true);
        System.out.println("nexonUserInfo1 nexon prime 여부는 " + nexonUserInfo1.getNexonPrime() + " 입니다.");
        System.out.println("");

        NexonUserInfo nexonUserInfo2 = new NexonUserInfo("testId2", "testPw2", "test2@test.com", false);
        System.out.println("nexonUserInfo2 nexon prime 여부는 " + nexonUserInfo2.getNexonPrime() + " 입니다.");
    }

}
