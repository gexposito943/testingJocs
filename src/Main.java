import java.time.LocalDate;
import java.util.Set;

import com.users.User;

public class Main {
    public static void main(String[] args) {
        VideogamesLibrary library = new VideogamesLibrary();

        User guille = new User("guille1","guille@gmail.com","guillem","guilleem",LocalDate.of(1997, 5, 22));
        Videogame videogame1 = library.find(guille, "Return to Monkey Island");
        videogame1.showData();

        User pep = new User("pep2","peep@gmail.com", "Pep", "smtih",LocalDate.of(1999, 4, 4));
        Videogame videogame2 = library.find(pep, "Return to Monkey Island");
        videogame2.showData();

        System.out.println("\n** USERS WHO HAVE CONSULTED");
        Set<User> usersWhoHaveConsulted = videogame1.getUsersWhoHaveConsulted();
        for (User user : usersWhoHaveConsulted) {
            System.out.println(user.getNickname());
        }
    }
}