package gabrielmazzolla.example.computerx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questionario04Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario04);
    }

    public void finish(View view){
        Intent finish= new Intent(getApplicationContext(),ComputadoresActivity.class);
        startActivity(finish);
    }
}