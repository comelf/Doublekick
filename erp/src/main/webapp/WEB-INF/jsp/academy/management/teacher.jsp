<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<div class="row academy-student">
    	<div class="col-md-3">
    		<div class="app-content-tabs tabs-sm">
		        <ul>                            
		            <li><a href="#tab-1" class="text-sm active">검색</a></li>
		            <li><a href="#tab-2" class="text-sm">강좌별</a></li>
		        </ul>
		    </div>
    		<div class="block padding-10 ">
		        <div class="container app-content-tab" id="tab-1">
					<div class="row margin-bottom-15">
					        <div class="form-group">
					            <div class="input-group">
					                <input type="text" class="form-control text-bold input-sm" placeholder="Keyword..." value="고길동">
					                <div class="input-group-btn">
					                    <button class="btn btn-default btn-sm margin-top-0 margin-bottom-0">Search</button>
					                </div>
					            </div>
					            <p class="help-block text-sm margin-left-5">학생 이름, 전화번호 검색</p>
					        </div>
					</div>
					<div class="row">
						<div class="block-content">
			                 <div class="list-group">                                        
			                    <div class="list-group-item text-sm active">
			                    	<div class="row">
			                    		<div class="col-md-5">김선생</div>
			                    		<div class="col-md-7 text-center">전임 강사</div>
			                    	</div>
			                    </div>
			                    <div class="list-group-item text-sm">
			                    	<div class="row">
			                    		<div class="col-md-5">이선생</div>
			                    		<div class="col-md-7 text-center">시간 강사</div>
			                    	</div>
			                    </div>
			                    <div class="list-group-item text-sm">
			                    	<div class="row">
			                    		<div class="col-md-5">박강사</div>
			                    		<div class="col-md-7 text-center">강사 대학</div>
			                    	</div>
			                    </div>                                                                                                                                                                
			                 </div> 
				         </div>
					</div>
                </div>
              	<div class="container app-content-tab" id="tab-2">
              		<div class="row accordion-list">
	                        <div class="panel-group" id="" role="course-list" aria-multiselectable="true">
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="course-heading-1" role="button" data-toggle="collapse" data-parent="#course-list" href="#course-1" aria-expanded="true" aria-controls="course-1">
							    보컬 A <div class="pull-right"><span class="badge">3</span></div> 
							    </div>
							    <div id="course-1" class="panel-collapse collapse" role="tabpanel" aria-labelledby="course-heading-1">
							      <div class="panel-body">
							        <div class="list-group">                                        
					                    <div class="list-group-item text-sm">
					                    	<div class="row">
					                    		<div class="col-md-5">고길동</div>
			                    				<div class="col-md-7 text-center">삼번 고등학교</div>
					                    	</div>
					                    </div>
					                    <div class="list-group-item text-sm">
					                    	<div class="row">
					                    		<div class="col-md-5">고길동</div>
			                    				<div class="col-md-7 text-center">삼번 고등학교</div>
					                    	</div>
					                    </div>
					                    <div class="list-group-item text-sm">
					                    	<div class="row">
					                    		<div class="col-md-5">고길동</div>
			                    				<div class="col-md-7 text-center">삼번 고등학교</div>
					                    	</div>
					                    </div>                                                                                                                                                                
			                 		</div> 
							      </div>
							    </div>
							  </div>
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="course-heading-2" role="button" data-toggle="collapse" data-parent="#course-list" href="#course-2" aria-expanded="false" aria-controls="course-2">
									보컬 B <div class="pull-right"><span class="badge">1</span></div>
							    </div>
							    <div id="course-2" class="panel-collapse collapse" role="tabpanel" aria-labelledby="course-heading-2">
							      <div class="panel-body">
							        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							      </div>
							    </div>
							  </div>
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="course-heading-3" role="button" data-toggle="collapse" data-parent="#course-list" href="#course-3" aria-expanded="false" aria-controls="course-3">
							          드럼 A <div class="pull-right"><span class="badge">6</span></div>
							    </div>
							    <div id="course-3" class="panel-collapse collapse" role="tabpanel" aria-labelledby="course-heading-3">
							      <div class="panel-body">
							        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							      </div>
							    </div>
							  </div>
							</div>
	                </div>
	        	</div>
	        	<div class="container app-content-tab" id="tab-3">
	        		<div class="row accordion-list">
	                    <div class="col-md-12">                                    
	                        <div class="panel-group" id="teacher-list" role="tablist" aria-multiselectable="true">
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="teacher-heading-1" role="button" data-toggle="collapse" data-parent="#teacher-list" href="#teacher-list-1" aria-expanded="true" aria-controls="teacher-list-1">
							    강사1 <div class="pull-right"><span class="badge">3</span></div> 
							    </div>
							    <div id="teacher-list-1" class="panel-collapse collapse" role="tabpanel" aria-labelledby="teacher-heading-1">
							      <div class="panel-body">
							        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							      </div>
							    </div>
							  </div>
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="teacher-heading-2" role="button" data-toggle="collapse" data-parent="#teacher-list" href="#teacher-list-2" aria-expanded="false" aria-controls="teacher-list-2">
									강사2 <div class="pull-right"><span class="badge">1</span></div>
							    </div>
							    <div id="teacher-list-2" class="panel-collapse collapse" role="tabpanel" aria-labelledby="teacher-heading-2">
							      <div class="panel-body">
							        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							      </div>
							    </div>
							  </div>
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="teacher-heading-3" role="button" data-toggle="collapse" data-parent="#teacher-list" href="#teacher-list-3" aria-expanded="false" aria-controls="teacher-list-3">
							          강사3 <div class="pull-right"><span class="badge">6</span></div>
							    </div>
							    <div id="teacher-list-3" class="panel-collapse collapse" role="tabpanel" aria-labelledby="teacher-heading-3">
							      <div class="panel-body">
							        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							      </div>
							    </div>
							  </div>
							</div>
	                    </div>
	                </div>
	        	</div>
			</div>
    	</div>
    	<div class="col-md-4 margin-top-10">
    		<div class="block block-condensed padding-top-15 padding-bottom-15">
		             <div class="col-md-6">
		                 <div class="contact contact-bordered contact-single">
		                 <img src="/assets/images/users/user_4.jpg" alt="">
		                 <div class="contact-container">
		                     <a href="#">고길동</a>
		                     <!-- <span>SEO Specialist</span>
		                     <p>Im very creative person</p> -->
		                 </div>
		                 
		                 </div>
		                 <div class="list-group">                                        
		                    <div class="list-group-item text-xs"><span class="fa fa-map-marker"></span> 서울시 강남구 123-456</div>
		                    <div class="list-group-item text-xs"><span class="fa fa-phone"></span> 010-1234-5678</div>
		                    <div class="list-group-item text-xs"><span class="fa fa-envelope"></span> abcde@domain.com</div>                                                                                                                                                                
		                 </div> 
		            </div>
                    <div class="col-md-6">
	                    <button type="button" class="btn btn-default btn-block"><span class="icon-smartphone"></span>메시지</button>
	                    <button type="button" class="btn btn-default btn-block"><span class="icon-cog"></span>정보수정</button>
	                    <button type="button" class="btn btn-default btn-block"><span class="icon-smartphone"></span>수업현황</button>
	                    <button type="button" class="btn btn-default btn-block"><span class="icon-clock"></span>강의이력</button>
                	</div>
			</div>
    	</div>
    	<div class="col-md-5 margin-top-10">
    		<div class="block block-condensed padding-top-15">
    			
    		</div>
		</div>
	</div>


<!-- END BLOCk -->                                                
<content tag="local_script">
	<script>
		$(function() {
			$('.app-navigation-horizontal .nav-li-mgnt').addClass('active');
			$('.app-navigation-horizontal .li-aca-mgnt-teacher').addClass('active');
			
			$('.app-content-tabs a:first').tab('show');
		});
	</script>
</content>

</body>
</html>