package norakomi.dialogfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogFactory.ThreeButtonCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.but1).setOnClickListener(v ->
                new DialogFactory(this).showDialog(DialogFactory.DIALOG_ONE, this));
        findViewById(R.id.but2).setOnClickListener(v ->
                new DialogFactory(this).showDialog(DialogFactory.DIALOG_TWO, this));
        findViewById(R.id.but3).setOnClickListener(v ->
                new DialogFactory(this).showDialog(DialogFactory.DIALOG_THREE, this));
    }

    @Override
    public void onPositiveButtonClicked() {
        Toast.makeText(this, "Positive button clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNegativeButtonClicked() {
        Toast.makeText(this, "Negative button clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNeutralButtonClicked() {
        Toast.makeText(this, "Neutral button clicked", Toast.LENGTH_SHORT).show();
    }
}
