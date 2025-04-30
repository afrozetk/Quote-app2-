//Afroze Kassam
//Project  1B
//Date: 4/17/2025


package it372.akassam.proj1b_kassam;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    NotableItems predObject = new NotableItems( );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //add predictions to arraylist

        predObject.addPrediction(getString(R.string.pred1));
        predObject.addPrediction(getString(R.string.pred2));
        predObject.addPrediction(getString(R.string.pred3));
        predObject.addPrediction(getString(R.string.pred4));
        predObject.addPrediction(getString(R.string.pred5));
        predObject.addPrediction(getString(R.string.pred6));
        predObject.addPrediction(getString(R.string.pred7));
        predObject.addPrediction(getString(R.string.pred8));


//create click listener using method 4
//        user has to click on te text to view a new joke
        TextView txtPred = findViewById(R.id.txt_pred);
        txtPred.setOnClickListener(view -> txtPred.setText(predObject.getPrediction()));
    }
}