package id.ac.ui.cs.mobileprogramming.ardian.elink.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import id.ac.ui.cs.mobileprogramming.ardian.elink.utils.MyTypeConverter;

@Entity(tableName = "user_table")
@TypeConverters(MyTypeConverter.class)
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;

    private String bio;

    public User(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public void setId(int id) {
        this.id = id;
    }
}
