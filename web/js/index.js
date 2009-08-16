$(function(){
	$("#first, #second").change(function()
	{
		var input_str = $("#add_form").serialize();
		$.get("/AjaxApp/add", input_str, function(data, status) 
										{
											$("#result").val(data);
										});
	});
});
     
