
@lombok
@Document
public class Task{

    @id
    String id;

    @Field
    String taskName;

    @Field
    String description;

    @Field
    Date dueDate;

    @Field
    Status status;
}