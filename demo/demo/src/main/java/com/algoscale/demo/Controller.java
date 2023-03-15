


@RestController("/tasks")
public class Controller{

        @Autowired
        TaskService taskService;

        @PostMapping()
        ResponseEntity<Task> createTask(Task task){
                try{
                     return new ResponseEntity<>(taskService.createTask(task));
                }
                catch (IOExecption ioExecption)
                {
                        return new ResponseEntity<>(null, ioExecption);
                }
                catch(Execption execption){
                        return new ResponseEntity<>(null, execption);
                }

        }

        @GetMapping()
        ResponseEntity<List<Task>> getAllTasks(){
                try{
                        return new ResponseEntity<>(taskService.getAllTasks());
                }
                catch (IOExecption ioExecption)
                {
                        return new ResponseEntity<>(null, ioExecption);
                }
                catch(Execption execption){
                        return new ResponseEntity<>(null, execption);
                }

        }

        @GetMapping()
        ResponseEntity<List<Task>> getTaskById(@requestParam("/id") String id){
                try{
                        return new ResponseEntity<>(taskService.getTaskById(id));
                }
                catch (IOExecption ioExecption)
                {
                        return new ResponseEntity<>(null, ioExecption);
                }
                catch(Execption execption){
                        return new ResponseEntity<>(null, execption);
                }

        }

        @PutMapping()
        ResponseEntity<List<Task>> updateTaskById(@requestParam("/id") String id){
                try{
                        return new ResponseEntity<>(taskService.updateTaskById(id));
                }
                catch (IOExecption ioExecption)
                {
                        return new ResponseEntity<>(null, ioExecption);
                }
                catch(Execption execption){
                        return new ResponseEntity<>(null, execption);
                }

        }

        @PutMapping()
        ResponseEntity<List<Task>> deleteTaskById(@requestParam("/id") String id){
                try{
                        return new ResponseEntity<>(taskService.deleteTaskById(id));
                }
                catch (IOExecption ioExecption)
                {
                        return new ResponseEntity<>(null, ioExecption);
                }
                catch(Execption execption){
                        return new ResponseEntity<>(null, execption);
                }

        }



        }