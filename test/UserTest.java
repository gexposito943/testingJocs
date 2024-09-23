import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.users.User;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class UserTest {

    User user;
    static final String userName = "userName";

    @BeforeEach
void setUp() {
    user = new User(userName, "pep", "pepe", "pepe1@example.com", LocalDate.of(1997, 2, 4));
}

    @Test
    void getNickname() {
        assertEquals(user.getNickname(), userName);
    }
    @Test
void getName() {
    assertEquals(user.getName(), "pep");
}

@Test
void getLastName() {
    assertEquals(user.getlastName(), "pepe");
}

@Test
void getEmail() {
    assertEquals(user.getemail(), "pepe1@example.com");
}

@Test
void getBirthDate() {
    LocalDate expectedDate = LocalDate.of(1997, 2, 4);
    assertEquals(user.getbirthDate(), expectedDate);
}

}