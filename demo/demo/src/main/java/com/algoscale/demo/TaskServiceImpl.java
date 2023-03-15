
@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepository taskRepo;

    @Override
    public Task createTask(final Task task) throws IOExecption{
        if(task.isEmpty() && task.getId == null){
            return new IOExecption();
        }else{
            return taskRepo.createTask();

        }
    }

    @Override
    public List<Task> getAllTasks()throws IOExecption{
        return taskRepo.getAllTask();
    }

    public Task getTaskById(final String id) throws IOExecption{
        if(id.isEmpty()){
            return new IOExecption();
        }else{
            return taskRepo.getTaskById(String Id);
        }
    }

    public Task updateTask(final String id);

    public Task deleteTask(final String id);



}