<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<div class="modal fade" id="needLoginDialog">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title">温馨提示</h4>
      </div>
      <div class="modal-body">
        <p>
        	对不起，您还未登录，请先<a href="<%=path %>/login.jsp">登录</a>
        </p>
      </div>
     
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script>
 
 function openNeedLoginDialog(){
 	$('#needLoginDialog').modal();
 }
 
 function closeNeedLoginDialog(){
 	$('#myModal').modal('hide');
 }

var username = '${username}';
function checkNeedLogin(){
	if(username !=""){
		return true;
	}else{
		openNeedLoginDialog();
		return false;
	}
}
</script>