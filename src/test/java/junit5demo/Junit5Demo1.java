package junit5demo;

import org.junit.jupiter.api.*;



@DisplayName("junit5演示类1")
public class Junit5Demo1 {

        @Test
        @Tag("devdemo")
        @DisplayName("登录")
        public void test_001(){
            System.out.println("in test_001");
        }

        @Test
        @Tag("devdemo")
        @DisplayName("登录")
        public void test_005(){
            System.out.println("in test_005");
        }

        @Test
        @Tag("prodemo")
        @DisplayName("登录2")
        public void test_004(){
            System.out.println("in test_004");
        }

        @Test
        @Tag("fatdemo")
        @DisplayName("支付")
        @RepeatedTest(5) //重复执行5次
        public void test_003(){
            System.out.println("当前线程："+Thread.currentThread().getName());
            System.out.println("in test_003");
        }

        @Test
        @Disabled
        public void test_002(){
            System.out.println("in test_002");
        }

    }

