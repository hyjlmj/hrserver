package org.sang.common;

import org.sang.bean.CtpUser;
import org.sang.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by sang on 2017/12/30.
 */
public class CtpUserUtils {

    public static CtpUser getCurrentHr() {
        return (CtpUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
