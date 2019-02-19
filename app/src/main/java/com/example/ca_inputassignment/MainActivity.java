package com.example.ca_inputassignment;

import android.support.v7.app.AppCompatActivity;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Invoke the method that initializes all onclick listeners
        initOnClickListeners();
    }

    void initOnClickListeners() {
        // Initialize print-button onclick listener
        final Button buttonPrint = findViewById(R.id.buttonPrint);
        buttonPrint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Find the input (EditView) and output (TextView) elements and store them in variables
                // Look into findViewById()
                // TODO: add code

                // Get text from input and then set that text in output
                // Look into getText() and setText()
                // TODO: add code
            }
        });

        // Initialize print Hello-button onclick listener
        // TODO: initialize onclick listener

                // Create TextView output object programmatically

                // Find main layout object, to (later) add the newly created TextView to
                // TODO: add code

                // Create the new TextView and set its properties (id, text and text size)
                // Look into setId(), setText() and setTextSize()
                // TODO: add code

                // Set the layout parameters of the TextView to wrap the content
                // Create new ConstraintLayout.LayoutParams() and setLayoutParams() to the newly created TextView
                // TODO: add code

                // Add the newly created TextView to the main layout
                // TODO: add code

                // Position the TextView in the main layout with help of a ConstraintSet. (N.B. this
                // must be done after the TextView is added to the main layout)
                // Create a new ConstraintSet(), clone() the existing ConstraintSet of the main layout
                // TODO: add code

                // Position vertically relative to the print Hello-button (just uncomment next line)
                // constraintSet.connect(outputHello.getId(), ConstraintSet.TOP, R.id.buttonPrintHello, ConstraintSet.TOP, 250);
                // Center the element horizontally
                // TODO: add code
                // Apply the new constraints to the layout
                // TODO: add code

    }
}
