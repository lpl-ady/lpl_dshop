jQuery(function($) {
	//统一值修改
	$(".unite-update").change(function(){
		var attrId = $(this).attr("id");
		var attrValue = $(this).val();
		if(attrId === "attrCostprice"){
			if(!priceReg.test(attrValue)){
				tipButtom("格式不正确",$(this));
				return false;
			}
			$("input[name='goodsAttrCostprice']").each(function(){
				$(this).val(attrValue);
			});
		}else if(attrId === "attrToprice"){
			if(!priceReg.test(attrValue)){
				tipButtom("格式不正确",$(this));
				return false;
			}
			$("input[name='goodsAttrToprice']").each(function(){
				$(this).val(attrValue);
			});
		}else if(attrId === "attrStock"){
			if(!intReg.test(attrValue)){
				tipButtom("格式不正确",$(this));
				return false;
			}
			$("input[name='goodsAttrStock']").each(function(){
				$(this).val(attrValue);
			});
		}	
	});
});

var attrList = [];
var check_attr = [];
/**
 * 递归属性值
 * len表示递归次数
 * result表示结果组合
 * sum表示总长度
 */
function traverseAttr(len,result,sum){
	//每次从第一个有选择值的属性开始遍历
	$('input[name="'+check_attr[len-sum]+'"]:checked').each(function(){
		var value =  $(this).val();
		//递归中止条件
		if(len+1-sum < sum){
			traverseAttr(len+1,result + value + "-",sum);
		}else{
			attrList.push(result + value + "-");
		}
	});
}
//属性选择事件
function checkAttrValue()
{
	$(".combine-data-title").css("display","");
	$(".combine-data-allvalue").html("");
	attrList = [];
	check_attr = [];
	//遍历循环有属性值选择的属性ID
	$(".combine-data-attrname").each(function(i){
		if($('input[name="checkbox-attr'+i+'"]:checked').length > 0){
			check_attr.push("checkbox-attr"+i);
		};
	});
	var len = check_attr.length;
	if(len === 0)
		$(".combine-data-title").css("display","none");
	//递归属性值
	traverseAttr(len,"",len);
	$(attrList).each(function(i,v){
		//去掉最后"-"符号
		v = v.substring(0,v.length-1);
		var html = '<div class="combine-data-value">';
		html = html + '<span class="col-sm-5">'+v+'<input type="hidden" name="goodsAttrValue" value="'+v+'"/></span>';
		html = html + '<input type="text" name="goodsAttrCostprice" class="col-xs-12 col-sm-2"/>';
		html = html + '<input type="text" name="goodsAttrToprice" class="col-xs-12 col-sm-2"/>';
		html = html + '<input type="text" name="goodsAttrStock" class="col-xs-12 col-sm-2"/></div>';
		$(".combine-data-allvalue").append(html);
	});
}