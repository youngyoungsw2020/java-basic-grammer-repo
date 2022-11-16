package lecture7.stream.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestMain1 {

    public static void main(String[] args) throws IOException {
        java.io.FileInputStream fis = null;
        java.io.FileOutputStream fos = null;

        try {
            String path = "C:\\Users\\9001037\\IdeaProjects\\test-repo-2\\prop\\lecture7_ex_1.properties";
            fis = new FileInputStream(path);

            // read properties
            java.util.Properties properties = new Properties();
            properties.load(fis);// inputstream load
            String test1Test2Test3 = (String)properties.getProperty("test1.test2.test3");
            System.out.println("test1Test2Test3 :: " + test1Test2Test3);

            // write properties
            fos = new FileOutputStream(path);
            properties.setProperty("test1.test2.testsave2","java에서 입력함2");
            properties.store(fos, "뭐가저장되는거지");
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();

            }
        }
    }

}
