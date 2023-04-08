
public class Epic extends Task {
    protected String[] subtasks = new String[0];


    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {

        return subtasks;
    }


    @Override
    public boolean matches(String query) {

        for (String subtask : subtasks) {
            //for (int i = 0; i < subtasks.length ; i++) {

            if (subtask.contains(query)) {

                return true;
            }
        }
        return false;
    }
}




