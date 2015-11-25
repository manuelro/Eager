package co.eagerapp.manuelro.eager.Activity;

/**
 * Created by Jose Pablo on 23/11/2015.
 */
public class ActivityType {
    String name;
    String description;

    public ActivityType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
