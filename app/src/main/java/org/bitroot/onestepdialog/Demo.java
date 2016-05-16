package org.bitroot.onestepdialog;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Demo extends AppCompatActivity {

    private Context context;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        context=getApplicationContext();
        btnShow=(Button)findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }

    public void showDialog()
    {
        OneStepDialog.show(context, 0, false, new OneStepDialogCallback() {
            @Override
            public void btnClickYes() {
                OneStepDialog.dismissOneStepDialog();
            }

            @Override
            public void btnClickNo() {
                OneStepDialog.dismissOneStepDialog();
            }
        });
    }
}
