import java.util.ArrayList;

public class TodoRunner{
    ArrayList<Todo> tasks = new ArrayList<>();
    public void run(){
        Todo t1 = new Todo("Coding Java", "2024-03-11");
        Todo t2 = new Todo("Washing clothes", "2024-03-10");
        tasks.add(new Todo("Going to GYM", "2024-03-15"));

        tasks.add(t1); tasks.add(t2);

        // This line of code is used to print all created tasks in Array.
        System.out.println("\nAll tasks list:");
        for (Todo task: tasks){
            System.out.println(task);
        }

        markAsCompleted(1);
        pendingTasks();
        removeTasks(2);
    }

    // Completion code section in this line.
    public void markAsCompleted(int taskID){
        boolean flag = false;
        if (taskID >= 0 && taskID < tasks.size()){
            tasks.get(taskID).setCompleted(true);
        }

        System.out.println("\nCompleted tasks:");

        for (Todo task: tasks){
            if(task.isCompleted()){
                System.out.println(task);
                flag = true;
            }
        }
        if (!flag){System.out.println("Not completed any tasks yet!");}
    }

    // Pending code section for tasks
    public void pendingTasks(){
        boolean flag = false;
        System.out.println("\nPending tasks:");
        for (Todo task: tasks){
            if (!task.isCompleted()){
                System.out.println("Pending: "+task);
                flag = true;
            }
        }
        if (!flag){System.out.println("Not pending tasks yet!");}
    }

    // Removing tasks code section
    public void removeTasks(int taskId){
        System.out.println("\nRemoved tasks:");
        if(taskId >= 0 && taskId < tasks.size()){
            tasks.remove(taskId);
        }
        for (Todo task: tasks){
            System.out.println(task);
        }
    }

}


