package     com.Alex87.miApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTexusername;
    private EditText editTextPassword;
    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview(){
        editTexusername = findViewById(R.id.editTexusername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loguin();

                    }
                }
        );

    }

    private void loguin(){
        String username= editTexusername.getText().toString();
        String password = editTextPassword.getText().toString();
        if (username.contentEquals("Alex")&& password.contentEquals("1234")){
            // loguaado
            editTexusername.setError(null);
            editTextPassword.setError(null);
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();
            goToOnepiece();
        }
        else {
            editTexusername.setError("usuario o contraseña incorrecto");
            editTextPassword.setError("usuario o contraseña incorrecto");
        }
    }

    private void goToOnepiece(){
        Intent transaction = new Intent(this,Pokemonactivity.class);
        startActivity(transaction);
    }
}