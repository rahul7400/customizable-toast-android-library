package in.macrocodes.intoast;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class InToast extends Toast {
    public static int LENGTH_LONG = Toast.LENGTH_LONG;
    public static int LENGTH_SHORT = Toast.LENGTH_SHORT;
    private View mView;
    private int mType;
    private Context mContext;
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public InToast(Context context) {
        super(context);
        mContext = context;
    }

    //normal toast
    public static void makeText(Context context, String message, int duration) {
        InToast inToast = new InToast(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_toast, null);
        TextView text = (TextView) view.findViewById(R.id.text);


        text.setText(message);
        inToast.setDuration(duration);
        inToast.setView(view);

        inToast.mView = view;
        inToast.show();
    }

    //for only color changes
    public static void makeText(Context context, String message, String textColor, String backgroundColor, int duration) {
        InToast inToast = new InToast(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_toast, null);
        TextView text = (TextView) view.findViewById(R.id.text);
        CardView card = (CardView) view.findViewById(R.id.bg_card);
        text.setTextColor(Color.parseColor(textColor));
        card.setCardBackgroundColor(Color.parseColor(backgroundColor));



        text.setText(message);
        inToast.setDuration(duration);
        inToast.setView(view);

        inToast.mView = view;
        inToast.show();
    }

    //for only radius
    public static void makeText(Context context, String message,Float toastCornerRadius, int duration) {
        InToast inToast = new InToast(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_toast, null);
        TextView text = (TextView) view.findViewById(R.id.text);
        CardView card = (CardView) view.findViewById(R.id.bg_card);

        card.setRadius(toastCornerRadius);


        text.setText(message);
        inToast.setDuration(duration);
        inToast.setView(view);

        inToast.mView = view;
        inToast.show();
    }

    //for  radius and color changes
    public static void makeText(Context context, String message, String textColor, String backgroundColor,Float toastCornerRadius, int duration) {
        InToast inToast = new InToast(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_toast, null);
        TextView text = (TextView) view.findViewById(R.id.text);
        CardView card = (CardView) view.findViewById(R.id.bg_card);
        text.setTextColor(Color.parseColor(textColor));
        card.setCardBackgroundColor(Color.parseColor(backgroundColor));
        card.setRadius(toastCornerRadius);


        text.setText(message);
        inToast.setDuration(duration);
        inToast.setView(view);

        inToast.mView = view;
        inToast.show();
    }


}
