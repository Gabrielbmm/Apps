package gabrielmazzolla.example.computerx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void autenticar(View view){
        Intent logar= new Intent(getApplicationContext(),questionario01Activity.class);
        startActivity(logar);
    }

    public void cadastrar(View view){
        Intent novo = new Intent(getApplicationContext(),CadastrarActivity.class);
        startActivity(novo);
    }
}
