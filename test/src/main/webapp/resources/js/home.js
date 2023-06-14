var dataArr=[]

$(document).ready(function() {
	// 전체 선택 / 해제
	  $("#mcode").click(function(){
	    if($("#mcode").is(":checked")){
	      $("input[name=mcode]").prop("checked", true);
	    }else {
	      $("input[name=mcode]").prop("checked", false);
	    }
	  });
	  
	  /*$("input[name=mcode]").click(function(){
	    var totalArr = $("input[name=mcode]").length;
	    var checked = $("input[name=mcode]:checked").length;
	    
	    if(totalArr != ckecked){
	      $("#mcode").prop("checked", false);
	    }else{
	      $("#mcode").prop("checked", true);
	    }
	  });
	*/
	  // 버튼 클릭 이벤트 처리
	  $("#enroll").click(function() {
		  $('input:checkbox[name=merchNameCode]').each(function (index) {
				if($(this).is(":checked")==true){
					var data= new Object();
					data.code=$(this).val();
					
					dataArr.push(data);
			    }
		});
		
		  console.log(dataArr); 
		  
		  $('form[name="checkForm"]').serialize();
		  $('form[name="checkForm"]').attr('method', 'POST');
		  $('form[name="checkForm"]').attr('action', '/selectMemCode');
		  $('form[name="checkForm"]').submit();
	  });
	  
});
