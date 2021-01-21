package id.ac.ui.cs.mobileprogramming.ardian.elink.alarm;

import id.ac.ui.cs.mobileprogramming.ardian.elink.BasePresenter;
import id.ac.ui.cs.mobileprogramming.ardian.elink.BaseView;
import id.ac.ui.cs.mobileprogramming.ardian.elink.data.source.History;
import id.ac.ui.cs.mobileprogramming.ardian.elink.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
