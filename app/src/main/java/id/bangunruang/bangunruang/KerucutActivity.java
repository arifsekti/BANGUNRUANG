package id.bangunruang.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KerucutActivity extends AppCompatActivity {

    private EditText JarieditText,GLukiseditText;
    private Button buttonHitungKerucut;
    private TextView HasilKerucut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        JarieditText = (EditText) findViewById(R.id.JarieditText);
        GLukiseditText = (EditText) findViewById(R.id.GLukiseditText);
        buttonHitungKerucut = (Button) findViewById(R.id.buttonHitungKerucut);
        HasilKerucut = (TextView) findViewById(R.id.HasilKerucut);

        buttonHitungKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jarijari = JarieditText.getText().toString().trim();
                String Glukis = GLukiseditText.getText().toString().trim();


                double r = Double.parseDouble(jarijari);
                double GL = Double.parseDouble(Glukis);
                double luas = 3.14 *r * GL ;

                HasilKerucut.setText("Luas Selimut Kerucut = " + luas);
            }
        });
    }
}
