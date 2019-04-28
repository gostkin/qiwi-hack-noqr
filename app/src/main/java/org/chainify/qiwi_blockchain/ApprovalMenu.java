package org.chainify.qiwi_blockchain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ApprovalMenu extends Fragment {
    Button generateKeyBtn;
    Button verifyBtn;

    EditText passwordEdit;
    EditText pk, sk;
    EditText passportEdit;

    RelativeLayout generationLayout;

    LinearLayout verificationLayout, passportLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View thisView = getView();
        generateKeyBtn = thisView.findViewById(R.id.generate_btn);
        passwordEdit = thisView.findViewById(R.id.password_ver_edit);
        generationLayout = thisView.findViewById(R.id.generation_layout);

        verificationLayout = thisView.findViewById(R.id.verification_layout);
        passportLayout = thisView.findViewById(R.id.passport_layout);
        passportEdit = thisView.findViewById(R.id.passport_edit);
        verifyBtn = thisView.findViewById(R.id.verify_btn);

        pk = thisView.findViewById(R.id.pk_edit);
        sk = thisView.findViewById(R.id.sk_edit);

        generateKeyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAndSaveKeys(passportEdit.getText().toString());

                generationLayout.setVisibility(View.INVISIBLE);
                verificationLayout.setVisibility(View.VISIBLE);

                // update pk and sk in view
            }
        });
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_approval_menu, container, false);
    }

    public void generateAndSaveKeys(String password) {

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Approval menu");
    }
}