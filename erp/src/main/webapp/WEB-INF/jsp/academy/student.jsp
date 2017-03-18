<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<div class="block padding-top-20">
    <div class="row">
        <div class="col-md-6">
            <div class="form-group">
                <div class="input-group">
                    <input type="text" class="form-control text-bold" placeholder="Keyword..." value="고길동">
                    <div class="input-group-btn">
                                                               
                        <button class="btn btn-default">Search</button>
                    </div>
                </div>
                <p class="help-block">학생 이름, 전화번호 검색</p>
            </div>
        </div>
        <div class="col-md-6 text-right hidden-mobile">
            <button class="btn btn-default btn-icon-fixed"><span class="icon-graduation-hat"></span> 강좌별</button>
            <button class="btn btn-default btn-icon-fixed"><span class="icon-user"></span> 강사별</button>
            <button class="btn btn-default btn-icon-fixed"><span class="icon-book"></span> 학교별</button>                                    
        </div>
    </div>
</div>



<div class="row">
    <div class="col-md-4">
        
        <!-- START LATEST TRANSACTIONS -->
     <div class="block block-condensed">
         <div class="app-heading">                                        
             <div class="title">
                 <h2>검색 결과</h2>
             </div>              
         </div>
         <div class="block-content">
             <div class="table-responsive">
                 <table class="table table-clean-paddings margin-bottom-0">
                     <thead>
                         <tr>
                             <th>학생이름</th>
                             <th>강좌</th>                
                             <th>강사</th>
                         </tr>
                     </thead>
                     <tbody>
                         <tr>
                             <td>
                                 
                                     <div class="contact-container">
                                         <a href="#">고길동</a>
                                     </div>
                                 
                             </td>
                             <td>보컬 1반</td>
                             <td>홍길동</td>
                         </tr>
                         
                     </tbody>
                 </table>
             </div>
         </div>
     </div>
     <!-- END LATEST TRANSACTIONS -->
     
 </div>

 <div class="col-md-8">
     <div class="block block-condensed padding-top-20">
         <div class="row">
             <div class="col-md-5">
                 <div class="contact contact-bordered contact-single">
                 <img src="assets/images/users/user_4.jpg" alt="">
                 <div class="contact-container">
                     <a href="#">고길동</a>
                     <span>SEO Specialist</span>
                     <p>Im very creative person</p>
                 </div>
                 
                 </div>
                 <div class="list-group" style="padding: 20px;">                                        
                    <div class="list-group-item"><span class="fa fa-map-marker"></span> 서울시 강남구 123-456</div>
                    <div class="list-group-item"><span class="fa fa-phone"></span> 010-1234-5678</div>
                    <div class="list-group-item"><span class="fa fa-envelope"></span> abcde@domain.com</div>                                                                                                                                                                
                    </div> 
                </div>
                
            <div class="block-content ">
                <div class="row">
                    <div class="col-md-6">
                    <button type="button" class="btn btn-default btn-block"><span class="icon-pencil"></span>메모</button>
                    <button type="button" class="btn btn-default btn-block"><span class="icon-smartphone"></span>메시지</button>
                    <button type="button" class="btn btn-default btn-block"><span class="icon-cog"></span>정보수정</button>
                    <button type="button" class="btn btn-default btn-block"><span class="icon-clock"></span>수강현황</button>
                    <button type="button" class="btn btn-default btn-block"><span class="icon-smartphone"></span>수강료현황</button>
                    <button type="button" class="btn btn-default btn-block"><span class="icon-calendar-full"></span>출석현황</button>
                    <button type="button" class="btn btn-default btn-block"><span class="icon-flag"></span>시험현황</button>
                </div>
                </div>                                        
            </div>
            </div>
            
        </div>

    </div>

</div>


<!-- START BLOCk -->
<div class="block block-condensed">
    
    <!-- START PAGE HEADING -->
 <div class="app-heading app-heading-small">                                
     <div class="title">
         <h2>Information</h2>
         <p>Some intresting information here.</p>
     </div>                                
 </div>
 <!-- END PAGE HEADING -->
 <div class="block-content">
     <p>This navigation is ready-to-use as basic app navigation.<br> Use attribute <code>data-navigation-horizontal-toggle</code> on button to show this navigation on mobiles.</p>
    </div>
    <div class="block-content">
        <div class="row margin-top-30">
            <div class="col-md-4">                                    
                <h5>Maecenas ut tempus dolor</h5>
                <p>Praesent semper nisi magna, nec consectetur nulla pretium id. Donec scelerisque leo quis urna aliquet, eget dignissim est rutrum. Sed egestas, lacus a varius mollis, augue eros consequat ligula, scelerisque scelerisque eros lectus sed ante. Aenean ullamcorper dolor nibh, id ullamcorper orci lobortis at. Phasellus dapibus luctus ex, vel aliquet tellus viverra et. Maecenas ut tempus dolor.</p>
                <p>In luctus eu lectus eget tincidunt. Aenean dictum metus vel tortor condimentum finibus. Aenean pharetra tempus efficitur. Vivamus nec mi bibendum, congue eros eu, euismod eros. Nulla faucibus pellentesque velit. Cras varius tellus in tellus posuere, vel pretium ipsum molestie.</p>
            </div>
            <div class="col-md-4">
                <h5>Class aptent taciti sociosqu</h5>
                <p>Duis ligula turpis, sollicitudin nec vehicula id, porta sit amet augue. Sed justo augue, dapibus non lacus vel, pharetra dapibus dui. Etiam ullamcorper libero ipsum, et condimentum ligula aliquam at. Vestibulum suscipit sodales laoreet. Vivamus lacinia, urna sed consequat bibendum, arcu est commodo diam, quis pulvinar nisl purus eget velit.</p>
                <p>Duis ut eros ut ipsum aliquam mattis vel id mauris. Vivamus iaculis purus eget sem ultricies egestas. Nullam et eros ipsum. Sed nec vestibulum nibh, venenatis malesuada leo.In luctus eu lectus eget tincidunt. Aenean dictum metus vel tortor condimentum finibus. Aenean pharetra tempus efficitur.</p>
            </div>
            <div class="col-md-4">
                <h5>Vestibulum tempus ante tincidunt</h5>
                <p>Aenean dictum metus vel tortor condimentum finibus. Aenean pharetra tempus efficitur. In luctus eu lectus eget tincidunt. Vivamus nec mi bibendum, congue eros eu, euismod eros. Nulla faucibus pellentesque velit. Cras varius tellus in tellus posuere, vel pretium ipsum molestie.</p>
                <p>Praesent semper nisi magna, nec consectetur nulla pretium id. Donec scelerisque leo quis urna aliquet, eget dignissim est rutrum. Sed egestas, lacus a varius mollis, augue eros consequat ligula, scelerisque scelerisque eros lectus sed ante. Aenean ullamcorper dolor nibh, id ullamcorper orci lobortis at. Phasellus dapibus luctus ex, vel aliquet tellus viverra et. Maecenas ut tempus dolor.</p>                                    
            </div>
        </div>
    </div>
</div>
<!-- END BLOCk -->                                                
<content tag="local_script">
<script>
$(function() {
  console.log("do something");
});
</script>
</content>

</body>
</html>