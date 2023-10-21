package junit;

import org.junit.jupiter.api.*;

public class FirstJunitTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("    Это метод @BeforeAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("    Это метод afterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("    Это метод BeforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("    Это метод AfterEach");

    }

    @Test
    void firstTest(){
        System.out.println("    Это first тест");
        Assertions.assertTrue(3>2);
    }

    @Test
    void secondTest(){
        System.out.println("    Это second тест");
        Assertions.assertTrue(3>2);
    }
}
