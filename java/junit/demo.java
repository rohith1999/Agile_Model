public class EvenOddClass {

    public boolean isEvenNumber(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
}

//test class
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenTest {
    @Test
    public void testEven(){

        EvenOddClass evenOddClass=new EvenOddClass();
        assertEquals(true,evenOddClass.isEvenNumber(18));

    }

    @Test
    public void testOdd(){

        EvenOddClass evenOddClass=new EvenOddClass();
        assertEquals(false,evenOddClass.isEvenNumber(13));

    }





}
