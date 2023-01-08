<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script>
	const storedTheme = localStorage.getItem('theme');
	
	function getPreferredTheme() {
		if(storedTheme) return storedTheme;
    	return window.matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light';
	}
  
	function setTheme(theme) {	// html 컬러변경
	    if (theme === 'auto' && window.matchMedia('(prefers-color-scheme: dark)').matches) {
	    	$("html").attr("data-bs-theme", "dark");
	    } else {
	    	$("html").attr("data-bs-theme", theme);
	    }
		$(".change-theme").removeClass("active");
	    $("[data-bs-theme-value='" + theme + "']").addClass("active");
	    $("#theme-icon").removeClass().addClass("fa-solid");
	    
	    if(theme === "light") { $("#theme-icon").addClass(["fa-sun", "text-warning"]);
	    } else if(theme === "dark") { $("#theme-icon").addClass("fa-moon");
	    } else if(theme === "auto") { $("#theme-icon").addClass(["fa-wand-magic-sparkles", "text-success"]); }
	}

	$(document).ready(function(){ 
		setTheme(getPreferredTheme());
		
		$(".change-theme").click(function(){
			let theme = $(this).attr("data-bs-theme-value");
			setTheme(theme);
			localStorage.setItem('theme', theme);
		});
	});
	
</script>
<nav class="navbar navbar-expand bg-body-tertiary bd-navbar sticky-top">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">
			<!-- 로고 추후수정 -->
			<i class="fa-solid fa-book"></i>
		</a>
		<div id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" data-bs-auto-close="outside" aria-expanded="false">
						<!-- 드롭다운 메뉴 -->
						<i class="fa-solid fa-gear"></i>
					</a>
					<ul class="dropdown-menu dropdown-menu-end">
						<li><a class="dropdown-item" href="#">Action</a></li>
						<li><a class="dropdown-item" href="#">Another action</a></li>
						<li>
							<div class="dropstart dropdown-item" data-bs-toggle="dropdown" aria-expanded="false">
								<div class="" data-bs-auto-close="inside">
									테마&nbsp;&nbsp;<i class="fa-solid" id="theme-icon"></i>
								</div>
								<ul class="dropdown-menu">
									<li>
										<button type="button" class="dropdown-item d-flex align-items-center text-warning change-theme" data-bs-theme-value="light">
											<i class="fa-solid fa-sun"></i>&nbsp;Light
										</button>
									</li>
									<li>
										<button type="button" class="dropdown-item d-flex align-items-center change-theme" data-bs-theme-value="dark">
											<i class="fa-solid fa-moon"></i>&nbsp;&nbsp;Dark
										</button>
									</li>
									<li>
										<button type="button" class="dropdown-item d-flex align-items-center text-success change-theme" data-bs-theme-value="auto">
											<i class="fa-solid fa-wand-magic-sparkles"></i>&nbsp;Auto
										</button>
									</li>
								</ul>
							</div>
						</li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Something else here</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
</nav>