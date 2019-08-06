package com.example.theonlysultan.braintraininggame;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TheOnlySultan on 15/02/2018.
 */

public class MainFragment extends Fragment {
    private AlertDialog mDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        // Handle buttons here...
        View newButton = rootView.findViewById(R.id.new_button);

        newButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                AlertDialog.Builder dialogBuilder1 = new AlertDialog.Builder(getActivity());
                dialogBuilder1.setTitle("Choose game difficulty");
                String[] Level = {"Novice", "Easy", "Medium", "Guru"};
                dialogBuilder1.setItems(Level, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        switch (which) {
                            case 0: // Novice
                                Intent intent = new Intent(getActivity(), GameActivity.class);
                                startActivity(intent);
                                break;
                            case 1: // Easy
                                Intent intentEasy = new Intent(getActivity(), EasyActivity.class);
                                startActivity(intentEasy);
                                break;

                            case 2: // Medium
                                Intent intentMedium = new Intent(getActivity(), MediumActivity.class);
                                startActivity(intentMedium);
                                break;

                            case 3: // Guru
                                Intent intentGuru = new Intent(getActivity(), GuruActivity.class);
                                startActivity(intentGuru);
                                break;



                        }
                    }
                });

                AlertDialog dialogbuilderObj = dialogBuilder1.create();

                dialogbuilderObj.show();



            }
        });

        View continueButton = rootView.findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GameActivity.class);
                intent.putExtra(GameActivity.KEY_RESTORE, true);
                getActivity().startActivity(intent);

               /* Intent intentEasy = new Intent(getActivity(), EasyActivity.class);
                intentEasy.putExtra(EasyActivity.KEY_RESTORE, true);
                getActivity().startActivity(intentEasy);

                Intent intentMedium = new Intent(getActivity(), MediumActivity.class);
                intentMedium.putExtra(MediumActivity.KEY_RESTORE, true);
                getActivity().startActivity(intentMedium);

                Intent intentGuru = new Intent(getActivity(), GuruActivity.class);
                intentGuru.putExtra(GuruActivity.KEY_RESTORE, true);
                startActivity(intentGuru);*/

            }
        });

        View aboutButton = rootView.findViewById(R.id.about_button);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(getActivity());
                builder.setTitle(R.string.about_title);
                builder.setMessage(R.string.about_text);
                builder.setCancelable(false);
                builder.setPositiveButton(R.string.ok_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface,
                                                int i) {
                                // nothing
                            }

                        });

                mDialog = builder.show();
            }

        });
        View exitButton = rootView.findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder exitBuilder = new AlertDialog.Builder(getActivity());
                exitBuilder.setMessage("Do you want to save your progress");
                exitBuilder.setCancelable(true);

                exitBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);

                    }
                });
                exitBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);
                    }
                });
                AlertDialog alert = exitBuilder.create();
                alert.show();
            }

        });
        return rootView;
    }



}