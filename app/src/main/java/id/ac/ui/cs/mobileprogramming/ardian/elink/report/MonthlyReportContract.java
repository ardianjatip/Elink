package id.ac.ui.cs.mobileprogramming.ardian.elink.report;

import id.ac.ui.cs.mobileprogramming.ardian.elink.BasePresenter;
import id.ac.ui.cs.mobileprogramming.ardian.elink.BaseView;
import id.ac.ui.cs.mobileprogramming.ardian.elink.data.source.History;
import java.util.List;


public interface MonthlyReportContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showHistoryList(List<History> historyList);

        void showLoadingError();

        void showNoHistory();

        void showTakenFilterLabel();

        void showIgnoredFilterLabel();

        void showAllFilterLabel();

        void showNoTakenHistory();

        void showNoIgnoredHistory();

        boolean isActive();

        void showFilteringPopUpMenu();

    }

    interface Presenter extends BasePresenter {

        void loadHistory(boolean showLoading);

        void setFiltering(FilterType filterType);

        FilterType getFilterType();
    }
}
