// JavaScript Document
$( function(){
      
      var _top=($(window).height()-$(".centent").height())/2-$(".header").height();
	  $(".header").css({top:_top});
	 
	  
})

 
 
$( function(){
      
      var _top=($(window).height()-$(".centent").height())/2;
	  $(".centent").css({top:_top});
	
})

 
//ʹ������н���
$( function(){
      
      var _top=($(window).height()-$(".centent").height())/2+$(".centent").height();
	  $(".footer").css({top:_top});
})
	  

 