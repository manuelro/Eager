package co.eagerapp.manuelro.eager.EventType.Plain;

/**
 * Created by Jose on 24/11/2015.
 */
public class EventTypeModel {
    String name;
    String description;

    public EventTypeModel(String name) {
        this.name = name;
    }

    public EventTypeModel(String name, String description) {
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
