package android.competition.contackbook;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ImageButton addContact = (ImageButton) findViewById(R.id.IBaddContact);
         addContact.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 Intent addContact = new Intent(MainActivity.this, AddContact_Activity2.class);
                 startActivity(addContact);
             }
        });
    }
}
