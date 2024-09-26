import com.Videogames.Videogame;
import com.users.User;
import java.util.ArrayList;
import java.util.List;

public class categories {
    private List<Videogame> games;

    public categories() {
        this.games = new ArrayList<>();
    }

    public void addGame(Videogame game) {
        games.add(game);
    }

    public List<Videogame> searchByCategory(String category) {
        List<Videogame> result = new ArrayList<>();
        for (Videogame game : games) {
            if (game.getGenre().equalsIgnoreCase(category)) {
                result.add(game);
            }
        }
        return result;
    }

    public List<Videogame> searchByPlatform(String platform) {
        List<Videogame> result = new ArrayList<>();
        for (Videogame game : games) {
            if (game.getPlatforms().contains(platform)) {
                result.add(game);
            }
        }
        return result;
    }
}