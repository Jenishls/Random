package example.com.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);

//        double random;
        Random rand = new Random();
//        int n = rand.nextInt(100);
        btnOne.setText(Integer.toString(rand.nextInt(100)));
        btnTwo.setText(Integer.toString(rand.nextInt(100)));

        btn

    }
}
