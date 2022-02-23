package com.example.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    TextView teamOneTextView, teamTwoTextView;
    Button increaseScoreButton, decreaseScoreButton, resetScoreButton;
    RadioButton oneScoreRadio, twoScoreRadio, fourScoreRadio, sixScoreRadio;
    Switch teamSwitch;
    private Activity activity;

    /*
    This variable is used to check selected score value
    0 = 1 score, 1 = 2 scores, 2 = 4 scores, 3 = 6 scores
    */
    int scoreValue;

    /*
    This variable is used to check which team is selected for score update
    0 = team 1, 1 = team 2
     */
    int selectedTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        scoreValue = 0;
        selectedTeam = 0;
        connectViews();
        buttonActions();
        switchButtonAction();
    }

    void connectViews()
    {
        teamOneTextView = findViewById(R.id.teamOneScoreText);
        teamTwoTextView = findViewById(R.id.teamTwoScoreText);
        increaseScoreButton = findViewById(R.id.increaseButton);
        decreaseScoreButton = findViewById(R.id.decreaseButton);
        resetScoreButton = findViewById(R.id.resetScoreButton);
        oneScoreRadio = findViewById(R.id.OneScoreRadio);
        twoScoreRadio = findViewById(R.id.twoScoreRadio);
        fourScoreRadio = findViewById(R.id.fourScoreRadio);
        sixScoreRadio = findViewById(R.id.sixScoreRadio);
        teamSwitch = findViewById(R.id.teamSwitch);

        teamOneTextView.setFocusable(false);
        teamTwoTextView.setFocusable(false);
        oneScoreRadio.setChecked(true);
    }

    void buttonActions()
    {
        increaseScoreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                switch (scoreValue) {
                    case 0:
                        int teamValue = 1;

                        if (teamSwitch.isChecked())
                        {
                            teamValue = teamValue + Integer.parseInt(teamTwoTextView.getText().toString());
                            teamTwoTextView.setText(String.valueOf(teamValue));
                        }
                        else
                        {
                            teamValue = teamValue + Integer.parseInt(teamOneTextView.getText().toString());
                            teamOneTextView.setText(String.valueOf(teamValue));
                        }
                        break;

                    case 1:
                        teamValue = 2;

                        if (teamSwitch.isChecked())
                        {
                            teamValue = teamValue + Integer.parseInt(teamTwoTextView.getText().toString());
                            teamTwoTextView.setText(String.valueOf(teamValue));
                        }
                        else
                        {
                            teamValue = teamValue + Integer.parseInt(teamOneTextView.getText().toString());
                            teamOneTextView.setText(String.valueOf(teamValue));
                        }
                        break;
                    case 2:
                        teamValue = 4;

                        if (teamSwitch.isChecked())
                        {
                            teamValue = teamValue + Integer.parseInt(teamTwoTextView.getText().toString());
                            teamTwoTextView.setText(String.valueOf(teamValue));
                        }
                        else
                        {
                            teamValue = teamValue + Integer.parseInt(teamOneTextView.getText().toString());
                            teamOneTextView.setText(String.valueOf(teamValue));
                        }
                        break;
                    case 3:
                        teamValue = 6;

                        if (teamSwitch.isChecked())
                        {
                            teamValue = teamValue + Integer.parseInt(teamTwoTextView.getText().toString());
                            teamTwoTextView.setText(String.valueOf(teamValue));
                        }
                        else
                        {
                            teamValue = teamValue + Integer.parseInt(teamOneTextView.getText().toString());
                            teamOneTextView.setText(String.valueOf(teamValue));
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + scoreValue);
                }
            }
        });

        decreaseScoreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                switch (scoreValue) {
                    case 0:
                        int scoreVal = 1;

                        if (teamSwitch.isChecked())
                        {
                            int teamScore = Integer.parseInt(teamTwoTextView.getText().toString());
                            if (teamScore >= scoreVal)
                            {
                                teamScore = teamScore - scoreVal;
                            }
                            teamTwoTextView.setText(String.valueOf(teamScore));
                        }
                        else
                        {
                            int teamScore = Integer.parseInt(teamOneTextView.getText().toString());
                            if (teamScore >= scoreVal)
                            {
                                teamScore = teamScore - scoreVal;
                            }
                            else
                            {
                                Toast.makeText(activity, "Negative scores not allowed", Toast.LENGTH_LONG).show();
                            }
                            teamOneTextView.setText(String.valueOf(teamScore));
                        }
                        break;
                    case 1:
                        scoreVal = 2;

                        if (teamSwitch.isChecked())
                        {
                            int teamScore = Integer.parseInt(teamTwoTextView.getText().toString());
                            if (teamScore >= scoreVal)
                            {
                                teamScore = teamScore - scoreVal;
                            }
                            else
                            {
                                Toast.makeText(activity, "Negative scores not allowed", Toast.LENGTH_LONG).show();
                            }
                            teamTwoTextView.setText(String.valueOf(teamScore));
                        }
                        else
                        {
                            int teamScore = Integer.parseInt(teamOneTextView.getText().toString());
                            if (teamScore >= scoreVal)
                            {
                                teamScore = teamScore - scoreVal;
                            }
                            else
                            {
                                Toast.makeText(activity, "Negative scores not allowed", Toast.LENGTH_LONG).show();
                            }
                            teamOneTextView.setText(String.valueOf(teamScore));
                        }
                        break;
                    case 2:
                        scoreVal = 4;

                        if (teamSwitch.isChecked())
                        {
                            int teamScore = Integer.parseInt(teamTwoTextView.getText().toString());
                            if (teamScore >= scoreVal)
                            {
                                teamScore = teamScore - scoreVal;
                            }
                            else
                            {
                                Toast.makeText(activity, "Negative scores not allowed", Toast.LENGTH_LONG).show();
                            }
                            teamTwoTextView.setText(String.valueOf(teamScore));
                        }
                        else
                        {
                            int teamScore = Integer.parseInt(teamOneTextView.getText().toString());
                            if (teamScore >= scoreVal)
                            {
                                teamScore = teamScore - scoreVal;
                            }
                            else
                            {
                                Toast.makeText(activity, "Negative scores not allowed", Toast.LENGTH_LONG).show();
                            }
                            teamOneTextView.setText(String.valueOf(teamScore));
                        }
                        break;
                    case 3:
                        scoreVal = 6;

                        if (teamSwitch.isChecked())
                        {
                            int teamScore = Integer.parseInt(teamTwoTextView.getText().toString());
                            if (teamScore >= scoreVal)
                            {
                                teamScore = teamScore - scoreVal;
                            }
                            else
                            {
                                Toast.makeText(activity, "Negative scores not allowed", Toast.LENGTH_LONG).show();
                            }
                            teamTwoTextView.setText(String.valueOf(teamScore));
                        }
                        else
                        {
                            int teamScore = Integer.parseInt(teamOneTextView.getText().toString());
                            if (teamScore >= scoreVal)
                                teamScore = teamScore - scoreVal;
                            teamOneTextView.setText(String.valueOf(teamScore));
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + scoreValue);
                }
            }
        });

        resetScoreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                teamOneTextView.setText("0");
                teamTwoTextView.setText("0");
            }
        });
    }

    void switchButtonAction()
    {
        teamSwitch.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (teamSwitch.isChecked()) {
                    teamSwitch.setText("Team 2");
                } else {
                    teamSwitch.setText("Team 1");
                }
            }
        });




    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.OneScoreRadio:
                if (checked) {
                    scoreValue = 0;
                }
                break;
            case R.id.twoScoreRadio:
                if (checked) {
                    scoreValue = 1;
                }
                break;
            case R.id.fourScoreRadio:
                if (checked) {
                    scoreValue = 2;
                }
                break;
            case R.id.sixScoreRadio:
                if (checked) {
                    scoreValue = 3;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}
