package cn.edu.ncut.nwrd.test;

import cn.edu.ncut.nwrd.dao.LogDao;
import cn.edu.ncut.nwrd.dao.basedao.QueryResult;
import cn.edu.ncut.nwrd.model.LogObj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author NikoBelic
 * @create 2017/6/27 15:13
 */
@ContextConfiguration(locations = "classpath:spring/*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSSH
{
    @Resource
    private LogDao logDao;


    @Test
    public void testAddLog()
    {
        for (int i = 0; i < 1000; i++)
        {
            LogObj log = new LogObj();
            log.setContent("测试日志" + i);
            log.setCreateTime(new Date());
            logDao.save(log);
        }
    }

    @Test
    public void testGetLogList()
    {
        List<LogObj> logList = logDao.findAll();
        for (LogObj logObj : logList)
        {
            System.out.println(logObj);
        }
    }

    @Test
    public void testGetPageLogList()
    {
        int pageSize = 20;
        int currPage = 4;
        int from = currPage * pageSize;

        QueryResult<LogObj> qrResult = logDao.getScrollData(from, pageSize, null, null, "");
        List<LogObj> logList = qrResult.getResultlist();
        for (LogObj logObj : logList)
        {
            System.out.println(logObj);
        }
        System.out.println(qrResult.getRecordtotal());

    }

}
