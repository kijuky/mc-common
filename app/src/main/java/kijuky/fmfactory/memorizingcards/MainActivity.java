package kijuky.fmfactory.memorizingcards;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = getViewById(Button.class, R.id.button_start);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final Intent intent = new Intent(MainActivity.this, CardActivity.class);
                intent.putExtra(CardActivity.EXTRA_QUESTION_ID, 1);
                startActivityForResult(intent, 0);
            }
        });
    }

    @NonNull
    private <V extends View> V getViewById(final Class<V> clazz, final int id) {
        View ret = findViewById(id);
        assert ret != null;
        return clazz.cast(ret);
    }
}
