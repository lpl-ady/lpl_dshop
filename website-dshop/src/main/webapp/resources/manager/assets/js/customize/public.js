var priceReg=/^([1-9][\d]{0,7}|0)(\.[\d]{1,2})?$/;
var intReg=/^(0|([1-9]\d*))$/;
function tipButtom(msg,obj)
{
	layer.tips(msg, obj, {
		  tips: [3, 'black'],
		  time: 800
	});	
}
function tip(msg,obj)
{
	layer.tips(msg, obj, {
		  tips: [2, 'black'],
		  time: 1800
	});	
}