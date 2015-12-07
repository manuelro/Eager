package co.eagerapp.manuelro.eager.Common.Contracts;

import android.provider.BaseColumns;

/**
 * Created by Manuel on 06/12/2015.
 */
public final class SchemaContract {
    private static final String TEXT_TYPE = " TEXT";
    private static final String INT_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            Course.SQL_CREATE_ENTRIES +
                    Event.SQL_CREATE_ENTRIES +
                    EventType.SQL_CREATE_ENTRIES +
                    Cycle.SQL_CREATE_ENTRIES;

    public static final String SQL_DELETE_ENTRIES =
            Course.SQL_DELETE_ENTRIES +
                    Event.SQL_DELETE_ENTRIES +
                    EventType.SQL_DELETE_ENTRIES +
                    Cycle.SQL_DELETE_ENTRIES;

    public SchemaContract() {};

    public static abstract class Course implements BaseColumns{
        public static final String TABLE_NAME = "courses";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_SUITE = "suite";
        public static final String COLUMN_NAME_CYCLE_ID = "cycle_id";


        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Course.TABLE_NAME + " (" +
                        Course._ID + " INTEGER PRIMARY KEY," +
                        Course.COLUMN_NAME_ID + INT_TYPE + COMMA_SEP +
                        Course.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                        Course.COLUMN_NAME_SUITE + TEXT_TYPE + COMMA_SEP +
                        Course.COLUMN_NAME_CYCLE_ID + INT_TYPE  +
                " )";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Course.TABLE_NAME;

    }

    public static abstract class Event implements BaseColumns{
        public static final String TABLE_NAME = "events";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_ACTIVITY_TYPE_ID = "activity_type_id";


        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Event.TABLE_NAME + " (" +
                        Event._ID + " INTEGER PRIMARY KEY," +
                        Event.COLUMN_NAME_ID + INT_TYPE + COMMA_SEP +
                        Event.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                        Event.COLUMN_NAME_ACTIVITY_TYPE_ID + INT_TYPE +
                        " )";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Event.TABLE_NAME;
    }

    public static abstract class EventType implements BaseColumns{
        public static final String TABLE_NAME = "event_types";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_NAME = "name";


        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + EventType.TABLE_NAME + " (" +
                        EventType._ID + " INTEGER PRIMARY KEY," +
                        EventType.COLUMN_NAME_ID + INT_TYPE + COMMA_SEP +
                        EventType.COLUMN_NAME_NAME + TEXT_TYPE +
                        " )";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + EventType.TABLE_NAME;
    }

    public static abstract class Cycle implements BaseColumns{
        public static final String TABLE_NAME = "cycles";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_DURATION = "duration";


        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Cycle.TABLE_NAME + " (" +
                        Cycle._ID + " INTEGER PRIMARY KEY," +
                        Cycle.COLUMN_NAME_ID + INT_TYPE + COMMA_SEP +
                        Cycle.COLUMN_NAME_DURATION + TEXT_TYPE +
                        " )";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Cycle.TABLE_NAME;
    }

}
