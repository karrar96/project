package com.example.carlocation;



import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface Dao {
    @Query("SELECT * FROM Location")
    List<Location> orderby();
    @Insert
    void insert(Location location);


}
