package org.bitroot.onestepdialog;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yashThakur on 16/05/16.
 */
public class OneStepDialog {

    public static Dialog dialogBase;

    /**
     * @param context
     * @param imageDrawable   pass 0 to hide image
     * @param onClickListener
     * @param stringContent   To Change the title ,content & button name pass String parameters accordingly
     * @see //In In the 4th parameter(
     * <br>
     * -To Change the title ,content & button name pass String parameters accordingly<br>
     * {1}param 1 -Title<br>
     * {2}param 2 -Content<br>
     * {3}param 3 -Button 1<br>
     * {4}param 4 -Button 2 )
     */
    public static void show(final Context context, int imageDrawable, boolean isCancelable, OneStepDialogCallback onClickListener, String... stringContent) {


        dialogBase = new Dialog(context, R.style.WhiteBGDialog);
        dialogBase.setContentView(R.layout.dialog_base_layout);
        TextView tvDialogContent = (TextView) dialogBase.findViewById(R.id.tvDialogContent);
        TextView tvDialogTitle = (TextView) dialogBase.findViewById(R.id.tvDialogTitle);
        ImageView ivDialogIcon = (ImageView) dialogBase.findViewById(R.id.ivDialogIcon);
        Button btnYes = (Button) dialogBase.findViewById(R.id.btnYes);
        Button btnNo = (Button) dialogBase.findViewById(R.id.btnNo);

        if (imageDrawable == 0) {
            ivDialogIcon.setVisibility(View.GONE);
        } else {
            ivDialogIcon.setImageResource(imageDrawable);
        }
        btnNo.setVisibility(View.VISIBLE);

        dialogBase.setCancelable(isCancelable);

        try {
            tvDialogTitle.setText(Html.fromHtml(stringContent[0]));
        } catch (ArrayIndexOutOfBoundsException e) {
            btnYes.setOnClickListener(onClickListener);
            btnNo.setOnClickListener(onClickListener);
            dialogBase.show();

            return;
        }
        try {
            tvDialogContent.setText(Html.fromHtml(stringContent[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            btnYes.setOnClickListener(onClickListener);
            btnNo.setOnClickListener(onClickListener);
            dialogBase.show();

            return;

        }
        try {
            btnYes.setText(stringContent[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            btnYes.setOnClickListener(onClickListener);
            btnNo.setOnClickListener(onClickListener);
            dialogBase.show();

            return;
        }
        try {
            btnNo.setText(stringContent[3]);
            btnNo.setVisibility(View.VISIBLE);
        } catch (ArrayIndexOutOfBoundsException e) {
            btnNo.setVisibility(View.GONE);

        }


        btnYes.setOnClickListener(onClickListener);
        btnNo.setOnClickListener(onClickListener);
        dialogBase.show();

    }


    public static void dismissOneStepDialog() {

        if (dialogBase != null && dialogBase.isShowing()) {
            dialogBase.dismiss();
        }
    }
}
