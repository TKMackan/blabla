public class Bug{
    private int id;
    private String title;
    private String description;
    private String stepsToReproduce;
    private enum priority{
       HIGH,
       MEDIUM,
       LOW
    };
    private enum severity{
        CRITICAL,
        MAJOR,
        MINOR
    };
    private enum status{
        ACTIVE,
        FIXED
    };
    private String comment;

    public Bug(String title, String description, String stepsToReproduce, String comment) {
        this.title = title;
        this.description = description;
        this.stepsToReproduce = stepsToReproduce;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStepsToReproduce() {
        return stepsToReproduce;
    }

    public void setStepsToReproduce(String stepsToReproduce) {
        this.stepsToReproduce = stepsToReproduce;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}