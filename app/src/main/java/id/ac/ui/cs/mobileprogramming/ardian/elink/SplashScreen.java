package id.ac.ui.cs.mobileprogramming.ardian.elink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import id.ac.ui.cs.mobileprogramming.ardian.elink.medicine.MedicineActivity;

public class SplashScreen extends AppCompatActivity implements Runnable {

    Thread mThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        mThread = new Thread(this);

        mThread.start();
    }

    @Override
    public void run(){
        try {
            Thread.sleep(8000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            startActivity(new Intent(getApplicationContext(), MedicineActivity.class));

            finish();
        }
    }
}