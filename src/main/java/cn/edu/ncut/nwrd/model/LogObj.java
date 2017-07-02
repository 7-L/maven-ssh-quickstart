package cn.edu.ncut.nwrd.model;

import cn.edu.ncut.nwrd.model.base.BaseModel;

import javax.persistence.*;
import java.util.Date;

/**
 * @author NikoBelic
 * @create 2017/7/2 00:31
 */
@Entity
@Table(name = "TB_LOG", schema = "NWRD", catalog = "")
public class LogObj extends BaseModel
{
    private Integer id;
    private Date createTime;
    private String content;

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "TB_LOG_ID_GENERATOR", sequenceName = "SEQ_LOG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_LOG_ID_GENERATOR")
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "CONTENT")
    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        LogObj logObj = (LogObj) o;

        if (id != null ? !id.equals(logObj.id) : logObj.id != null)
            return false;
        if (createTime != null ? !createTime.equals(logObj.createTime) : logObj.createTime != null)
            return false;
        if (content != null ? !content.equals(logObj.content) : logObj.content != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "LogObj{" + "id=" + id + ", createTime=" + createTime + ", content='" + content + '\'' + '}';
    }
}
