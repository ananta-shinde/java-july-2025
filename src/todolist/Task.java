package todolist;

public class Task {

    private int id;
    private String description;
    private String status;

    public Task(int id){
        this.id = id;
        this.status = "pending";
    }

    public int getId() {
        return id;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status ;

    }
}
