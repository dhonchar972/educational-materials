package org.java.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {
    protected UUID uuid;
    protected LocalDateTime createdOn;

    public BaseEntity(UUID uuid) {
        this.uuid = uuid;
        this.createdOn = LocalDateTime.now();
    }
}
