<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<div class="row academy-student-add">
    	<div class="block">                        
	         <div class="app-heading app-heading-small">                                
	             <div class="title">
	                 <h2>학생 추가</h2>
	                 <p>학원의 학생을 추가합니다.</p>
	             </div>                                
	         </div>
	               
	         <form:form class="form-horizontal" modelAttribute="student" method="post" action="">
	             <div class="form-group">
	                 <label class="col-md-2 control-label">이름</label>
	                 <div class="col-md-5">
	                 	<form:input path="name" cssClass="form-control" maxlength="20" required="required"/>
	                 	<form:errors path="name" cssClass="error" />
	                 </div>
	                  <label class="col-md-2 control-label">성별</label>
	                 <div class="col-md-3">
	                 	<form:select path="gender" cssClass="form-control" required="required">
	                 		<form:option value="male">남자</form:option>
	                 		<form:option value="female">여자</form:option>
	                 	</form:select>
	                 </div>
	             </div>
	         	<div class="form-group">
	                 <label class="col-md-2 control-label">학교</label>
	                 <div class="col-md-5">
	                 	<form:input path="school" cssClass="form-control" maxlength="50" required="required"/>
	                 	<form:errors path="school" cssClass="error" />
	                 </div>
	                 <label class="col-md-2 control-label">학년</label>
	                 <div class="col-md-3">
	                 	<form:select path="schoolYear" cssClass="form-control">
	                 		<form:option value="1">1학년</form:option>
                            <form:option value="2">2학년</form:option>
                            <form:option value="3">3학년</form:option>
                            <form:option value="4">4학년</form:option>
                            <form:option value="5">5학년</form:option>
                            <form:option value="6">6학년</form:option>
	                 	</form:select>
	                 </div>
	             </div>    
	             <div class="form-group">
	                 <label class="col-md-2 control-label">생년월일</label>
	                 <div class="col-md-5">
	                 	<form:input path="birthday" cssClass="form-control bs-datepicker" maxlength="50" required="required"/>
	                 	<form:errors path="birthday" cssClass="error" />
	                 </div>
	             </div>
	             <div class="form-group">
	                 <label class="col-md-2 control-label">등록일</label>
	                 <div class="col-md-5">
	                     <form:input path="joinday" cssClass="form-control bs-datepicker" maxlength="50" required="required"/>
	                     <form:errors path="joinday" cssClass="error" />
	                 </div>
	             </div>
	             <div class="form-group">
	                 <label class="col-md-2 control-label">휴대전화</label>
	                 <div class="col-md-5">
	                 	<form:input path="phone" cssClass="form-control" maxlength="50" required="required"/>
	                 	<form:errors path="phone" cssClass="error" />
	                 </div>
	             </div>
	             <div class="form-group">
	                 <label class="col-md-2 control-label">집전화</label>
	                 <div class="col-md-5">
	                 	<form:input path="homePhone" cssClass="form-control" maxlength="50"/>
	                 	<form:errors path="homePhone" cssClass="error" />
	                 </div>
	             </div>
	             <div class="form-group">
	                <label class="col-md-2 control-label text-right">주소</label>
						<div class="col-md-7">
							<form:input path="address1" cssClass="form-control academy-address1" maxlength="100" readonly="true" required="required"/>
						</div>
						<div class="col-md-3">
							<button type="button" class="btn btn-default" id="find-address">주소찾기</button>
						</div>
	             </div>
	             <div class="form-group">
						<label class="col-md-2 control-label"></label>
						<div class="col-md-7">
							<form:input path="address2" cssClass="form-control" maxlength="100"/>
						</div>
	             </div>
	             <div class="form-group">
	                 <label class="col-md-2 control-label">이메일</label>
	                 <div class="col-md-5">
	                     <form:input path="email" cssClass="form-control" maxlength="100"/>
	                     <form:errors path="email" cssClass="error" />
	                 </div>
	             </div>
	             <div class="form-group">
	                 <label class="col-md-2 control-label">학부모(부)</label>
	                 <div class="col-md-4">
	                     <form:input path="father" cssClass="form-control" maxlength="20"/>
	                 </div>
	                 <label class="col-md-2 control-label">연락처</label>
	                 <div class="col-md-4">
	                     <form:input path="fathersPhone" cssClass="form-control" maxlength="20"/>
	                     <form:errors path="fathersPhone" cssClass="error" />
	                 </div>
	             </div>
	             <div class="form-group">
	                 <label class="col-md-2 control-label">학부모(모)</label>
	                 <div class="col-md-4">
	                     <form:input path="mother" cssClass="form-control" maxlength="20"/>
	                 </div>
	                 <label class="col-md-2 control-label">연락처</label>
	                 <div class="col-md-4">
	                     <form:input path="mothersPhone" cssClass="form-control" maxlength="20"/>
	                     <form:errors path="mothersPhone" cssClass="error" />
	                 </div>
	             </div>
	             <div class="form-group text-center">
	             	<form:button class="btn btn-danger">Save</form:button>
	             </div>
	         </form:form>
	     </div>
	</div>

<!-- END BLOCk -->              
                                  
<content tag="local_script">
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
	<script>
		$(function() {
			$('.app-navigation-horizontal .nav-li-std').addClass('active');
			$('#find-address').off().on('click', function(){
				new daum.Postcode({
		            oncomplete: function(data) {
		            	var fullAddr = '';
		                var extraAddr = '';
		                if (data.userSelectedType === 'R') {
		                    fullAddr = data.roadAddress;
		                } else {
		                    fullAddr = data.jibunAddress;
		                }
		                if(data.userSelectedType === 'R'){
		                    if(data.bname !== ''){
		                        extraAddr += data.bname;
		                    }
		                    if(data.buildingName !== ''){
		                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                    }
		                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
		                }
		                
		                $('.academy-address1').val(fullAddr);
		            }
		        }).open();
			});
		});
	</script>
</content>

</body>
</html>