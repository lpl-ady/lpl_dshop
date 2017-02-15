$(document).ready(function(){
	
	$(document).keypress(function(e) { 
	   if(e.which == 13) { 
		   jQuery("#button").click(); 
	       } 
	   }); 
	
	$("#button").click(function(e){
		var username = $("#username").val();
		var password = $("#password").val();
		if($.trim(username) == "" && $.trim(password)=="")
		{
			alert("信息填写不完整!");
			return ;
		}
		
		$.ajax({
		    cache: true,
		    type: "POST",
		    url:"/admin/loginAction",
		    data:$('#loginForm').serialize(),
		    async: false,
		    error: function(request) {
		        alert("系统错误！");
		    },
		    success: function(data) {
		    	if(data == 1){
		    		window.location.href="/admin/index";
		    	}else{
		    		alert("用户名或密码错误！");
		    	}
		    }
		});	
	});
});