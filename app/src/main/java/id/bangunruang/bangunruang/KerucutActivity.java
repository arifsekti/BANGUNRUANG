package id.bangunruang.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KerucutActivity extends AppCompatActivity {

    private EditText JarieditText,TinggieditText;
    private Button buttonHitungKerucut;
    private TextView HasilKerucut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        JarieditText = (EditText) findViewById(R.id.JarieditText);
        TinggieditText = (EditText) findViewById(R.id.TinggieditText);
        buttonHitungKerucut = (Button) findViewById(R.id.buttonHitungKerucut);
        HasilKerucut = (TextView) findViewById(R.id.HasilKerucut);

        buttonHitungKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jarijari = JarieditText.getText().toString().trim();
                String tinggi = TinggieditText.getText().toString().trim();

                double LuasAlas =3.14*( Double.parseDouble(jarijari)*Double.parseDouble(jarijari));
                double t = Double.parseDouble(tinggi);
                double luas = 3.14 *LuasAlas * t ;

                HasilKerucut.setText("Luas selimut : " + luas);
            }
        });
    }
}
