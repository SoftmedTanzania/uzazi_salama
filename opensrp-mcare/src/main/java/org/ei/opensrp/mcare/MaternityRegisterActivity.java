package org.ei.opensrp.mcare;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MaternityRegisterActivity extends AppCompatActivity {

    CardView cardDatePickDelivery, cardDatePickAdmission;
    TextView textDateDelivery, textDateAdmission;


    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
    private Calendar today;
    private static final String TAG = MaternityRegisterActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maternity_register);

        cardDatePickAdmission = (CardView) findViewById(R.id.cardPickDateAdmission);
        cardDatePickDelivery = (CardView) findViewById(R.id.cardPickDateDelivery);
        textDateDelivery = (TextView) findViewById(R.id.textDateDelivery);
        textDateAdmission = (TextView) findViewById(R.id.textDateAdmission);

        today = Calendar.getInstance();
        textDateDelivery.setText(dateFormat.format(today.getTimeInMillis()));

        cardDatePickDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // do magic
                pickDate(R.id.textDateDelivery);
            }
        });

        cardDatePickAdmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // do magic
                pickDate(R.id.textDateAdmission);
            }
        });
    }


    private void pickDate(final int id) {
        // listener
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                // get picked date
                // update view
                GregorianCalendar pickedDate = new GregorianCalendar(year, monthOfYear, dayOfMonth);
                if (id == R.id.textDateAdmission)
                    textDateAdmission.setText(dateFormat.format(pickedDate.getTimeInMillis()));

                else if (id == R.id.textDateDelivery)
                    textDateDelivery.setText(dateFormat.format(pickedDate.getTimeInMillis()));
            }
        };

        // dialog
        DatePickerDialog datePickerDialog = DatePickerDialog.newInstance(
                onDateSetListener);

        datePickerDialog.setOkColor(ContextCompat.getColor(getApplicationContext(),
                android.R.color.holo_blue_light));
        datePickerDialog.setCancelColor(ContextCompat.getColor(getApplicationContext(),
                android.R.color.holo_red_light));

        datePickerDialog.setVersion(DatePickerDialog.Version.VERSION_2);
        datePickerDialog.setAccentColor(ContextCompat.getColor(getApplicationContext(), R.color.primary));

        // show dialog
        datePickerDialog.show(getFragmentManager(), "DatePickerDialog");
    }

}
