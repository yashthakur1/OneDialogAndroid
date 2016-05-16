package org.bitroot.onestepdialog;

import android.view.View;

/**
 * Created by yashThakur on 16/05/16.
 */
public abstract class OneStepDialogCallback implements View.OnClickListener {


    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.btnYes) {
            btnClickYes();
            return;
        }
        if (v.getId() == R.id.btnNo) {
            btnClickNo();
            return;
        }
    }

    abstract public void btnClickYes();

    abstract public void btnClickNo();


}


