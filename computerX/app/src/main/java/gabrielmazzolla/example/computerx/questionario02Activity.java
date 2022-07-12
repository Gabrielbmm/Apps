package gabrielmazzolla.example.computerx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questionario02Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario02);
    }

    public void nexttres(View view){
        Intent passarr= new Intent(getApplicationContext(),questionario03Activity.class);
        startActivity(passarr);
    }
}