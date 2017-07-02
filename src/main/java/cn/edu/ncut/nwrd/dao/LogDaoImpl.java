package cn.edu.ncut.nwrd.dao;

import cn.edu.ncut.nwrd.dao.basedao.DaoSupport;
import cn.edu.ncut.nwrd.model.LogObj;
import org.springframework.stereotype.Repository;

/**
 * @author NikoBelic
 * @create 2017/6/27 21:10
 */
@Repository(value = "logDao")
public class LogDaoImpl extends DaoSupport<LogObj> implements LogDao
{
}
