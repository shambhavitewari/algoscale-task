

 public class TaskRepository implements BaseMongoDBQuery{

 public Task createTask(final Task task){

  Query query = new Query().where("task").is(task);

  return mongoTemplate.create(query, "task", Tasks.class);
 }


 public List<Task> getAllTasks(){
   return mongoTemplate.getAll("task", Tasks.class);
 }



 }