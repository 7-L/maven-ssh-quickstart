package cn.edu.ncut.nwrd.service;

import cn.edu.ncut.nwrd.model.LogObj;
import cn.edu.ncut.nwrd.model.base.ScrollResultModel;

/**
 * @author NikoBelic
 * @create 2017/7/2 01:15
 */
public interface LogService
{
    ScrollResultModel<LogObj> getLogList(int pageNo);
}
