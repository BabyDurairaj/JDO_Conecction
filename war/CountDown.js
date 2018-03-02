
window.onload=function()
{
	console.log("hai");
	var ms = 0;
	var hrs= 0;
	var min= 0;
	var sec= 0;
	var calhrs=document.getElementById("hrs");
	var calMin=document.getElementById("min");
	var calSec=document.getElementById("sec");
    var button=document.getElementById("button");
    var start = true;
   
    var Interval;
    button.onclick = function()
    {
    	if(start)
    		{
    	ms = hrs =sec=0;
    	calhrs.innerHTML=calMin.innerHTML=calSec.innerHTML="00";
    	clearInterval(Interval);
    	Interval=setInterval(startTimer,10);
    	start=false;
    		}
    	else
    		{

    	clearInterval(Interval);
    	start=true;
    		}
    	
    }
    function startTimer()
    {
    	console.log("hii");
    	ms++;
    	if(ms > 99) {
    		sec++;
    		ms = 0;
    	}
    	if(sec<9)
    		{
    		calSec.innerHTML="0"+sec;
    		}
    	if(sec>9)
    		{
    		calSec.innerHTML=sec;
    		}
    	if(sec>59)
    		{
    		sec=0;
    		calSec.innerHTML="00";
    		min++;
    		calMin.innerHTML="0"+min;
    		
    		
    		}
    	if(min<9)
    		{
    		calMin.innerHTML="0"+min;
    		}
    	if(min>9)
    		{
    		calMin.innerHTML=min;
    		}
    	if(min>59)
    		{
    		min=0;
    		calMin.innerHTML="00";
    		hrs++;
    		calhrs.innerHTML="0"+min;
    		}
    	if(hrs<9)
    		{
    		calhrs.innerHTML="0"+hrs;
    		}
    	if(hrs>9)
    		{
    		calhrs.innerHTML=hrs;
    		}
    	
    }

};