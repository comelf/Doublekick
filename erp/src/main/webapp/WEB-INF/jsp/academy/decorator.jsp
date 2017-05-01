<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>이단옆차기 실용음악 학원</title>
	
	<link rel="stylesheet" href="/css/styles.css">
	<link rel="stylesheet" href="/css/academy.css">

	<sitemesh:write property="head" />
</head>
<body>
	<!-- APP WRAPPER -->
        <div class="app">
            
            <!-- START APP CONTAINER -->
            <div class="app-container">                
                <!-- START APP HEADER -->
                <div class="app-header app-header-design-default">        
                    <div class="container container-boxed">
                        <ul class="app-header-buttons visible-mobile">
                            <li><a href="#" class="btn btn-link btn-icon" data-navigation-horizontal-toggle="true"><span class="icon-menu"></span></a></li>                    
                        </ul>
                        <a href="index.html" style="font-size: 32px;padding: 20px;display: inline-block;font-weight: bold;color: #000;float: left;">LOGO</a>
                        
                        <div class="app-header-navigation app-header-navigation-hover">
                        <nav>
                            <ul>
                                <li>
                                    <a href="#">강남점</a>
                                </li>                
                                <li>
                                    <a href="#">명동점</a>
                                </li>
                                <li>
                                    <a href="#">수원점</a>
                                </li>
                            </ul>
                        </nav>
                    </div>


                        <ul class="app-header-buttons pull-right">
                            <li>
                                <div class="contact contact-rounded contact-bordered contact-lg contact-ps-controls">
                                    <img src="/assets/images/users/user_1.jpg" alt="John Doe">
                                    <div class="contact-container">
                                        <a href="#">홍길동</a>
                                        <span>보컬 강사</span>
                                    </div>
                                    <div class="contact-controls">
                                        <div class="dropdown">
                                            <button type="button" class="btn btn-default btn-icon" data-toggle="dropdown"><span class="icon-cog"></span></button>                        
                                            <ul class="dropdown-menu dropdown-left">
                                                <li><a href="#"><span class="icon-cog"></span> Settings</a></li> 
                                                <li><a href="#"><span class="icon-envelope"></span> Messages <span class="label label-danger pull-right">+24</span></a></li>
                                                <li><a href="#"><span class="icon-users"></span> Contacts <span class="label label-default pull-right">76</span></a></li>
                                                <li class="divider"></li>
                                                <li><a href="/account/logout"><span class="icon-exit"></span> Log Out</a></li> 
                                            </ul>
                                        </div>                    
                                    </div>
                                </div>
                            </li>        
                        </ul>              
                    </div>
                </div>
                <!-- END APP HEADER  -->
                
                <!-- START APP CONTENT -->
                <div class="app-content">
                    <div class="app-navigation-horizontal">    
                        <div class="container container-boxed">
                            <nav>
                                <ul>
                                    <li class="nav-li-std">
                                        <a href="#"><span class="icon-users"></span> 학생관리</a>
                                        <ul>
                                            <li class="li-menu-std"><a href="/academy/${currentAcaBranch.id}/student">학생조회</a></li>
                                            <li class="li-menu-std-lesson"><a href="/academy/${currentAcaBranch.id}/student/lesson">수업관리</a></li>
                                            <li class="li-menu-std-attendance"><a href="/academy/${currentAcaBranch.id}/student/attendance">출결관리</a></li>
                                            <li class="li-menu-std-grade"><a href="/academy/${currentAcaBranch.id}/student/grade">성적관리</a></li>
                                            <li class="li-menu-std-group"><a href="/academy/${currentAcaBranch.id}/student/group">단체처리</a></li>
                                            <li class="li-menu-std-management"><a href="/academy/${currentAcaBranch.id}/student/management">학생정보삭제</a></li>
                                            <li class="li-menu-std-add pull-right"><a href="/academy/${currentAcaBranch.id}/student/add" class="std-add-btn">학생추가</a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-li-mgnt">
                                        <a href="#"><span class="icon-apartment"></span> 학원관리</a>                
                                        <ul>
                                        	<li class="li-aca-mgnt-lession"><a href="/academy/${currentAcaBranch.id}/management/lession">수업관리</a></li>
                                            <li class="li-aca-mgnt-package"><a href="/academy/${currentAcaBranch.id}/management/package">패키지관리</a></li>
                                            <li class="li-aca-mgnt-teacher"><a href="/academy/${currentAcaBranch.id}/management/teacher">강사관리</a></li>
                                            <li class="li-aca-mgnt-room"><a href="/academy/${currentAcaBranch.id}/management/room">연습실 현황</a></li>
                                            <li class="li-aca-mgnt-schedule"><a href="/academy/${currentAcaBranch.id}/management/schedule">스케줄 관리</a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-li-acc">
                                        <a href="#"><span class="icon-laptop"></span> 수납관리</a>                
                                        <ul>
                                            <li class="li-aca-mgnt-payment"><a href="/academy/${currentAcaBranch.id}/payment">수납현황</a></li>
                                            <li class="li-aca-mgnt-default"><a href="/academy/${currentAcaBranch.id}/default">미납현황</a></li>
                                            <li class="li-aca-mgnt-accountring"><a href="/academy/${currentAcaBranch.id}/accounting">회계분석</a></li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="#"><span class="icon-chart-bars"></span>통계분석</a>                
                                        <ul>
                                            <li class="li-aca-stat-total"><a href="/academy/statistic/total">종합현황</a></li>
                                            <li class="li-aca-stat-branch"><a href="/academy/statistic/branch">지점별 현황</a></li>
                                            <li class="li-aca-stat-branch-comp"><a href="/academy/statistic/branch/comparison">지점별 비교</a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-li-sys">
                                        <a href="#"><span class="icon-calendar-full"></span>시스템</a>                
                                        <ul>
                                            <li><a href="/academy/notice">공지사항</a></li>
                                            <li><a href="/academy/config">시스템 설정</a></li>
                                            <li><a href="/academy/syslog">시스템 로그</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                                                                                                  
                    <!-- START PAGE CONTAINER -->
                    <div class="container container-boxed">
                        <sitemesh:write property="body" />
                    </div>
                    <!-- END PAGE CONTAINER -->
                    
                </div>
                <!-- END APP CONTENT -->
                                
            </div>
            <!-- END APP CONTAINER -->            
            
        </div>        
        <!-- END APP WRAPPER -->  
	

	<div id="script-wrapper">
		<script type="text/javascript" src="/js/lib/jquery/jquery.min.js"></script>
		<script type="text/javascript" src="/js/lib/jquery/jquery-migrate.min.js"></script>
	    <script type="text/javascript" src="/js/lib/jquery/jquery-ui.min.js"></script>
	    <script type="text/javascript" src="/js/lib/bootstrap/bootstrap.min.js"></script>
	    <script type="text/javascript" src="/js/lib/moment/moment.min.js"></script>
	    <script type="text/javascript" src="/js/lib/bootstrap-select/bootstrap-select.js"></script>
	    <script type="text/javascript" src="/js/lib/select2/select2.full.min.js"></script>
	    <script type="text/javascript" src="/js/lib/customscrollbar/jquery.mCustomScrollbar.min.js"></script>
	    <script type="text/javascript" src="/js/lib/multiselect/jquery.multi-select.js"></script>
	    <script type="text/javascript" src="/js/lib/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
        <script type="text/javascript" src="/js/lib/bootstrap-daterange/daterangepicker.js"></script>
	    <script type="text/javascript" src="/js/app.js"></script>
	    <script type="text/javascript" src="/js/app_plugins.js"></script> 
	    
	    <sitemesh:write property="page.local_script"/>
	</div>
</body>
</html>