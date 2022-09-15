package com.patterns.behavioral.mediator.mediator;

import com.patterns.behavioral.mediator.components.Component;

import javax.swing.*;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 * <p>
 * Common mediator interface.
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
