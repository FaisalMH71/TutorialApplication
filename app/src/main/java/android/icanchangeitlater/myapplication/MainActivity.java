package android.icanchangeitlater.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD

>>>>>>> 06356a3dded0cd8ce2da4e45dd0bd1f5b7065fc2
    public void showText(View view){
        Button btn1 = findViewById(R.id.btn1);
        btn1.setClickable(false);
        btn1.setText("You've clicked me!");

        TextView textv1 = findViewById(R.id.textv1);
        textv1.setText("Get Outa Here Bitch!!");
        textv1.setTextColor(getResources().getColor(R.color.black));
<<<<<<< HEAD
        textv1.setTextSize(40);}
}
=======
        textv1.setTextSize(40);

zdkfjl;sfjk;fjgjdf;gkl;mgkl;

    }
=======
>>>>>>> parent of 9eb5dad (when you click the button it will give you a response and changes it's text to -You've clicked me!- and shows you the TextView -Get Outa Here Bitch!!- with a bigger text!)
}
>>>>>>> 06356a3dded0cd8ce2da4e45dd0bd1f5b7065fc2
