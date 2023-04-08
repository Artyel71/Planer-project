import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void searchTestEpicIfCoincidence() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(79, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchTestEpicIfNoCoincidence() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(79, subtasks);
        boolean expected = false;
        boolean actual = epic.matches("Whisky");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchTestMeetingIfCoincidence() {

        Meeting meeting = new Meeting(79,
                "Выкатка 3й версии приложения",
                "Bank VTI",
                "Во вторник после обеда");
        boolean expected = true;
        boolean actual = meeting.matches("VTI");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchTestMeetingIfNoCoincidence() {

        Meeting meeting = new Meeting(79,
                "Выкатка 3й версии приложения",
                "Bank VTI",
                "Во вторник после обеда");
        boolean expected = false;
        boolean actual = meeting.matches("VW");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchTestSimpleTaskIfCoincidence() {

        SimpleTask simpleTask = new SimpleTask(67, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchTestSimpleTaskIfNoCoincidence() {

        SimpleTask simpleTask = new SimpleTask(67, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Позвонить ne родителям");
        Assertions.assertEquals(expected, actual);
    }


}
