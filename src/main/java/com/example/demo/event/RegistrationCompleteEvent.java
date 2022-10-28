package com.example.demo.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;
import com.example.demo.entity.User;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private final User user;
    private final String applicationUrl;

    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}
