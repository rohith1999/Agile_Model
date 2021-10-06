const car1 = {type:"car",model:"100"};

document.write(JSON.stringify(car1));

document.write("<br>");
document.write(Number(false));

var url="/src/main/webapp/index1.html";
var encUrl = encodeURIComponent(url);
document.write(encUrl);
document.write("<br>");
document.write(decodeURIComponent(encUrl));

mystr1 = new String("Click here to go attendace sheet ");
document.write(mystr1.link("https://docs.google.com")+"<br>");

var str="my string name is rohith";
document.write(str.big()+"<br>");
document.write(str.bold()+"<br>");
document.write(str.charAt(0)+"<br>");
document.write(str.charCodeAt(0)+"<br>");


 ms="welcome to java script world";
splitms  = ms.split(" ");
for(i in splitms){
document.write(splitms[i]+"<br>");
}
document.write(str.slice(7,13)+"<br>");
document.write(ms.slice(-12,-6)+"<br>");

//2nd parameter specifies the length of substring
document.write(ms.substr(12,6)+"<br>");
document.write(ms.replace("welcome to"
,"Hello")+"<br>");

document.write(ms.toUpperCase(ms)+"<br>");
document.write(ms.toLowerCase(ms)+"<br>");








