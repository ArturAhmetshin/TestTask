package ru.testtask.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Created by Artur on 02.06.2017.
 */
public class TestGWT implements EntryPoint {
    @Override
    public void onModuleLoad() {
        Label greetingLabel = new Label("Hello, GWT!");
        RootPanel.get().add(greetingLabel);

    }
}
