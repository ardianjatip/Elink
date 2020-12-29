package id.ac.ui.cs.mobileprogramming.ardian.elink.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;
import java.util.List;
import java.sql.Time;

import id.ac.ui.cs.mobileprogramming.ardian.elink.utils.MyTypeConverter;

@Entity(tableName = "event_table")
//@TypeConverters(MyTypeConverter.class)
public class Event {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "place")
    public String place;

//    @ColumnInfo(name = "date")
//    public Date date;

//    @ColumnInfo(name = "time")
//    public Time time;

    @ColumnInfo(name = "description")
    public String description;

    public Event(String name, String place,  String description) {
        this.name = name;
        this.place = place;
        //this.date = date;
        //this.time = time;
        this.description = description;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPlace() {
        return this.place;
    }

//    public Date getDate() {
//        return this.date;
//    }

//    public Time getTime() {
//        return this.time;
//    }

    public String getDescription(){
        return this.description;
    }
}