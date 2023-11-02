package practice.student.user_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    final String email ="peter@gmail.com"; // final что бы никто не смог изменить поля ПЕРЕМЕННАЯ СТАЛА СТАТИЧЕСКОЙ не меняеться
    final String password="12345Az!"; // final - переменная не меняеться

    @BeforeEach
    void setUp() {
        user = new User(email,password);
    }

    @Test
    void testCorrectEmail() {
        user.setEmail("peter@yahoo.com");// устанавливаем новый ИМЕЙЛ
        assertEquals("peter@yahoo.com",user.getEmail());
    }

    @Test
    void setWithoutAt() {
      user.setEmail("peter.yahoo.com");
       assertEquals(email,user.getEmail());                                       // делам без собаки
    }
}