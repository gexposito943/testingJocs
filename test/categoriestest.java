import com.Videogames.Videogame;
import com.Videogames.VideogamesLibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class categoriestest {

    @Test
    public void testSearchByCategory() {
        VideogamesLibrary library = new VideogamesLibrary();
        Videogame witcher = new Videogame("The Witcher 3");
        witcher.setGenre("RPG");
        witcher.setPlatforms("PC");
        witcher.setPrice(39.99f);
        library.addGame(witcher);

        Videogame fifa = new Videogame("FIFA 22");
        fifa.setGenre("Sports");
        fifa.setPlatforms("PS4");
        fifa.setPrice(59.99f);
        library.addGame(fifa);

        List<Videogame> rpgGames = library.searchByCategory("RPG");

        assertEquals(1, rpgGames.size());
        assertEquals("The Witcher 3", rpgGames.get(0).getName());
    }

    @Test
    public void testSearchByPlatform() {
        VideogamesLibrary library = new VideogamesLibrary();
        Videogame witcher = new Videogame("The Witcher 3");
        witcher.setGenre("RPG");
        witcher.setPlatforms("PC");
        witcher.setPrice(39.99f);
        library.addGame(witcher);

        Videogame fifa = new Videogame("FIFA 22");
        fifa.setGenre("Sports");
        fifa.setPlatforms("PS4");
        fifa.setPrice(59.99f);
        library.addGame(fifa);

        List<Videogame> pcGames = library.searchByPlatform("PC");

        assertEquals(1, pcGames.size());
        assertEquals("The Witcher 3", pcGames.get(0).getName());
    }
}