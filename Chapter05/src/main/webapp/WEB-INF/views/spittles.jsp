<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <div class="spittleForm">
      <h1>Spit it out...</h1>
      <form method="POST" name="spittleForm">
        <%--这里的form没有action属性，所以会提交到相同的url，也即用post方法提交到/spittles，这里对应的控制器方法为SpittleController的最后一个方法--%>
        <input type="hidden" name="latitude">
        <input type="hidden" name="longitude">
        <textarea name="message" cols="80" rows="5"></textarea><br/>
        <input type="submit" value="Add" />
      </form>
    </div>
    <div class="listTitle">
      <h1>Recent Spittles</h1>
      <ul class="spittleList">
        <c:forEach items="${spittleList}" var="spittle" >
          <li id="spittle_<c:out value="spittle.id"/>">
            <div class="spittleMessage"><c:out value="${spittle.message}" /></div>
            <div>
              <span class="spittleTime"><c:out value="${spittle.time}" /></span>
              <span class="spittleLocation">(<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />)</span>
            </div>
          </li>
        </c:forEach>
      </ul>
      <c:if test="${fn:length(spittleList) gt 20}"> <%--fn:length(...)返回字符串长度或集合中元素的数量--%>
        <hr/>
        <s:url value="/spittles?count=${nextCount}" var="more_url" />
        <a href="${more_url}">Show more</a>
      </c:if>
      <%--c:if这里无论如何也不起作用，实在是很令人焦心。。。无奈，放弃啦--%>
    </div>
  </body>
</html>