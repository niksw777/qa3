import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass getter = new MainClass();



    @Test
    public void testGetClassString() {
        if (getter.getClassString().contains("hello")) {
            System.out.println(" Подстрока успешно найдена ");
        }
        else if(getter.getClassString().contains("Hello")) {
            System.out.println(" Подстрока успешно найдена ");
        }
        else {
            Assert.fail();
            System.out.println(" Такой строки нет ");

        }
    }

}




