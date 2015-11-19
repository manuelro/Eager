package co.eagerapp.manuelro.eager.Alarm.Plain;

import android.app.PendingIntent;

import java.util.Date;

/**
 * Created by JuanFélix on 12/11/2015.
 */
public class AlarmModel {

    private String title;
    private Date start;
    private Date validThrough;
    private PendingIntent pendingIntent;

    public AlarmModel(String title, Date start, Date validThrough, PendingIntent pendingIntent) {
        this.title = title;
        this.start = start;
        this.validThrough = validThrough;
        this.pendingIntent = pendingIntent;
    }

    public AlarmModel(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getValidThrough() {
        return validThrough;
    }

    public void setValidThrough(Date validThrough) {
        this.validThrough = validThrough;
    }

    public PendingIntent getPendingIntent() {
        return pendingIntent;
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }
}
