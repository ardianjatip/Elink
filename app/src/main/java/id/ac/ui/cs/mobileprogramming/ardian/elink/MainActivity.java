package id.ac.ui.cs.mobileprogramming.ardian.elink;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

import androidx.lifecycle.LiveData;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import java.util.List;

import id.ac.ui.cs.mobileprogramming.ardian.elink.dao.EventDao;
import id.ac.ui.cs.mobileprogramming.ardian.elink.database.AppDatabase;
import id.ac.ui.cs.mobileprogramming.ardian.elink.entity.Event;
import id.ac.ui.cs.mobileprogramming.ardian.elink.ui.home.HomeFragment;
import id.ac.ui.cs.mobileprogramming.ardian.elink.AddEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_history, R.id.navigation_settings)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "elink-database").build();
        EventDao eventDao = db.eventDao();
        LiveData<List<Event>> event = eventDao.getAllEvent();


        //getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        FloatingActionButton addEvent = findViewById(R.id.add_event);
        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddEvent.class));
            }
        });

        //String lang = Resources.getSystem().getConfiguration().locale.getLanguage();
    }

}