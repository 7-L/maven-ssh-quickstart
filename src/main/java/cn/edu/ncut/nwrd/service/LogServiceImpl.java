package cn.edu.ncut.nwrd.service;

import cn.edu.ncut.nwrd.dao.LogDao;
import cn.edu.ncut.nwrd.model.LogObj;
import cn.edu.ncut.nwrd.model.base.ScrollResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author NikoBelic
 * @create 2017/7/2 01:16
 */
@Service
public class LogServiceImpl implements LogService
{
    @Autowired
    private LogDao logDao;

    @Override
    public ScrollResultModel<LogObj> getLogList(int pageNum)
    {
        return logDao.getScrollPageModel(pageNum, null, null, "");
    }


}
