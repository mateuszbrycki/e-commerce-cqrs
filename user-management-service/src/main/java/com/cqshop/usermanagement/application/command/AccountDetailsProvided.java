package com.cqshop.usermanagement.application.command;

import com.cqshop.cqrs.common.command.AbstractApplicationCommandWithTimestamp;
import com.cqshop.cqrs.common.command.ApplicationCommandAnnotation;
import lombok.*;

import java.io.Serializable;

/**
 * Created by Mateusz Brycki on 01/10/2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApplicationCommandAnnotation
@Builder
public class AccountDetailsProvided extends AbstractApplicationCommandWithTimestamp implements Serializable {

    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String email;
}
