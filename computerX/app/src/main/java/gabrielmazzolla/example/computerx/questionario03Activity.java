package gabrielmazzolla.example.computerx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questionario03Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario03);
    }

    public void nextquatro(View view){
        Intent passarrr= new Intent(getApplicationContext(),questionario04Activity.class);
        startActivity(passarrr);
    }
}