public interface TaskService {

    public Task createTask(final Task task) throws IOExecption;

    public List<Task> getAllTasks();

    public Task getTaskById(final String id);

    public Task updateTask(final String id);

    public Task deleteTask(final String id);
}