<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="../commons/taglibs.jsp" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>日志列表</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>日期</td>
        <td>内容</td>
    </thead>
    <form action="${ctx}/log/list">
        <input type="text" name="pageNum" value=""/>
        <input type="submit" value="查询"/>
    </form>
    <tbody>
    <c:forEach items="${logScrollResultModel.recordList}" var="log">
        <tr>
            <td>${log.id}</td>
            <td>${log.createTime}</td>
            <td>${log.content}</td>
        </tr>
    </c:forEach>
    总记录：${logScrollResultModel.totalRecordCount}
    当前页/总页数：${logScrollResultModel.currentPageNum} / ${logScrollResultModel.totalPageCount}
    每页显示：${logScrollResultModel.pageSize}
    </tbody>
</table>
</body>
</html>