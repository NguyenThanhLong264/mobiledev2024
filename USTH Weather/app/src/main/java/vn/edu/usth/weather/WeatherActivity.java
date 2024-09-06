package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.weather.ui.theme.ForecastFragment;

public class WeatherActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
//        Weather fragment
        WeatherFragment weatherFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.main, weatherFragment).commit();
//        Forecast fragment
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.main, firstFragment).commit();

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.i("Weather", "Start");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Weather", "Pause");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("Weather", "Resume");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Weather", "Stop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "Destroy");
    }
}