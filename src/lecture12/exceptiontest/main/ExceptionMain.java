package lecture12.exceptiontest.main;

import java.sql.SQLException;

class ExceptionMain {

    public static void main(String args[]) {

        ExceptionMain exceptionMain = new ExceptionMain();

        try {
            System.out.println("============================");
            boolean isError = false;
            exceptionMain.test1(isError);

            //System.out.println("============================");
            //isError = true;
            //exceptionMain.test1(isError);

            System.out.println("============================");
            isError = true;
            exceptionMain.test2(isError);

        } catch (Exception e) {
            System.out.println("e.getMessage() ::" + e.getMessage());
            System.out.println("main method 안에 catch!");
        }

    }


    /**
     * 1. catch문 안에 throw e + 메소드 뒤에 throws Exception하는 패턴
     *
     *
     * @param isError
     * @throws Exception
     */
    public void test1(boolean isError) throws Exception{
        try {
            System.out.println("test1 method 시작!!!!!");
            System.out.println("isError ::: " + isError);
            if (isError) {
                throw new Exception();
                //throw new StringIndexOutOfBoundsException(999999);
            }
            return;
        } catch (Exception e) {
            System.out.println("test1 method 안에 catch!");
            System.out.println("e.getMessage() ::" + e.getMessage());
            throw e;
        } finally {
            System.out.println("test1 method 안에 finally!");
        }
    }


    /**
     * 2. catch문 안에 throw new Exception(); + 메소드 뒤에 throws Exception하는 패턴
     *
     *
     * @param isError
     * @throws Exception
     */
    public void test2(boolean isError) throws Exception{
        try {
            System.out.println("test2 method 시작!!!!!");
            System.out.println("isError ::: " + isError);
            if (isError) {
                //throw new Exception();
                throw new StringIndexOutOfBoundsException(999999);
            }
            return;
        } catch (Exception e) {
            System.out.println("test2 method 안에 catch!");
            System.out.println("e.getMessage() ::" + e.getMessage());
            throw new Exception();
        } finally {
            System.out.println("test2 method 안에 finally!");
        }
    }

    /**
     * 3. catch문 안에 throw new RuntimeException 하고 + 메소드 뒤에 throws Exception을 안하는 패턴
     *
     *
     * catch 문안에 아래처럼 throw 문을 사용하면 컴파일에러가 남.
     *  throw e;
     *  throw new Exception();
     *
     * 근데 요래하면 컴파일 에러가 안남.
     *  throw new RuntimeException();
     *
     * 신기하네..
     *
     * @param isError
     */
    public void test3(boolean isError) {
        try {
            System.out.println("test3 method 시작!!!!!");
            System.out.println("isError ::: " + isError);
            if (isError) {
                throw new Exception();
            }
            return;
        } catch (Exception e) {
            System.out.println("test3 method 안에 catch!");
            // throw e;
            // throw new Exception();
            // throw new SQLException();
            throw new RuntimeException();
        } finally {
            System.out.println("test3 method 안에 finally!");
        }
    }


    // UncheckedException에 해당하는 RuntimeException에서는 catch 문안에써도 메소드에서 throws Exception 안해도 됨.
    // CheckedException의 경우 SQLException, IOException 등등에서는 반드시 핸들링 되어야함 throws Exception을 한다던지 try catch를 해야한다던지


}
