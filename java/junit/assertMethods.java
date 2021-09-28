import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {
    @Test
    public void test(){
        int val1=5;
        int val2=6;
        assertTrue(val1<val2);
        assertFalse(val1>val2);

        String str1 = "abc";
        String str2 = "abc";

        //check for references
      assertSame(str1,str2);

        String[] arr={"one","two","three"};
        String[] arr1={"one","two","three"};

        assertArrayEquals(arr,arr1);
      

        

    }
}
