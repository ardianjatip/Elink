package id.ac.ui.cs.mobileprogramming.ardian.elink;

import android.content.Context;
import androidx.annotation.NonNull;

import id.ac.ui.cs.mobileprogramming.ardian.elink.data.source.MedicineRepository;
import id.ac.ui.cs.mobileprogramming.ardian.elink.data.source.local.MedicinesLocalDataSource;

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
