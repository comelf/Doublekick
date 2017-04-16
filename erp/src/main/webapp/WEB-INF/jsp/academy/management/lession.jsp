<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<div class="row academy-management-lession">
    	<div class="col-md-3">
    		<div class="block padding-10 ">
    			<div class="app-heading">                                
	                <div class="row">
	    				<div class="col-md-12">
	    					<h5>강좌분류 <button class="btn btn-primary btn-xs pull-right">추가</button></h5>
	    				</div>
	    			</div>
		        </div>
				<div class="block-content">
	                 <div class="list-group">                              
	                    <div class="list-group-item text-sm active">
	                    	<div class="row">
	                    		<div class="col-md-5">보컬<span class="badge pull-right">2</span></div>
	                    		<div class="pull-right" style="margin-left: 5px;">삭제</div>
	                    		<div class="pull-right">편집</div>
	                    	</div>
	                    </div>
	                    <div class="list-group-item text-sm">
	                    	<div class="row">
	                    		<div class="col-md-5">오디션<span class="badge pull-right">2</span></div>
	                    		<div class="pull-right" style="margin-left: 5px;">삭제</div>
	                    		<div class="pull-right">편집</div>
	                    	</div>
	                    </div>
	                    <div class="list-group-item text-sm">
	                    	<div class="row">
	                    		<div class="col-md-5">힙합<span class="badge pull-right">5</span></div>
	                    		<div class="pull-right" style="margin-left: 5px;">삭제</div>
	                    		<div class="pull-right">편집</div>
	                    	</div>
	                    </div>
	                 </div> 
		         </div>
			</div>
    	</div>
    	<div class="col-md-3">
    		<div class="block padding-10 ">
    			<div class="app-heading">                                
	                <div class="row">
	    				<div class="col-md-12">
	    					<h5>강좌목록 <button class="btn btn-primary btn-xs pull-right">추가</button></h5>
	    				</div>
	    			</div>
		        </div>
				<div class="block-content">
	                 <div class="list-group">                              
	                    <div class="list-group-item text-sm active">
	                    	<div class="row">
	                    		<div class="col-md-5">보컬A</div>
	                    		<div class="col-md-3">개인레슨</div>
	                    		<div class="pull-right" style="margin-left: 5px;">삭제</div>
	                    		<div class="pull-right">편집</div>
	                    	</div>
	                    </div>
	                    <div class="list-group-item text-sm">
	                    	<div class="row">
	                    		<div class="col-md-5">보컬B</div>
	                    		<div class="col-md-3">그룹레슨</div>
	                    		<div class="pull-right" style="margin-left: 5px;">삭제</div>
	                    		<div class="pull-right">편집</div>
	                    	</div>
	                    </div>
	                 </div> 
		         </div>
			</div>
    	</div>
    	<div class="col-md-6">
    		<div class="block block-condensed">
    			<div class="app-heading">                                
	                    <h5>보컬A </h5>
	                    <p>보컬 - 개인레슨</p>
	            </div>
	            
	            <div class="block-content">
	                <div class="row">
	                    <div class="col-md-12">
			    			<form class="form-horizontal">
                                <div class="form-group">
                                    <label class="col-md-2 control-label">상태</label>
                                    <div class="col-md-4">
                                        <select class="form-control">
                                            <option>활성</option>
                                            <option>폐강</option>
                                            <option>대기</option>
                                        </select>
                                    </div>
                                    <div class="col-md-4">
                                   	
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-2 control-label">레슨방식</label>
                                    <div class="col-md-10">
                                         <select class="form-control">
                                            <option>그룹레슨</option>
                                            <option>개인레슨</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-2 control-label">시간</label>
                                    <div class="col-md-10">
                                        <input type="text" class="form-control" placeholder="1시간">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-2 control-label">수강료</label>
                                    <div class="col-md-10">
                                        <input type="number" class="form-control" placeholder="100000">
                                    </div>
                                </div>
                            </form>
	                    </div>
	                     <div class="col-md-12 margin-top-15">
				               <div class="input-group">
				                   <button class="btn btn-danger pull-right">저장</button>
				               </div>
	                    </div>
	                </div>
	            </div>
    		</div>
		</div>
	</div>

<!-- END BLOCk -->                                                
<content tag="local_script">
	<script>
		$(function() {
			$('.app-navigation-horizontal .nav-li-mgnt').addClass('active');
			$('.app-navigation-horizontal .li-aca-mgnt-lession').addClass('active');
			
			$('.app-content-tabs a:first').tab('show');
		});
	</script>
</content>

</body>
</html>