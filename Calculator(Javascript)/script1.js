
var i=0;

setInterval(()=>{

    document.body.style.background="linear-gradient(135deg,RGB(38 232 199), blue "+i+"%, RGB(53 162 206))";
    document.body.style.backgroundRepeat="no-repeat";
    
     i++;
     
     
    if(i==200){
        
        i=0;      
               
    }
   
    
},50);