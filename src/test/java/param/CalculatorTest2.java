package param;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.cn.test.Calculator;
public class CalculatorTest2 {

    @Test
    public void testAdd() {
        Assert.assertEquals("加法测试",4,Calculator.add(2,2));
    }

    @Test
    public void testJianfa() {
        Assert.assertEquals("减法测试",4,Calculator.jianfa(6,2));
    }

    @Test
    public void testShengfa() {
        Assert.assertEquals("乘法测试",4,Calculator.shengfa(2,2));
    }

    @Test
    public void testChufa() {
        Assert.assertEquals("除法测试",3,Calculator.chufa(6,2));
    }

    @Test
    public void testLeijia() {
        Assert.assertEquals("累加测试",7,Calculator.leijia(6));
    }
}
