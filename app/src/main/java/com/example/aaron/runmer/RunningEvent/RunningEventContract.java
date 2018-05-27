package com.example.aaron.runmer.RunningEvent;

import com.example.aaron.runmer.Base.BasePresenter;
import com.example.aaron.runmer.Base.BaseView;
import com.example.aaron.runmer.Objects.EventData;

public interface RunningEventContract {

    interface View extends BaseView<Presenter> {

        void showRunningEventFABDialog();

        void showRunningEventList(EventData mEventData);

        void addPeopleRunningEventList(int position, int numOfPeople);
    }

    interface Presenter extends BasePresenter {

        void clickRunningEventFABbtn();

        void quertAllRunningEvent();

        void setEventDataToFirebase(EventData mEventData);

        void setEventPeopleParticipate(int position, String mEventId);
    }
}
