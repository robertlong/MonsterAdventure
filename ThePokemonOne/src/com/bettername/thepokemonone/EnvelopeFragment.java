package com.bettername.thepokemonone;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class EnvelopeFragment extends DialogFragment
{
    static EnvelopeFragment newInstance()
    {
        EnvelopeFragment f = new EnvelopeFragment();
        return f;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.envelope_fragment, container, false);
        setStyle(DialogFragment.STYLE_NO_FRAME,
                android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth);
        Dialog dialog = getDialog();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setWindowAnimations(R.style.evnvelope_animation);
        return v;
    }
}
