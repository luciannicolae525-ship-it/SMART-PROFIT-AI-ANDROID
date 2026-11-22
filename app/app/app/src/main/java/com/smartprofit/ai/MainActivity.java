
package com.smartprofit.ai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(28, 28, 28, 28);
        layout.setBackgroundColor(Color.rgb(12, 20, 35));

        TextView title = new TextView(this);
        title.setText("SMART PROFIT AI");
        title.setTextSize(28);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText(
            "\nBine ai venit!\n\n" +
            "Sistem: DEMO\n" +
            "Website: In pregatire\n" +
            "Automatizare: In pregatire\n" +
            "Venituri: Neconfigurate"
        );
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        Button start = new Button(this);
        start.setText("PORNESTE SMART PROFIT AI");
        start.setOnClickListener(v ->
            status.setText("Aplicatia SMART PROFIT AI este pornita in modul DEMO.")
        );

        layout.addView(title);
        layout.addView(status);
        layout.addView(start);
        setContentView(layout);
    }
}
