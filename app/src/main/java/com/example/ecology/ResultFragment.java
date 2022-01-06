package com.example.ecology;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class ResultFragment extends DialogFragment {
    int count=0;

        @NonNull
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
            return builder.setTitle("Результаты теста").setMessage("Вы ответили правильно на "+count+" из 10 вопросов. Это "+(count/10*100)+" процентов выполнения").create();
        }

        public void setCount(int cnt){
            count=cnt;
        }
}

