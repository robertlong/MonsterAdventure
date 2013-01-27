package com.bettername.thepokemonone;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EnvelopeFragment extends DialogFragment
{
    static EnvelopeFragment newInstance(int num)
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
        setStyle(DialogFragment.STYLE_NO_FRAME, android.R.style.Theme_Holo);
        return v;
    }
    
}
