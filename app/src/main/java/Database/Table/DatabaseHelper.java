package Database.Table;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public abstract class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, "data.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Marker.CREATE_Marker_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Marker.TABLE_NAME);
        onCreate(db);

    }
    public void insertlocatin(String latitude,String longitude){
    SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put(Marker.LATITUDE,latitude);
        c.put(Marker.LONGITUDE,longitude);
        db.insert(Marker.TABLE_NAME,null,c);
    }
    public void updatelocation(String id,String latitude,String longitude){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put(Marker.LATITUDE,latitude);
        c.put(Marker.LONGITUDE,longitude);
        db.update(Marker.TABLE_NAME,c,Marker.ID+"=?",new String[]{id});
    }
}
