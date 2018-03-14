package com.irozon.alertsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.irozon.alertview.AlertActionStyle;
import com.irozon.alertview.AlertStyle;
import com.irozon.alertview.AlertTheme;
import com.irozon.alertview.objects.AlertAction;
import com.irozon.alertview.AlertView;

/**
 * Created by hammad.akram on 3/14/18.
 */

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.btShow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertView alert = new AlertView("Delete", "Sure??????", AlertStyle.IOS);
                alert.addAction(new AlertAction("Sure Delete", AlertActionStyle.DEFAULT, action -> {

                }));
                alert.addAction(new AlertAction("Sure Delete", AlertActionStyle.NEGATIVE, action -> {
                    Toast.makeText(Main2Activity.this, action.getTitle(), Toast.LENGTH_SHORT).show();
                }));
                alert.addAction(new AlertAction("Sure Delete", AlertActionStyle.DEFAULT, action -> {
                    Toast.makeText(Main2Activity.this, action.getTitle(), Toast.LENGTH_SHORT).show();

                }));
                alert.addAction(new AlertAction("Sure Delete", AlertActionStyle.DEFAULT, action -> {
                    Toast.makeText(Main2Activity.this, action.getTitle(), Toast.LENGTH_SHORT).show();

                }));
                alert.setTheme(AlertTheme.DARK);
                alert.show(Main2Activity.this);


            }
        });
    }
}
