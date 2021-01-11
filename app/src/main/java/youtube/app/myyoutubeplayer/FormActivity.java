package youtube.app.myyoutubeplayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FormActivity extends Activity {

    private EditText txtName,txtPassword;
    private Button btnLogin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        txtName = (EditText)findViewById(R.id.name);
        txtPassword = (EditText)findViewById(R.id.password);

        btnLogin = (Button)findViewById(R.id.login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String Name = txtName.getText().toString();
                final String Password = txtPassword.getText().toString();

                if(Name.equals("ubaid") && Password.equals("1234")){
                    Toast.makeText(getApplicationContext(),"Logged In",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                }



            }
        });




    }
}
