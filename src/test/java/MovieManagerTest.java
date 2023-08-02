import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test1() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test2() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test3() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.FindAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testlast1() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testlast2() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.FindLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    
}
