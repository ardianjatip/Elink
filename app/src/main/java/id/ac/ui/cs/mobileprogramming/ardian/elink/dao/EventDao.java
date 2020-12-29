package id.ac.ui.cs.mobileprogramming.ardian.elink.dao;

import id.ac.ui.cs.mobileprogramming.ardian.elink.entity.Event;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EventDao {
    @Insert
    void insert(Event event);

    @Update
    void update(Event event);

    @Delete
    void delete(Event event);

    @Query("DELETE FROM event_table")
    void deleteAllKegiatan();

    @Query("SELECT * FROM event_table ORDER BY name DESC")
    LiveData<List<Event>> getAllEvent();

//    @Query("SELECT * FROM event_table WHERE datetime(date/1000, 'unixepoch', 'localtime') > datetime('now', 'localtime')  ORDER BY date ASC")
//    LiveData<List<Event>> getFutureEvent();

//    @Query("SELECT * FROM event_table WHERE datetime(date/1000, 'unixepoch', 'localtime') < datetime('now', 'localtime') ORDER BY date DESC")
//    LiveData<List<Event>> getPastEvent();

    @Query("SELECT * FROM event_table WHERE id=:id")
    LiveData<Event> getEventById(String id);
}
