package com.demomic.license.impl.controller.filter;

public class UserContextHolder {

    private static final ThreadLocal<UserContext> userContext = new ThreadLocal<>();

    public static final UserContext getContext() {
        var context = userContext.get();
        if (context == null) {
            context = new UserContext();
            userContext.set(context);
        }
        return userContext.get();
    }
}
