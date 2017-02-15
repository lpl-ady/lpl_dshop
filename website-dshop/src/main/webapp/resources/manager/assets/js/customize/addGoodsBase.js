jQuery(function($) {
	
		$('[data-rel=tooltip]').tooltip();
		var mainFileIndex;
		layui.use('upload', function(){
		  layui.upload({
		    url: '/admin/goods/addSingleImage' //上传接口
		    ,elem: '#mainFile'
		    ,title:'点击上传'
		    ,ext: 'jpg|png|gif'
	    	,before: function(input){
	    		mainFileIndex = layer.load(1, {shade: [0.1,'#fff']});
	    	  }
		    ,success: function(res){ //上传成功后的回调
		    	layer.close(mainFileIndex);
		    	if(res.code == "1000")
	    		{
		    		$("#goodsImage").val(res.imgName);
		    		$("#mainFileImg").attr("src",goodsImg+"/"+res.imgName);
	    		}else if(res.code == "1001"){
	    			layer.alert('图片超过指定大小', {icon: 5})
	    		}else if(res.code == "1002"){
	    			layer.alert('图片非指定类型', {icon: 5})
	    		}else{
	    			layer.alert('图片上传失败', {icon: 5})
	    		}
		    }
		  });
		});
	
		$("#cateId1").change(function (){
			var cateId = $(this).val();
			changeCate(cateId,"cateId2");
		});
		
		$("#cateId2").change(function (){
			var cateId = $(this).val();
			changeCate(cateId,"cateId3");
		});
		
		function changeCate(cateId,obj)
		{
			if(obj === "cateId2")
		    {
			   $("#cateId2").html("");$("#cateId3").html("");
		    }else if(obj === "cateId3")
		    {
			   $("#cateId3").html("");
		    }
			if(cateId === "")
			{
				return;
			}	
			var storeId = $("#storeId").val();
			$.ajax({
				type: "POST",
				url:"/admin/category/selectByPidAndStoreId?pid="+cateId+"&storeId="+storeId+"&cate="+obj,
				dataType:"json",
				cache:false,
				success: function(data){
			       if(null != data && null != data.cateList){
			    	   $("#"+obj).append("<option value='' selected='selected'>---请选择---</option>");
			        	for (var i = 0; i < data.cateList.length; i++) {
			        		$("#"+obj).append("<option value='"+data.cateList[i].cateId+"'>"+data.cateList[i].cateName+"</option>");
			        	}
			       }else{
			    	   if(obj === "cateId2")
					   {
			    		   $("#cateId2").append("<option value=''></option>");
			    		   $("#cateId3").append("<option value=''></option>");
					   }else if(obj === "cateId3")
					   {
						   $("#cateId3").append("<option value=''></option>");
					   }
			       }
			},error:function(){
				layer.alert('系统错误', {icon: 5})
			}
		   });
		}
		
		//是否虚拟商品操作
		$("input:radio[name='isVirtual']").change(function (){
			var isVirtual = $(this).val();
			if(isVirtual == 1){
				var mess = '<div style="height: 40px"><label class="control-label col-sm-3" style="line-height: 20px;">商品有效期:</label><input type="text" placeholder="单位：天" id="virtualIndate" class="col-xs-12 col-sm-4"></div>';
					mess = mess + '<div style="height: 40px"><label class="control-label col-sm-3" style="line-height: 20px;">购买上限:</label><input type="text" id="virtualLimit" class="col-xs-12 col-sm-4"></div>';
					mess = mess + '<div><label class="control-label col-sm-3" style="line-height: 20px;">过期退款:</label><label class="blue"><input name="virtualInvalidRefund" value="1" type="radio" checked="checked" class="ace" /><span class="lbl">是</span><span style="margin-left: 8px;"></span><input name="virtualInvalidRefund" value="0" type="radio" class="ace" /><span class="lbl">否</span></label></div>';
				bootbox.dialog({
					message: mess,
					title: "虚拟商品选项",
					onEscape: function() {
						$("input:radio[name='isVirtual'][value=0]").prop('checked',true);
						$("#virtualIndateConf").val("");
						$("#virtualLimitConf").val("");
						$("#virtualInvalidRefundConf").val("");
					},
					buttons: {
						success: {
							label: "确定",
							callback: function() {
								var virtualIndate = $("#virtualIndate").val();
								var virtualLimit = $("#virtualLimit").val();
								if(virtualIndate === "" || virtualLimit === ""){
									if (confirm("提示：商品有效期或者限购数为空将为默认值")==false){
										   return false;
									}
							    }
								var virtualInvalidRefund = $("input:radio[name='virtualInvalidRefund']:checked").val();
								$("#virtualIndateConf").val(virtualIndate);
								$("#virtualLimitConf").val(virtualLimit);
								$("#virtualInvalidRefundConf").val(virtualInvalidRefund);
								virtualIndate = virtualIndate === "" ? "永久有效" : virtualIndate + "天";
								virtualLimit = virtualLimit === "" ? "无上限" : virtualLimit + "份";
								virtualInvalidRefund = $("input:radio[name='virtualInvalidRefund']:checked").val() === "1" ? "是" : "否";
								$("#isVirtualTip").html("商品有效期："+virtualIndate+"；购买上限："+virtualLimit+"；过期退款：" + virtualInvalidRefund);
						   }
						 }
					   }
					});
		    }else{
		    	$("#virtualIndateConf").val("");
				$("#virtualLimitConf").val("");
				$("#virtualInvalidRefundConf").val("");
		    	$("#isVirtualTip").html("");
		    }
		});
		
		//是否预定商品操作
		$("input:radio[name='isBook']").change(function (){
			var isVirtual = $(this).val();
			if(isVirtual == 1){
				var mess = '<div style="height: 40px"><label class="control-label col-sm-3" style="line-height: 20px;">定金金额:</label><input type="text" id="bookDownPayment" class="col-xs-12 col-sm-4"></div>';
					mess = mess + '<div style="height: 40px"><label class="control-label col-sm-3" style="line-height: 20px;">尾款金额:</label><input type="text" id="bookFinalPayment" class="col-xs-12 col-sm-4"></div>';
					mess = mess + '<div style="height: 40px"><label class="control-label col-sm-3" style="line-height: 20px;">预定人数:</label><input type="text" id="bookBuyers" class="col-xs-12 col-sm-4"></div>';
					mess = mess + '<label class="control-label col-sm-3" style="line-height: 32px;">预定结束时间:</label><input placeholder="请输入预定结束日期" id="bookDownTime" class="laydate-icon col-xs-12 col-sm-6" onclick="laydate({istime: true, format: '+"'YYYY-MM-DD hh:mm:ss'"+',festival: true})">';
					bootbox.dialog({
					message: mess,
					title: "预定商品选项",
					onEscape: function() {
						$("input:radio[name='isBook'][value=0]").prop('checked',true);
						$("#bookDownPaymentConf").val("");
						$("#bookFinalPaymentConf").val("");
						$("#bookDownTimeConf").val("");
						$("#bookBuyersConf").val("");
					},
					buttons: {
						success: {
							label: "确定",
							callback: function() {
								var priceReg=/^([1-9][\d]{0,7}|0)(\.[\d]{1,2})?$/;
								var intReg=/^(0|([1-9]\d*))$/;
								var bookDownPayment = $("#bookDownPayment").val();
								var bookFinalPayment = $("#bookFinalPayment").val();
								var bookBuyers = $("#bookBuyers").val();
								var bookDownTime = $("#bookDownTime").val();
								if(bookDownPayment===""){
									tip('定金金额不能为空', '#bookDownPayment');
									return false;
							    }
								if(priceReg.test(bookDownPayment)==false){
									tip('定金金额格式错误', '#bookDownPayment');
									return false;
							    }
								if(bookFinalPayment===""){
									tip('尾款金额不能为空', '#bookFinalPayment');
									return false;
							    }
								if(priceReg.test(bookFinalPayment)==false){
									tip('尾款金额格式错误', '#bookFinalPayment');
									return false;
							    }
								if(bookBuyers===""){
									tip('预定人数不能为空', '#bookBuyers');
									return false;
							    }
								if(intReg.test(bookBuyers)==false){
									tip('预定人数格式错误', '#bookBuyers');
									return false;
							    }
								if(bookDownTime===""){
									tip('预定结束时间不能为空', '#bookDownTime');
									return false;
							    }
								$("#bookDownPaymentConf").val(bookDownPayment);
								$("#bookFinalPaymentConf").val(bookFinalPayment);
								$("#bookDownTimeConf").val(bookDownTime);
								$("#bookBuyersConf").val(bookBuyers);
							   $("#isBookTip").html("定金金额："+bookDownPayment+"；尾款金额："+bookFinalPayment+"；预定人数：" + bookBuyers+"；预定结束时间："+bookDownTime);
						   }
						 }
					   }
					});
		    }else{
		    	$("#bookDownPayment").val("");
				$("#bookFinalPayment").val("");
				$("#bookBuyers").val("");
				$("#bookDownTime").val("");
		    	$("#isBookTip").html("");
		    }
		});
		
		//是否预约商品操作
		$("input:radio[name='isAppoint']").change(function (){
			var isAppoint = $(this).val();
			if(isAppoint == 1){
				var mess = '<label class="control-label col-sm-2" style="line-height: 32px;">预约时间:</label><input placeholder="请输入预约日期" id="isAppointDate" class="laydate-icon col-xs-12 col-sm-6" onclick="laydate({istime: true, format: '+"'YYYY-MM-DD hh:mm:ss'"+',festival: true})">';
				bootbox.dialog({
					message: mess,
					title: "预约商品选项",
					onEscape: function() {
						$("input:radio[name='isAppoint'][value=0]").prop('checked',true);
						$("#appointSatedateConf").val("");
					},
					buttons: {
						success: {
							label: "确定",
							callback: function() {
								 var appointDate = $("#isAppointDate").val();
								 if(appointDate === ""){
									 tip('预约时间不能为空', '#isAppointDate');
									 return false;
								 }
								 $("#appointSatedateConf").val(appointDate);
								 $("#isAppointTip").html("商品预约时间："+appointDate);
							   }
						   }
						 }
					});
		    }else{
		    	$("#appointSatedateConf").val("");
		    	$("#isAppointTip").html("");
		    }
		});
		
		var $validation = false;
		var formData;
		$('#fuelux-wizard').ace_wizard().on('change' , function(e, info){
			if(info.step == 1 && $validation) {
				if(!$('#base-form').valid()) 
				{
					layer.msg('表单验证失败!',function(){});
					return false;
				}
				var checkText1 = $("#cateId1").find("option:selected").text();
				var checkText2 = $("#cateId2").find("option:selected").text();
				var checkText3 = $("#cateId3").find("option:selected").text();
				var checkText = checkText1 + "|" + checkText2 + "|" + checkText3;
				$("#gcName").val(checkText);
				
//				if($("#goodsImage").val()==""){
//					layer.msg('请添加商品主图!',function(){});
//					return false;
//				}
				
				var leastGoodsAttrValue = false;
				var goodsAttrNameAll = "";
				var goodsAttrValueAll = "";
				//特殊字符过滤
				var pattern = new RegExp("[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]")
				$(".goodsAttrDiv") .each(function(index){
					 var currentAttrValue = "";
					 $(this).find("input[name='goodsAttrNameValue']").each(function(index){
						 var value = $(this).val();
						 if($.trim(value)!=""){
							 if(pattern.test(value)){
								 tipButtom("非法字符",this)
								 leastGoodsAttrValue = true;
							 }
							 currentAttrValue = currentAttrValue + value + ",";
						 }
					 });
					 var name = $(this).find("input[name='goodsAttrName']").val();
					 if($.trim(name)!="" && !leastGoodsAttrValue){
						 if(pattern.test(name)){
							 tipButtom("非法字符",$(this).find("input[name='goodsAttrName']"));
							 leastGoodsAttrValue = true;
						 }
					 }
					 if($.trim(name)!="" && !currentAttrValue && !leastGoodsAttrValue)
					 {
						tipButtom("至少填写一项属性值",$(this).find("input[name='goodsAttrNameValue']:first"))
						leastGoodsAttrValue = true;
					 }
					 if($.trim(currentAttrValue)!="" && $.trim(name)=="" && !leastGoodsAttrValue){
					 	tipButtom("请填写属性名",$(this).find("input[name='goodsAttrName']"))
						leastGoodsAttrValue = true;
					 }
					 goodsAttrNameAll = goodsAttrNameAll + name + "|";
					 currentAttrValue = currentAttrValue.substring(0,currentAttrValue.length-1);
					 goodsAttrValueAll = goodsAttrValueAll + currentAttrValue + "|";
				});
				//属性判断
				if(leastGoodsAttrValue)
					return false;
				goodsAttrNameAll = goodsAttrNameAll.substring(0,goodsAttrNameAll.length-1);
				goodsAttrValueAll = goodsAttrValueAll.substring(0,goodsAttrValueAll.length-1);
				
				$("#attrName").val(goodsAttrNameAll);
				$("#attrValue").val(goodsAttrValueAll);
				
				var goods_id = $("#goods_id").val();
				var cont = true;
				if(!goods_id){
					//新增提交
					$.ajax({
						type: "POST",
						url:"/admin/goods/addBaseAction",
						data:$('#base-form').serialize(),
						async:false,
						dataType:"json",
						success: function(data){
						  if(data.code == 1){
							  $("#goods_id").val(data.goodsId);
							  cont = false;
						  }else{
							  layer.msg('商品基本信息添加失败!',function(){});
						  }
						},error:function(){
						   layer.msg('系统错误',function(){});
					    }
				   });
				   if(cont)
					   return false;
				}else{
					//修改提交
					if (formData ===  $('#base-form').serialize())
					{
						alert("无修改")
					}else{
						alert("修改过了")
					}
				}
			}
			
			//表示第一步的下一步
			if(info.step == 1 && info.direction == "next") {
				//移除所有已加载属性项
				$(".combine-data-name").html("");
				var attrName = $("#attrName").val();
				var attrValue = $("#attrValue").val();
				//循环遍历出属性名称与属性值
				if(attrName && attrValue){
					$.each(attrName.split('|'),function(index_name,name){
						var html = '<div class="combine-data-attrname"><label class="control-label col-xs-12 col-sm-2">'+name+':</label>';
							html = html + '<div class="col-xs-12 col-sm-10">';
						$.each(attrValue.split('|'),function(index_value,value){
							if(index_value == index_name){
								$.each(value.split(','),function(index_value_sub,value_sub){
									html = html + '<label class="attrLabel">';
									html = html + '<input type="checkbox" name="checkbox-attr'+index_name+'" value="'+value_sub+'" onclick="checkAttrValue()" class="ace">';
									html = html + '<span class="lbl">'+value_sub+'</span></label>';
								});
							}
						});
						html = html + "</div></div><hr>";
						$(".combine-data-name").append(html);
					});
				}
			}
			
			//表示第二步的上一步
			if(info.step == 2 && info.direction == "previous") {
				if(!formData)
					formData = $('#base-form').serialize();
			}
			
			//表示第二步的下一步
			if(info.step == 2 && info.direction == "next") {
				//格式校验
				var checklen = 0;
				var current_valid = true;
				$(".combine-data-attrname").each(function(i){
					if($('input[name="checkbox-attr'+i+'"]:checked').length > 0){
						checklen = checklen + 1;
					};
				});
				if(checklen > 0){
					$('input[name="goodsAttrCostprice"]').each(function(){
						var currentVal = $(this).val();
						if($.trim(currentVal) == "" || !priceReg.test(currentVal)){
							tipButtom("空值或格式错误",$(this));
							current_valid = false;
						}
					});
					$('input[name="goodsAttrToprice"]').each(function(){
						var currentVal = $(this).val();
						if($.trim(currentVal) == "" || !priceReg.test(currentVal)){
							tipButtom("空值或格式错误",$(this));
							current_valid = false;
						}
					});
					$('input[name="goodsAttrStock"]').each(function(){
						var currentVal = $(this).val();
						if($.trim(currentVal) == "" || !intReg.test(currentVal)){
							tipButtom("空值或格式错误",$(this));
							current_valid = false;
						}
					});
					
					if(!current_valid)
						return false;
					
					var attrCond = true;
					//新增提交
					$.ajax({
						type: "POST",
						url:"/admin/goods/addAttrAction",
						data:$('#attr-form').serialize(),
						async:false,
						dataType:"json",
						success: function(data){
						  if(data.code == 1){
							  attrCond = false;
						  }else{
							  layer.msg('商品属性信息添加失败!',function(){});
						  }
						},error:function(){
						   layer.msg('系统错误',function(){});
					    }
				   });
				   if(attrCond)
					   return false;
				}
			}
			
			if(info.step == 3) {
				
			}
		}).on('finished', function(e) {
			
		}).on('stepclick', function(e){
		});
		
		$('#base-form').validate({
			errorElement: 'div',
			errorClass: 'help-block',
			focusInvalid: false,
			rules: {
				cateId3: {
					required: true,
					maxlength:25
				},
				goodsName: {
					required: true,
					maxlength: 50
				},
				goodsStorageAlarm: {
					required: true,
					digits:true,
					max:99
				},
				goodsPrice: {
					required: true,
					number:true
				},
				goodsMarketPrice: {
					required: true,
					number:true
				},
				goodsCostPrice: {
					required: true,
					number:true
				}
			},
			messages: {
				cateId3: {
					required: "请选择商品类别!"
				},
				goodsName: {
					required: "商品名称不能为空!",
					maxlength: "超过最大25个字符数"
				},
				goodsStorageAlarm: {
					required: "库存报警数不能为空!",
					digits:"格式不正确",
					max:"最大不超过99"
				},
				goodsPrice: {
					required: "商品价格不能为空!",
					number:"格式不正确"
				},
				goodsMarketPrice: {
					required: "市场价不能为空!",
					number:"格式不正确"
				},
				goodsCostPrice: {
					required: "成本价不能为空!",
					number:"格式不正确"
				}
			},
			invalidHandler: function (event, validator) {
				$('.alert-danger', $('.login-form')).show();
			},
			highlight: function (e) {
				$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
			},
			success: function (e) {
				$(e).closest('.form-group').removeClass('has-error').addClass('has-info');
				$(e).remove();
			},
			errorPlacement: function (error, element) {
				if(element.is(':checkbox') || element.is(':radio')) {
					var controls = element.closest('div[class*="col-"]');
					if(controls.find(':checkbox,:radio').length > 1) controls.append(error);
					else error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
				}
				else if(element.is('.select2')) {
					error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
				}
				else if(element.is('.chosen-select')) {
					error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
				}
				else error.insertAfter(element.parent());
			},
			submitHandler: function (form) {
			},
			invalidHandler: function (form) {
			}
		});
	
		$('#modal-wizard .modal-header').ace_wizard();
		$('#modal-wizard .wizard-actions .btn[data-dismiss=modal]').removeAttr('disabled');
	})

function addGoodsAttr()
{
	var html = '<div class="goodsAttrDiv" style="width: 100%">';
		html = html + '<div class="goodsAttrDivName" style="width: 20%;float: left;">';
		html = html + '<button type="button" class="btn spinner-up btn-xs btn-success" onclick="removeGoodsAttr(this)" style="height: 28px;float: left;"><i class="icon-remove"></i></button>';
		html = html + '<input type="text" name="goodsAttrName" class="col-xs-8"/></div>';
		html = html + '<div class="goodsAttrDivValue" style="width: 80%;float: right;line-height: 30px;">';
		html = html + '<div class="GoodsAttrValueCount">';
		html = html + '	<input type="text" name="goodsAttrNameValue" class="col-sm-2 goodsAttrValue"/>';
		html = html + '	<button type="button" onclick="removeGoodsAttrValue(this)" class="btn btn-xs" style="height: 28px;float: left;"><i class="icon-remove"></i></button></div>';
		html = html + '<div class="ace-spinner touch-spinner addGoodsAttrValueBtn" style="width: 30px;">';
		html = html + '    <div class="spinner-buttons input-group-btn">';
		html = html + '    	<button type="button" class="btn spinner-up btn-xs btn-success" onclick="addGoodsAttrValue(this)" style="height: 28px;">';
		html = html + '    		<i class="icon-plus smaller-75"></i>';
		html = html + '    	</button></div></div></div></div><hr>';
	$("#goodsAttrFormGroup").append(html);
}
function removeGoodsAttr(obj)
{
	//删除所有换行
	$(obj).parents('#goodsAttrFormGroup').find('hr').remove();
	$(obj).parents('.goodsAttrDiv').remove();
	$('#goodsAttrFormGroup').find(".goodsAttrDiv").each(function(index){
		    	 $(this).after("<hr>");
	  });
}
function addGoodsAttrValue(obj)
{
	var len = $(obj).parents('.goodsAttrDivValue').find(".GoodsAttrValueCount").length;
	var html = '<div class="GoodsAttrValueCount"><input type="text" name="goodsAttrNameValue" class="col-sm-2 goodsAttrValue"/>';
		html = html + '<button type="button" onclick="removeGoodsAttrValue(this)" class="btn spinner-up btn-xs" style="height: 28px;float: left;"><i class="icon-remove"></i></button></div>';
	if(len % 4 == 0)
		$(obj).parents('.addGoodsAttrValueBtn').before("<br>")
	$(obj).parents('.addGoodsAttrValueBtn').before(html);
}
function removeGoodsAttrValue(obj)
{
	var len = $(obj).parents('.goodsAttrDivValue').find(".GoodsAttrValueCount").length;
	if(len == 1){
		layer.msg('当前属性至少需要一项属性值',function(){});
		return;
	}
	//删除所有换行
	$(obj).parents('.goodsAttrDivValue').find('br').remove();
	var currentObj = $(obj).parents('.goodsAttrDivValue');
	//删除当前元素
	$(obj).parent().remove();
	//重新遍历换行
	$(currentObj).find(".GoodsAttrValueCount").each(function(index){
	     if(index != 0 && index % 4 == 0)
	    	 $(this).before("<br>");
	  });
}