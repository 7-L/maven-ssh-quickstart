<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="header" class="width960 marA oh">
   	  <div id="logo" class="fl">
      <h1 style="color:#FFF">网络文学作品标识信息管理系统</h1>
     
      </div>
      <div id="headerRight" class="fl">
      <div id="headerInfo">
<a onclick="SetHome(window.location)" href="/ISTCServer/user/goRegister" class="home">注册</a>
    
<a onclick="AddFavorite(window.location,document.title)" href="/ISTCServer/user/goLogin"  class="favorites">登录</a>

   
</div>
      
<form id="searchForm_1" method="get" action="#" target="_blank">
<div id="headerSearch"><div id="headerSearchBak" class="fl">
        <input class="inputText" placeholder="请输入关键字" name="word" onclick="this.value=''" type="text">
      </div>
<div id="headerSearchButton" class="fl">
<input name="" onclick="document.getElementById('searchForm_1').submit();return false;" src="${ctx}/img/searchbutton.png" type="image">
</div></div>


</form>
      </div>
</div>




 <div id="menuBg" class="width960 marA oh">
    <ul id="menu">
  
      <li class="colorHome2"><A href="${ctx}/information/webmain_showdata.do" onclick="change_bg(this)">&nbsp;&nbsp首&nbsp;&nbsp页&nbsp;</a></li>
      <li><a href="${ctx}/synopsis"  onclick="change_bg(this)">ILTC梗概</a></li>
      <li><A href="${ctx}/intro" onclick="change_bg(this)">中心介绍</a></li>
      <li><A href="${ctx}/law" onclick="change_bg(this)">法律法规</a></li>
      <li class="contactColor"><A href="${ctx}/contact" onclick="change_bg(this)">联系我们</a></li>
      
    </ul>
  </div>




<!--

<div class="header-bg">
	<div class="wrap"> 
		<div class="total-box">
				<div class="total">
					<div class="header_top">
				     	<div class="menu">
				     		<ul>
						    	<li class="active"><a href="${ctx}/information/webmain_showdata.do">网站首页</a></li>
						    	<li><a href="${ctx}/synopsis">ILTC梗概</a></li>
						    	<li><a href="${ctx}/intro">中心介绍</a></li>
						    	<li><a href="${ctx}/law">法律法规</a></li>
						    	<li><a href="${ctx}/contact">联系我们</a></li>
						        <li style="float:right;"><a href="${ctx}/user/goLogin" >登录</a></li>
                                <li style="float:right;"><a href="${ctx}/user/goRegister" >注册</a></li>
           
                              <div class="clear"></div>
			     			</ul>
				     	</div>
				     	<ul class="follow_icon">
						
						</ul>
		     			<div class="clear"></div>-
		     	</div>
			     <div class="header-bottom">
					 <div class="logo">
						<h1><a href="index.html">网络文学作品标识信息管理系统</a></h1>
					 </div>
					<div class="search">
						   <form>
						    	<input type="text" value="">
						    	<input type="submit" value="">
						  </form>
					</div>
					<div class="clear"></div> 
				</div>
			</div>	
		</div>
	 </div>
</div>
-->