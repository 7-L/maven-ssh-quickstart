package cn.edu.ncut.nwrd.model.base;

import java.util.List;

/**
 * @author NikoBelic
 * @create 2017/7/2 01:26
 */
public class ScrollResultModel<T>
{
    private int pageSize;
    private long totalRecordCount;
    private int totalPageCount;
    private int currentPageNum;
    private List<T> recordList;


    public ScrollResultModel(int pageSize, long totalRecordCount, int totalPageCount, int currentPageNum, List<T> recordList)
    {
        this.pageSize = pageSize;
        this.totalRecordCount = totalRecordCount;
        this.totalPageCount = totalPageCount;
        this.currentPageNum = currentPageNum;
        this.recordList = recordList;
    }

    public int getCurrentPageNum()
    {
        return currentPageNum;
    }

    public void setCurrentPageNum(int currentPageNum)
    {
        this.currentPageNum = currentPageNum;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public long getTotalRecordCount()
    {
        return totalRecordCount;
    }

    public void setTotalRecordCount(long totalRecordCount)
    {
        this.totalRecordCount = totalRecordCount;
    }

    public int getTotalPageCount()
    {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount)
    {
        this.totalPageCount = totalPageCount;
    }

    public List<T> getRecordList()
    {
        return recordList;
    }

    public void setRecordList(List<T> recordList)
    {
        this.recordList = recordList;
    }
}
