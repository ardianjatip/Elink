package id.ac.ui.cs.mobileprogramming.ardian.elink.addmedicine;

import id.ac.ui.cs.mobileprogramming.ardian.elink.BasePresenter;
import id.ac.ui.cs.mobileprogramming.ardian.elink.BaseView;
import id.ac.ui.cs.mobileprogramming.ardian.elink.data.source.MedicineAlarm;
import id.ac.ui.cs.mobileprogramming.ardian.elink.data.source.Pills;

import java.util.List;

public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}