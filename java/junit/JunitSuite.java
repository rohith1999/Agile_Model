public class MessageUtil {

    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public String salutationMessage() {
        message="Hello, ";
        System.out.println(message);
        return message;
    }


}

//test 1
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Test1 {

    String message = "Rohith";
    MessageUtil messageUtil=new MessageUtil(message);

    @Test
    public void test() {
        System.out.println("Inside test 1 : testing print message method");
        assertEquals(message,messageUtil.printMessage());

    }
}

//test 2

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Test2 {

    String message = "Hello, ";
    MessageUtil messageUtil=new MessageUtil(message);

    @Test
    public void test() {
        System.out.println("Inside test 2 : testing print message method");
        assertEquals(message,messageUtil.salutationMessage());

    }
}

//test suite
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                Test1.class,
                Test2.class
        }
)
public class TestSuite  {

}

