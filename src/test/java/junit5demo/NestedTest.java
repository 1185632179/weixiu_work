package junit5demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@DisplayName("购买流程")
public class NestedTest {

        public static Map<String,Object> dataMap = new HashMap<String, Object>();

        @Test
        public void loginTest(){
            dataMap.put("login","登录成功");
        }

        @Nested
        class PayTest{
            @Test
            public void payTest(){
                if(!StringUtils.isBlank(dataMap.get("buy").toString())){
                    System.out.println("正在支付，请稍等");
                }else {
                    System.out.println("你还没有购买！");
                }
            }
        }


        @Nested
        class BuyTest{
            @Test
            void buyTest(){
                if(dataMap.get("login").equals("登录成功")){
                    dataMap.put("buy","购买了线上课程");
                    System.out.println("登录成功，购买了线上课程");
                }else{
                    System.out.println("购买东西，请先登录！");
                }
            }
        }

    }
