import com.Videogames.Videogame;
import com.users.User;
import com.Videogames.Review;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ReviewTest {

    @Test
    public void testAddReview() {
        //es crea el usuari 
        User user = new User("guillem", "guille", "espo", "guille@example.com", LocalDate.of(1997, 9, 10));
        
        Videogame game = new Videogame("The Witcher 3");
            game.setGenre("RPG");
            game.setPlatforms("PC");
            game.setPrice(39.99f);
        
        //es crea la reseña
        Review review = new Review(user, game, "Great game!", 5);

        assertEquals("Great game!", review.getComment());
        assertEquals(5, review.getRating());
        assertEquals(user, review.getUser());
        assertEquals(game, review.getVideogame());
    }
}