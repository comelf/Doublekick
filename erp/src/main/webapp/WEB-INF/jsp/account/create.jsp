<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>이단옆차기 실용음악 학원</title>

<link rel="stylesheet" href="/css/styles.css">
<link rel="stylesheet" href="/css/account.css">
</head>
<body>
	<div class="app">
		<div class="app-container">
			<div class="account-create">
				<div class="block">
					<div class="account-create-box-title">
						<div class="title">회원가입</div>
						<div class="subtitle"></div>
					</div>

					<form class="form-horizontal">
						<div class="app-heading app-heading-small">
							<div class="title">
								<h2>사용자 정보</h2>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-right">학원이름</label>
							<div class="col-md-10">
								<input type="text" class="form-control" name="academyName"
									required="required" placeholder="Academy Name">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-right">학원전화번호</label>
							<div class="col-md-2">
								<select class="form-control">
									<option value="0">없음</option>
									<option value="02">02</option>
									<option value="051">051</option>
									<option value="053">053</option>
									<option value="032">032</option>
									<option value="062">062</option>
									<option value="042">042</option>
									<option value="052">052</option>
									<option value="044">044</option>
									<option value="031">031</option>
									<option value="033">033</option>
									<option value="043">043</option>
									<option value="041">041</option>
									<option value="063">063</option>
									<option value="061">061</option>
									<option value="054">054</option>
									<option value="055">055</option>
									<option value="064">064</option>
									<option value="070">070</option>
									<option value="010">010</option>
									<option value="011">011</option>
									<option value="016">016</option>
								</select>
							</div>
							<div class="hyphen">-</div>
							<div class="col-md-2">
								<input type="number" class="form-control" maxlength="4"
									required="required">
							</div>
							<span class="hyphen">-</span>
							<div class="col-md-2">
								<input type="number" class="form-control" maxlength="4"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-right">휴대전화</label>
							<div class="col-md-2">
								<input type="number" class="form-control" maxlength="4"
									required="required">
							</div>
							<div class="hyphen">-</div>
							<div class="col-md-2">
								<input type="number" class="form-control" maxlength="4"
									required="required">
							</div>
							<span class="hyphen">-</span>
							<div class="col-md-2">
								<input type="number" class="form-control" maxlength="4"
									required="required">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-right">학원주소</label>
							<div class="col-md-7">
								<input type="text" class="form-control academy-address1" readonly="readonly"
									required="required">
							</div>
							<div class="col-md-3">
								<button type="button" class="btn btn-default" id="find-address">주소찾기</button>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label"></label>
							<div class="col-md-7">
								<input type="text" class="form-control">
							</div>
						</div>

						<div class="app-heading app-heading-small">
							<div class="title">
								<h2>계정 정보</h2>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-2 control-label text-right">아이디</label>
							<div class="col-md-5">
								<input type="text" class="form-control">
							</div>
							<div class="col-md-3">
							<button type="button" class="btn btn-default">중복확인</button>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-right">비밀번호</label>
							<div class="col-md-10">
								<input type="password" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-right">비밀번호확인</label>
							<div class="col-md-10">
								<input type="password" class="form-control">
							</div>
						</div>
						<div class="form-group text-center">
							<button type="submit" class="btn btn-primary btn-create">회원가입하기</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="/js/lib/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/js/lib/jquery/jquery-migrate.min.js"></script>
	<script type="text/javascript" src="/js/lib/jquery/jquery-ui.min.js"></script>
	<script type="text/javascript" src="/js/lib/bootstrap/bootstrap.min.js"></script>
	<script type="text/javascript" src="/js/lib/moment/moment.min.js"></script>
	<script type="text/javascript" src="/js/lib/customscrollbar/jquery.mCustomScrollbar.min.js"></script>
	<script type="text/javascript" src="/js/app.js"></script>
	<script type="text/javascript" src="/js/app_plugins.js"></script>
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
	<script>
		$( document ).ready(function() {
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
</body>
</html>