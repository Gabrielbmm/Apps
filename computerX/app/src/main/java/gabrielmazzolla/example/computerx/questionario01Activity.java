package gabrielmazzolla.example.computerx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questionario01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario01);
    }

    public void nextdois(View view){
        Intent passar= new Intent(getApplicationContext(),questionario02Activity.class);
        startActivity(passar);
    }
}