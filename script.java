// typing effect

var text="This website is made only for you ❤️";
var i=0;

function typing(){
if(i<text.length){
document.getElementById("typing").innerHTML+=text.charAt(i);
i++;
setTimeout(typing,80);
}
}

typing();


// slideshow

var slideIndex=0;

function showSlides(){

var slides=document.getElementsByClassName("slide");

for(var i=0;i<slides.length;i++){
slides[i].style.display="none";
}

slideIndex++;

if(slideIndex>slides.length){
slideIndex=1;
}

slides[slideIndex-1].style.display="block";

setTimeout(showSlides,2000);
}

showSlides();
