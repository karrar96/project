package com.example.carlocation;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Location {
    @PrimaryKey(autoGenerate = true )
    private int id;

  private   Long latitude;
  private   Long longitude;

}
