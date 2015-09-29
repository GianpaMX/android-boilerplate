package mx.segundamano.android.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mx.segundamano.android.R;
import mx.segundamano.android.utils.Counter;

/**
 * Created by gianpa on 9/29/15.
 */
public class MainActivity extends AppCompatActivity {

    private Counter counter;
    private EditText counterEditText;
    private Button plusButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null) {
            counter = new Counter(savedInstanceState.getInt("counter", 0));
        } else {
            counter = new Counter();
        }

        counterEditText = (EditText) findViewById(R.id.counterEditText);
        plusButton = (Button) findViewById(R.id.plusButton);

        counterEditText.setText(counter.value().toString());

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.increase();
                counterEditText.setText(counter.value().toString());
            }
        });
    }
}
