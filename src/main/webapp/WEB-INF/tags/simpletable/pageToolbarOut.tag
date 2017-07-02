<%@ tag pageEncoding="UTF-8"%>
<%@ attribute name="page" required="true" type="cn.edu.ncut.istc.common.Page" description="Page.java" %>
<%@ attribute name="pageSizeSelectList" type="java.lang.Number[]" required="false"  %>
<%@ attribute name="isShowPageSizeList" type="java.lang.Boolean" required="false"  %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	// set default values
	Integer[] defaultPageSizes = new Integer[]{10,50,100};
	if(jspContext.getAttribute("pageSizeSelectList") == null) {
		jspContext.setAttribute("pageSizeSelectList",defaultPageSizes); 
	}
	
	if(jspContext.getAttribute("isShowPageSizeList") == null) {
		jspContext.setAttribute("isShowPageSizeList",true); 
	} 
%>

<table width="100%"  border="0" cellspacing="0" class="gridToolbar">

        <tr>
            <td>
                 <div class="box">

			<div  class="leftControls" >
				<jsp:doBody/>
			</div>

			<div class="paginationControls" style="font-size:12px;font-weight:700;">
			   
                <c:choose>
				<c:when test="${page.firstPage}"><label style="color:#707070;padding:6px;border:1px solid #000;"> 第一页</label></c:when>
				<c:otherwise><a style="color:#204A77;padding:6px;border:1px solid #000;" href="javascript:simpleTable.togglePage(1);">第一页</a></c:otherwise>
				</c:choose>

				<c:choose>
				<c:when test="${page.hasPreviousPage}"><a style="color:#204A77;padding:6px;border:1px solid #000;" href="javascript:simpleTable.togglePage(${page.previousPageNumber});">上一页</a></c:when>
				<c:otherwise><label style="color:#707070;padding:6px;border:1px solid #000;"> 上一页</label></c:otherwise>
				</c:choose>

				<c:forEach var="item" items="${page.linkPageNumbers}">
				<c:choose>
				<c:when test="${item == page.thisPageNumber}"><label style="color:#fff;border:1px solid #000;padding:6px;background:#204A77;">${item}</label></c:when>
				<c:otherwise><a style="color:#204A77;padding:6px;border:1px solid #000;" href="javascript:simpleTable.togglePage(${item});">${item}</a></c:otherwise>
				</c:choose>
				</c:forEach>

				<c:choose>
				<c:when test="${page.hasNextPage}"><a style="color:#204A77;padding:6px;border:1px solid #000;" href="javascript:simpleTable.togglePage(${page.nextPageNumber});">下一页</a></c:when>
				<c:otherwise><label style="color:#707070;padding:6px;border:1px solid #000;"> 下一页</label></c:otherwise>
				</c:choose>

				<c:choose>
				<c:when test="${page.lastPage}"><label style="color:#707070;padding:6px;border:1px solid #000;"> 最后一页</label></c:when>
				<c:otherwise><a  style="color:#204A77;padding:6px;border:1px solid #000;"href="javascript:simpleTable.togglePage(${page.lastPageNumber});">最后一页</a></c:otherwise>
				</c:choose>

				<c:if test="${isShowPageSizeList}">
				</c:if>
				 <label style="color:#707070;padding:12px 6px 0px 6px;">共${page.totalCount}条</label>
			</div>
		<div>
            </div>
             </div>
            </td>
        </tr>

</table>