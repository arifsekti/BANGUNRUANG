package id.bangunruang.bangunruang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Kubusbutton=(Button)findViewById(R.id.Kubusbutton);
        Button Kerucutbutton=(Button)findViewById(R.id.Kerucutbutton);
        Button Balokbutton=(Button)findViewById(R.id.Balokbutton);
        Button Tabungbutton=(Button) findViewById(R.id.Tabungbutton);



        Kubusbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),KubusActivity.class);

                startActivity(i);

            }

        });

        Kerucutbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),KerucutActivity.class);

                startActivity(i);

            }

        });

        Balokbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),BalokActivity.class);

                startActivity(i);

            }

        });

        Tabungbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),TabungActivity.class);

                startActivity(i);

            }

        });


    }


}
