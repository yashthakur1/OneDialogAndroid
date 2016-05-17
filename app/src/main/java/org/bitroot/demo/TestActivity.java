package org.bitroot.demo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.bitroot.onestepdialog.OneStepDialog;
import org.bitroot.onestepdialog.OneStepDialogCallback;

public class TestActivity extends AppCompatActivity {

    Context context;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        context = this;
        btnShow = (Button) findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    public void showDialog() {
        OneStepDialog.show(context, R.drawable.demo_image, true, new OneStepDialogCallback() {
            @Override
            public void btnClickYes() {
                OneStepDialog.dismissOneStepDialog();
            }

            @Override
            public void btnClickNo() {
                OneStepDialog.dismissOneStepDialog();

            }
        }, "Dialog Success", "Dialog description", "Yes", "No");
    }
}
