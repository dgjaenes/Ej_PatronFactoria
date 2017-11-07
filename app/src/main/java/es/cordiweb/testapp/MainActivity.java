package es.cordiweb.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= (TextView)findViewById(R.id.tw1);
        Bread bread = BreadFactory.getBread("BAG");

        textView.setText(new StringBuilder()
                .append(bread.name())
                .append("\n")
                .append(BreadFactory.getBread("ROL").name())
                .append("\n")
                .append(BreadFactory.getBread("SLI").name())
                .toString());

    }
}
