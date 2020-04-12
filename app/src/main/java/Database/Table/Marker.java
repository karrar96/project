package Database.Table;

import android.provider.ContactsContract;

import java.util.Date;

public abstract class Marker {
    public final static String TABLE_NAME="marker";
    public final static String ID ="id";
    public final static String LATITUDE ="latitude";
    public final static String LONGITUDE ="longitude";
    public final static java.util.Date Date = new Date();
   public final static String CREATE_Marker_TABLE = "CREATE TABLE_NAME (ID in pk at,LATITUDE double,LONGITUDE double )";

}
