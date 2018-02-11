// JavaScript Document
/*-------------------------------ʱ��-----------------------------------------------------------------*/
function time(){
		var date = new Date();			//��������
		document.getElementById("g-pclock").innerHTML=date.toLocaleString();//�����������?��toLocaleString()
		}
	setInterval("time()",1000);
	//toLocaleString() �����ɸ�ݱ���ʱ��� Date ����ת��Ϊ�ַ������ؽ��
/*------------------------------��߶����˵�----------------------------------------------------------------*/	
	
 $(function(){
    $("section#content nav  li").mouseover(function(){
	$(this).find(" .box").show();
	$(this).addClass("add");
	});
     $("section#content nav li").mouseout(function(){
	   $(this).find(".box").hide();
	   $(this).removeClass("add");
	 });
  
  })
/*-------------------------------ѡ�-----------------------------------------------*/

$(function(){

    $('#container-content-1 .container-content-li li').click(function(){
      
        var index = $(this).index();
        $('#container-content-1 .container-content-column #container-content-column').eq(index).show().siblings().hide();
    })
  
})
$(function(){

    $('#container-content-2 .container-content-li li').click(function(){
      
        var index = $(this).index();
        $('#container-content-2 .container-content-column #container-content-column').eq(index).show().siblings().hide();
    })
  
})
$(function(){

    $('#container-content-3 .container-content-li li').click(function(){
      
        var index = $(this).index();
        $('#container-content-3 .container-content-column #container-content-column').eq(index).show().siblings().hide();
    })
  
})
$(function(){

    $('#container-content-4 .container-content-li li').click(function(){
      
        var index = $(this).index();
        $('#container-content-4 .container-content-column #container-content-column').eq(index).show().siblings().hide();
    })
  
})
$(function(){

    $('#container-content-5 .container-content-li li').click(function(){
      
        var index = $(this).index();
        $('#container-content-5 .container-content-column #container-content-column').eq(index).show().siblings().hide();
    })
  
})

$(function(){

    $('#container-content-6 .container-content-li li').click(function(){
        var index = $(this).index();
        $('#container-content-6 .container-content-column #container-content-column').eq(index).show().siblings().hide();
    })
  
})

$(function(){

    $('#container-content-4 .container-content-li li').click(function(){
      
        var index = $(this).index();
        $('#container-content-4 .container-content-column #container-content-column').eq(index).show().siblings().hide();
    })
  
})


$(function(){
		  $(".container-content-column ul li a").each(function(){
								var b=$(this).text()
								
		  
})
	}) 


	

/*-------------------------------�������ѡ�-----------------------------------------------*/
$(function(){
	$(".container-fl ul li:first").addClass("on");
    $('.container-fl ul li').click(function(){
    	
    	$(this).addClass('on').siblings().removeClass('on');
        var index = $(this).index();
        $('.container-content').eq(index).show().siblings().hide();
    })
  
})
  /*--------------------------------��ҳ ���������޷�����-----------------------------------------------*/
 
 function marquee(i, direction){
	var obj = document.getElementById("marquee" + i);
	var obj1 = document.getElementById("marquee" + i + "_1");
	var obj2 = document.getElementById("marquee" + i + "_2");
	if (direction == "up"){
		if (obj2.offsetTop - obj.scrollTop <= 0){
			obj.scrollTop -= (obj1.offsetHeight + 20);
		}else{
			var tmp = obj.scrollTop;
			obj.scrollTop++;
			if (obj.scrollTop == tmp){
				obj.scrollTop = 1;
			}
		}
	}else{
		if (obj2.offsetWidth - obj.scrollLeft <= 0){
			obj.scrollLeft -= obj1.offsetWidth;
		}else{
			obj.scrollLeft++;
		}
	}
}

function marqueeStart(i, direction){
	var obj = document.getElementById("marquee" + i);
	var obj1 = document.getElementById("marquee" + i + "_1");
	var obj2 = document.getElementById("marquee" + i + "_2");

	obj2.innerHTML = obj1.innerHTML;
	var marqueeVar = window.setInterval("marquee("+ i +", '"+ direction +"')", 20);
	obj.onmouseover = function(){
		window.clearInterval(marqueeVar);
	}
	obj.onmouseout = function(){
		marqueeVar = window.setInterval("marquee("+ i +", '"+ direction +"')", 20);
	}
}



