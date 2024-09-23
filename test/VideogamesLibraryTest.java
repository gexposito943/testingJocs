import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.users.User;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class VideogamesLibraryTest {

    private VideogamesLibrary library;

    @BeforeEach
    void setUp() {
        library = new VideogamesLibrary();
    }

    @Test
    void findExistingVideogame() {
        User user = new User("josep2", "josep", "espo", "espo@example.com", LocalDate.of(1998, 1, 1));
        Videogame game = library.find(user, "Return to Monkey Island");
        assertNotNull(game);
        assertEquals("Return to Monkey Island", game.getName());
    }

    @Test
    void findNonExistingVideogame() {
      User user = new User("robert", "robert", "robert3", "robee@example.com", LocalDate.of(2000, 1, 1));
        Videogame game = library.find(user, "Non-existing Game");
        assertNull(game);
    }

    @Test
    void userAddedToConsultedList() {
      User user = new User("mariaa1", "Maria", "marieta", "marietas@example.com", LocalDate.of(2004, 1, 1));
        Videogame game = library.find(user, "Return to Monkey Island");
        assertTrue(game.getUsersWhoHaveConsulted().contains(user));
    }
}
