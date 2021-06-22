package android.icanchangeitlater.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view){
        Button btn1 = findViewById(R.id.btn1);
        btn1.setClickable(false);
        btn1.setText("You've clicked me!");

        TextView textv1 = findViewById(R.id.textv1);
        textv1.setText("Get Outa Here!!");
        textv1.setTextColor(getResources().getColor(R.color.design_default_color_error));
        textv1.setTextSize(50);
    }
}