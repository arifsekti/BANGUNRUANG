package id.bangunruang.bangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TabungActivity extends AppCompatActivity {

    private EditText JariJari;
    private Button hitungtabung;
    private TextView hasiltabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        JariJari = (EditText) findViewById(R.id.JariJari);
        hitungtabung = (Button) findViewById(R.id.hitungtabung);
        hasiltabung = (TextView) findViewById(R.id.hasiltabung);

        hitungtabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jarijari = JariJari.getText().toString().trim();
                double luas = 3.14 *(jarijari * jarijari) ;

                hasiltabung.setText("Luas tabung : " + luas);
            }
        });
    }
}
