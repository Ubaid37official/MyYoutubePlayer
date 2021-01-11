package youtube.app.myyoutubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {


    private Button formButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        formButton = (Button)findViewById(R.id.btnForm);

        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),FormActivity.class);
                startActivity(intent);

            }
        });

    }
}
