package com.patterns.behavioral.mediator.components;

import com.patterns.behavioral.mediator.mediator.Mediator;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 * <p>
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
