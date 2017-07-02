package cn.edu.ncut.nwrd.model.base;

import org.apache.log4j.Logger;

import java.io.Serializable;

public abstract class BaseModel implements Serializable
{
    private static final long serialVersionUID = 2387253001746505718L;

    private final static Logger logger = Logger.getLogger(BaseModel.class);

    protected static final String DATE_FORMAT = "yyyy-MM-dd";

    protected static final String TIME_FORMAT = "HH:mm:ss";

    protected static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    protected static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.S";


}
