package param;

import org.junit.jupiter.api.Test;

import com.cn.test.Calculator;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuatorTest1 {

        @Test
        public void testAdd() {
            int result = Calculator.add(2, 2);
            int result2 = Calculator.add(2, 2);
            assertAll("加法测试",
                    ()->assertEquals(4,result),
                    ()->assertEquals(5,result2),
                    ()->assertEquals(6,result2)
            );
        }


        @Test
        public void testAddParamIsNull() {
            int result = Calculator.add(-4,-8);
            int result1 = Calculator.add(-4,8);
            int result2 = Calculator.add(-4,0);
            assertAll("加法负数参数测试",
                    ()->assertEquals(-12,result),
                    ()->assertEquals(4,result1),
                    ()->assertEquals(-4,result2)
            );
        }
}
