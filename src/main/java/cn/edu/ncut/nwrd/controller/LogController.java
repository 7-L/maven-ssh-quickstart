package cn.edu.ncut.nwrd.controller;

import cn.edu.ncut.nwrd.model.LogObj;
import cn.edu.ncut.nwrd.model.base.ScrollResultModel;
import cn.edu.ncut.nwrd.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @author NikoBelic
 * @create 2017/7/2 01:15
 */
@RestController
@RequestMapping(value = "/log")
public class LogController
{
    @Autowired
    private LogService logService;

    @RequestMapping(value = "list")
    public ModelAndView getList(HttpServletRequest request, HttpServletResponse response)
    {
        HashMap<String, Object> result = new HashMap<>();
        int pageNum = request.getParameter("pageNum") == null ? 1 : Integer.valueOf(request.getParameter("pageNum"));
        ScrollResultModel<LogObj> logScrollResultModel = logService.getLogList(pageNum);
        result.put("logScrollResultModel", logScrollResultModel);
        return new ModelAndView("log/list", result);
    }
}
