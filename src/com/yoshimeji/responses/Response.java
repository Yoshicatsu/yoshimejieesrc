package com.yoshimeji.responses;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.exception.VariableException;

public interface Response {

    /**
     * @param mascot
     */
    public void init(Mascot mascot) throws VariableException;
}
