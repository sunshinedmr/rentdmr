
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<script type="text/javascript">
	$(function() {
		goPages(1);

	});
	function goPages(pages){
		$.ajax({
			url:"house_list.action",
			data:"pages="+pages+ "&pagesize=2",
			dataType:"HTML",
			success:function(data){
				$("#houseArea").html(data);
			}
			
		})
	}

	
</script>

<c:if test="${user!=null }">
<script>
function add(){
	document.location="user/house_toAdd.action";
	
}


</script>

</c:if>


<div class="search">
	<label class="ui-green"><input onclick="add()" type="button"
		name="search" value="发布房屋信息" /></label> 
		<label class="ui-green">
		<input type="button" name="search" value="退       出" onclick='document.location="logout.action"' /></label>
</div>
<div class="main wrap">
	<div id="houseArea"></div>
</div>
<%@include file="bottom.jsp"%>