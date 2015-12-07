package co.eagerapp.manuelro.eager.Common.Helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import co.eagerapp.manuelro.eager.Common.Contracts.SchemaContract;

/**
 * Created by Manuel on 06/12/2015.
 */
public class SchemaBuilderHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Schema.db";

    public SchemaBuilderHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SchemaContract.Course.SQL_CREATE_ENTRIES);
        db.execSQL(SchemaContract.Event.SQL_CREATE_ENTRIES);
        db.execSQL(SchemaContract.EventType.SQL_CREATE_ENTRIES);
        db.execSQL(SchemaContract.Cycle.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SchemaContract.Course.SQL_DELETE_ENTRIES);
        db.execSQL(SchemaContract.Event.SQL_DELETE_ENTRIES);
        db.execSQL(SchemaContract.EventType.SQL_DELETE_ENTRIES);
        db.execSQL(SchemaContract.Cycle.SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
