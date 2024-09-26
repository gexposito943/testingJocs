import com.users.User;
import com.users.login;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class LoginTest {
    
    @Test
    public void testUserRegistration() {
        User user = new User("guillem", "guille", "espo", "guille@example.com", LocalDate.of(1997, 9, 10));
        
        assertEquals("guillem", user.getNickname());
        assertEquals("guille", user.getName());
        assertEquals("espo", user.getLastName());
        assertEquals("guille@example.com", user.getEmail());
        assertEquals(LocalDate.of(1997, 9, 10), user.getBirthDate());
    }

    @Test
    public void testUserLogin() {
        User user = new User("guillem", "guille", "espo", "guille@example.com", LocalDate.of(1997, 9, 10));
        login login = new login();
        login.registrar(user);

        boolean haIniciadoSesion = login.iniciarSesion("guillem", "guille@example.com");
        assertTrue(haIniciadoSesion);
    }
}