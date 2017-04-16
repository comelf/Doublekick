<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>DubleKick Aademy</title>            
        
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="icon" href="favicon.ico" type="image/x-icon">

    <link rel="stylesheet" href="/css/landing.css">
</head>
<body>

	<div class="app">            
            <header id="header" style="background-image: url('assets/images/landing/header_background.jpg');">
                <div class="header">
                    <div class="container">
                        <a href="#" class="logo"></a>
                        <button class="navigation-toggle"><span class="icon-menu"></span></button>
                        <ul class="navigation hidden-mobile">
                            <li><a href="#header">Home</a></li>
                            <li><a href="#features">Features</a></li>                            
                            <li><a href="#pricing">Pricing</a></li>
                            <li>
								<div class="button-holder">
									<a href="/account/login"><button class="btn btn-info login-btn">Log In</button></a>
                                </div>
							</li>
                        </ul>
                    </div>
                </div>
                
                <div class="header-content">
                    <div class="container text-center invert">
                        <h1>DoubleKick Academy</h1>
                        <div class="under-heading">ERP</div>                        
                        <div class="image-container">
                            <!-- <img src="assets/images/landing/presentation.png" alt="Boooya - Revolution Admin Template"> -->
                        </div>
                    </div>
                </div>
            </header>
            
            <section class="section invert section-condensed">
                <div class="container text-center">
                    <a href="index.html" class="btn btn-info btn-shadowed btn-lg btn-icon-fixed margin-right-10"><span class="icon-rocket"></span> Live preview</a> 
                    <a href="#" class="btn btn-danger btn-shadowed btn-lg btn-icon-fixed"><span class="icon-cart"></span> Buy for only $24</a>
                </div>
            </section>
            
            <section class="section" id="features">
                <div class="container">                    
                    
                    <div class="heading-wrapper text-center">                                
                        <div class="above-heading">Why choose Boooya?</div>
                        <h3 class="text-uppercase">The first solution that works for you</h3>
                        <div class="under-heading">Here is a list of our awesome features</div>
                    </div>    
                    
                    <div class="row">
                        <div class="col-md-3">                            
                            <div class="feature text-center">                                
                                <h6 class="text-uppercase text-bolder">120+ pages included</h6>
                                <div class="under-heading">Powered by the best features</div>                                
                                <p>All pages include unique features. This will help you make the application of any complexity.</p>
                            </div>                                                        
                        </div>                        
                        <div class="col-md-3">                            
                            <div class="feature text-center">                                
                                <h6 class="text-uppercase text-bolder">Unlimited possibilities</h6>
                                <div class="under-heading">A well-designed platform</div>                                
                                <p>Our unique, clean and smooth design allows you to use all the components where you want.</p>
                            </div>                                                        
                        </div>
                        <div class="col-md-3">                            
                            <div class="feature text-center">                                
                                <h6 class="text-uppercase text-bolder">100% Responsive</h6>
                                <div class="under-heading">We think about devices</div>                                
                                <p>It means that you can easily build your web application and be sure that it will work well on all devices.</p>
                            </div>                                                        
                        </div>
                        <div class="col-md-3">                            
                            <div class="feature text-center">                                
                                <h6 class="text-uppercase text-bolder">400+ Features</h6>
                                <div class="under-heading">JS plugins and unique features</div>
                                <p>We include most popular plugins and unique Boooya template plugins that was developer special for template.</p>
                            </div>                                                        
                        </div>
                    </div>
                    
                </div>
            </section>

            <section class="section section-highlight">
                <div class="container">                    
                    
                    <div class="row">
                        <div class="col-md-6 text-center">                                                        
                            <img src="assets/images/landing/layouts.png" alt="Boooya - Revolution Admin Template" class="img-responsive">                            
                        </div>
                        <div class="col-md-6">
                            
                            <div class="feature margin-top-50 text-right">
                                <div class="above-heading">Tons of possibilities</div>
                                <h4 class="text-uppercase">35+ Layout Pages</h4>
                                <div class="under-heading">Included with different layout options</div>
                                
                                <p>Template included with different layout options. You can easilit find your option in ready-to-use layout options, or build your own lyout using components.</p>
                                <p><a href="index.html" class="btn btn-danger btn-lg btn-shadowed">Preview Template</a></p>
                            </div>
                            
                        </div>
                    </div>
                    
                </div>
            </section>
            
            <section class="section">
                <div class="container">                    
                    
                    <div class="row">
                        <div class="col-md-6">
                            
                            <div class="feature margin-top-50">                                
                                <div class="above-heading">Mobile Friendly</div>
                                <h4 class="text-uppercase">100% Responsive Template</h4>
                                <div class="under-heading">Boooya &mdash; mobile ready application</div>
                                
                                <p>Made with love and attention to details. As result template supported by any resolution or device. It means that you can easily build your application on desktop and be sure that it looks perfect.</p>
                                <p><a href="index.html" class="btn btn-danger btn-lg btn-shadowed">Preview Template</a></p>
                            </div>
                            
                        </div>
                        <div class="col-md-6 text-center hidden-mobile">                                                        
                            <img src="assets/images/landing/responsive.png" class="dont-resize" alt="Boooya - Revolution Admin Template">                            
                        </div>
                    </div>
                    
                </div>
            </section>
            
            <section class="section section-highlight">
                <div class="container">                    
                    
                    <div class="heading-wrapper text-center">                                
                        <div class="above-heading">Something extra and unique</div>
                        <h3 class="text-uppercase">Awesome features only in Boooya</h3>
                        <div class="under-heading">We develope unique plugins and scripts</div>
                    </div>
                    
                    <div class="row">
                        <div class="col-md-4">                            
                            <div class="feature text-center">
                                <div class="feature-icon feature-icon-sm text-orange-400"><span class="icon-picture"></span></div>
                                <h6 class="text-uppercase text-bolder">Compact Gallery</h6>
                                <div class="under-heading">Save your space using this feature</div>                                
                                <p>It's possible to use all block elements inside this gallery. It will help you to save free space and show lots of information using listing.</p>
                            </div>                                                        
                        </div>                        
                        <div class="col-md-4">                            
                            <div class="feature text-center">                                
                                <div class="feature-icon feature-icon-sm text-lime-400"><span class="icon-bullhorn"></span></div>
                                <h6 class="text-uppercase text-bolder">Tips</h6>
                                <div class="under-heading">Simple informers for you customers</div>
                                <p>Use this tips to inform your customers in new way. Running tips very well draw attention to themselves. Also it can contains with long texts.</p>
                            </div>                                                        
                        </div>
                        <div class="col-md-4">                            
                            <div class="feature text-center">                                
                                <div class="feature-icon feature-icon-sm text-blue-400"><span class="icon-sync"></span></div>
                                <h6 class="text-uppercase text-bolder">Loading</h6>
                                <div class="under-heading">It's easy to show app status</div>
                                <p>Use this feature to show application status. Its supports different colors, and other settings like animation speed, position and other.</p>
                            </div>                                                        
                        </div>                        
                    </div>
                    
                    <div class="row margin-top-50">
                        <div class="col-md-4">                            
                            <div class="feature text-center">
                                <div class="feature-icon feature-icon-sm text-purple-400"><span class="icon-flag"></span></div>
                                <h6 class="text-uppercase text-bolder">Status Bar</h6>
                                <div class="under-heading">Awesome container for alerts and forms</div>
                                <p>Use this feature as informer of form popup block. Also it can be used as alert window to show action status. It's easy to use this feature.</p>
                            </div>                                                        
                        </div>
                        <div class="col-md-4">                            
                            <div class="feature text-center">
                                <div class="feature-icon feature-icon-sm text-pink-400"><span class="icon-rocket"></span></div>
                                <h6 class="text-uppercase text-bolder">Preview</h6>
                                <div class="under-heading">Show your data in new way</div>
                                <p>This feature is based on bootstrap modal window. It easy to call this powerfull feature using few attributes on element.</p>
                            </div>                                                        
                        </div>
                        <div class="col-md-4">                            
                            <div class="feature text-center">
                                <div class="feature-icon feature-icon-sm text-maroon-400"><span class="icon-hourglass"></span></div>
                                <h6 class="text-uppercase text-bolder">And many more...</h6>
                                <div class="under-heading">Tons feature more inside package</div>                                
                                <p>We continue our work on this template every hour, it mean that we incude new features and preparing new updates for you right now.</p>
                            </div>                                                        
                        </div>
                    </div>
                    
                </div>
            </section>
            
            <section class="section" id="pricing">
                <div class="container">
                    
                    <div class="heading-wrapper text-center">                                
                        <div class="above-heading">Our purposal for you</div>
                        <h3 class="text-uppercase">Pricing plans</h3>
                        <div class="under-heading">This is landing page and this prices is just example</div>
                    </div>
                    
                    <div class="row pricing-tables pricing-tables-condensed">
                        <div class="col-md-3">
                            <div class="pricing-table">
                                <div class="title">Simple</div>
                                <div class="price">$16</div>
                                <div class="subtitle">per month</div>
                                <div class="divider"></div>
                                <div class="features">
                                    <div class="line"><span class="fa fa-check"></span> 1 manager</div>
                                    <div class="line"><span class="fa fa-times"></span> <s>Unlimited traffic</s></div>
                                    <div class="line"><span class="fa fa-check"></span> 10 customers</div>
                                    <div class="line"><span class="fa fa-check"></span> 2Gb Diskspace</div>
                                    <div class="line"><span class="fa fa-times"></span> <s>Free anti-virus</s></div>
                                </div>
                                <div class="divider"></div>
                                <div class="button-holder">
                                    <button class="btn btn-info btn-shadowed">Sign Up</button>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="pricing-table">
                                <div class="title">Extended</div>
                                <div class="price">$24</div>
                                <div class="subtitle">per month</div>
                                <div class="divider"></div>
                                <div class="features">
                                    <div class="line"><span class="fa fa-check"></span> 3 managers</div>
                                    <div class="line"><span class="fa fa-check"></span> Unlimited traffic</div>
                                    <div class="line"><span class="fa fa-check"></span> 25 customers</div>
                                    <div class="line"><span class="fa fa-check"></span> 8Gb Diskspace</div>
                                    <div class="line"><span class="fa fa-times"></span> <s>Free anti-virus</s></div>
                                </div>
                                <div class="divider"></div>
                                <div class="button-holder">
                                    <button class="btn btn-info btn-shadowed">Sign Up</button>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">    
                            <div class="pricing-table featured">
                                <div class="title">Premium</div>
                                <div class="price">$69</div>
                                <div class="subtitle">per month</div>
                                <div class="divider"></div>
                                <div class="features">
                                    <div class="line"><span class="fa fa-check"></span> Unlimited managers</div>
                                    <div class="line"><span class="fa fa-check"></span> Unlimited traffic</div>
                                    <div class="line"><span class="fa fa-check"></span> Unlimited customers</div>
                                    <div class="line"><span class="fa fa-check"></span> 120Gb Diskspace</div>
                                    <div class="line"><span class="fa fa-check"></span> Free anti-virus</div>
                                </div>
                                <div class="divider"></div>
                                <div class="button-holder">
                                    <button class="btn btn-danger btn-shadowed">Sign Up</button>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="pricing-table">
                                <div class="title">Business</div>
                                <div class="price">$36</div>
                                <div class="subtitle">per month</div>
                                <div class="divider"></div>
                                <div class="features">
                                    <div class="line"><span class="fa fa-check"></span> 10 managers</div>
                                    <div class="line"><span class="fa fa-check"></span> Unlimited traffic</div>
                                    <div class="line"><span class="fa fa-check"></span> 50 customers</div>
                                    <div class="line"><span class="fa fa-check"></span> 16Gb Diskspace</div>
                                    <div class="line"><span class="fa fa-check"></span> Free anti-virus</div>
                                </div>
                                <div class="divider"></div>
                                <div class="button-holder">
                                    <button class="btn btn-info btn-shadowed">Sign Up</button>
                                </div>
                            </div>
                        </div>

                    </div>
                    
                </div>
            </section>
                              
            <!-- START APP FOOTER -->
            <div class="app-footer app-footer-default" id="footer">
                <div class="container">                    
                    <div class="app-footer-line extended">
                        <div class="row">
                            <div class="col-md-6 col-sm-6">
                            	<div class="f_info">
							        <p class="f_logo"><img src="http://dublekickacademy.com/files/attach/images/208/ba05fdaf6bb216263afe6d834175c78b.png" alt=""> </p>
							        <p class="information">주식회사 더블킥아카데미<br>
							          대표자: 박장근<br>
							          사업자등록번호 : 인천점-714-88-00354<br>
							          사업자등록번호 : 수원점-142-91-14198<br>
							          인천점-인천시 부평구 경원대로 1415 파라움빌딩 9F<br>
									  수원점-수원시 팔달구 매교동 4-1 5F <br>
									</p>
							        <h1 class="information">1599. 3439</h1>
							        <p class="sub_desc"></p>
							      </div>
                            </div>
<!--                             <div class="col-md-3 col-sm-6">
                                <h3 class="title"><span class="icon-clipboard-text"></span> About Us</h3>
                                <ul class="list-unstyled">
                                    <li><a href="#">About</a></li>                                                                
                                    <li><a href="#">Team</a></li>
                                    <li><a href="#">Why use us?</a></li>
                                    <li><a href="#">Careers</a></li>
                                </ul>
                            </div> -->
                            <div class="col-md-3 col-sm-6">                            
                                <h3 class="title"><span class="icon-lifebuoy"></span> Need Help?</h3>
                                <ul class="list-unstyled">
                                    <li><a href="#">FAQ</a></li>                                                                
                                    <li><a href="#">Community</a></li>
                                    <li><a href="#">Contacts</a></li>
                                    <li><a href="#">Terms & Conditions</a></li>
                                </ul>
                            </div>
                            
                            <div class="col-md-3 col-sm-6">
                                <h3 class="title"><span class="icon-thumbs-up"></span> Social Media</h3>

                                <a href="#" class="label-icon label-icon-footer label-icon-bordered label-icon-rounded label-icon-lg">
                                    <i class="fa fa-facebook"></i>
                                </a>
                                <a href="#" class="label-icon label-icon-footer label-icon-bordered label-icon-rounded label-icon-lg">
                                    <i class="fa fa-twitter"></i>
                                </a>
                                <a href="#" class="label-icon label-icon-footer label-icon-bordered label-icon-rounded label-icon-lg">
                                    <i class="fa fa-youtube"></i>
                                </a>
                                <a href="#" class="label-icon label-icon-footer label-icon-bordered label-icon-rounded label-icon-lg">
                                    <i class="fa fa-google-plus"></i>
                                </a>
                                <a href="#" class="label-icon label-icon-footer label-icon-bordered label-icon-rounded label-icon-lg">
                                    <i class="fa fa-feed"></i>
                                </a>

                                <h3 class="title"><span class="icon-paper-plane"></span> Subscribe</h3>

                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="E-mail...">
                                    <div class="input-group-btn">
                                        <button class="btn btn-primary">GO</button>
                                    </div>
                                </div> 
                            </div>                        
                        </div>                    
                    </div>
                </div>
                <div class="app-footer-line darken">                
                    <div class="copyright wide text-center">copyrights &copy; 2016 DUBLEKICK ACADEMY. all rights reserved</div>                
                </div>                
            </div>
            <!-- END APP FOOTER -->
            
        </div>        
        <!-- END APP WRAPPER -->                
        
        <!-- START SCRIPTS -->
        <script type="text/javascript" src="/js/lib/jquery/jquery.min.js"></script>
		<script type="text/javascript" src="/js/lib/jquery/jquery-migrate.min.js"></script>
	    <script type="text/javascript" src="/js/lib/jquery/jquery-ui.min.js"></script>
	    <script type="text/javascript" src="/js/lib/bootstrap/bootstrap.min.js"></script>
        
        <script type="text/javascript" src="/js/app_landing.js"></script>


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