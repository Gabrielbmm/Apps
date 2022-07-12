package gabrielmazzolla.example.computerx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }

    public void inicio(View view){
        Intent back = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(back);
    }
}
