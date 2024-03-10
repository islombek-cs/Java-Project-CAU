import java.util.ArrayList;

public class Todo{
    private String description;
    private String deadline;
    private boolean isCompleted;

    public Todo(String description, String deadline){
        this.description = description;
        this.deadline = deadline;
        this.isCompleted = false;
        ArrayList<String> tasks = new ArrayList<>();
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDeadline(){
        return deadline;
    }

    public void setDeadline(String deadline){
        this.deadline = deadline;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setCompleted(boolean completed){
        this.isCompleted = completed;
    }

    @Override
    public String toString(){
        return description + " " + deadline + " " + isCompleted;
    }
}