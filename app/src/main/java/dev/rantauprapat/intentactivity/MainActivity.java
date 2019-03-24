package dev.rantauprapat.intentactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Activity(); //Sesuaikan dengan nama class activity2
            }
        });
    }
    public void openMain2Activity(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
