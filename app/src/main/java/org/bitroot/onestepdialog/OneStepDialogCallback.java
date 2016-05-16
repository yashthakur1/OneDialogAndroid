package org.bitroot.onestepdialog;

import android.view.View;

/**
 * Created by yashThakur on 16/05/16.
 */
public abstract class OneStepDialogCallback implements View.OnClickListener {


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnYes:
                //write action for on press of btnYes
                btnClickYes();
                break;
            case R.id.btnNo:
                //write action for on press of btnNo
                btnClickNo();
                break;

        }
    }

    abstract public void btnClickYes();

    abstract public void btnClickNo();


}


