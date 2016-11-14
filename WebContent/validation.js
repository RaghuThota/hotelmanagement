function validateform()
{
	
	if(isHotelName() && isAddress() && isPhone()  && isNumber2() &&  isEmail())
	{
		
		document.getElementById("add").submit;
		return true;
	}
	else
	{
		return false;
	}
	
}

function valaddroom()
{
	if(isNumber() && isNumber2() && isPhoto())
	{
		document.getElementById("addroom").submit;
		return true;
	}
	else
	{
	
	return false;
	}
	
	
}



function valmodifyhotel()
{
	
	if(isHotelName() && isAddress() && isPhone() && isNumber2() && isEmail())
	{
		document.getElementById("modifyhotel").submit;
		return true;
	}
	else
	{
	return false;
	}
	
}

function valmodroom(){
	if(isNumber() && isNumber2()){
		document.getElementById("modroom").submit;
		return true;
	}
	else
	{
		return false;
	}
	
}


function isPhoto()
{
var name=document.getElementById("photo").value;


 if(name=="")
{
document.getElementById("photoErr2").innerHTML="please upload photo";
document.getElementById("photoErr2").style.color="red";
return false;
}
 else
 {
 document.getElementById("photoErr2").innerHTML="";
 return true;
 }
 }


function isName()
{
var name=document.getElementById("employname").value;
var patt=/^[a-z]([a-z\s])*$/i;

 if(name=="")
{
document.getElementById("nameErr").innerHTML="Name should not be null";
document.getElementById("nameErr").style.color="red";
return false;
}
else if(!patt.test(name))
{
document.getElementById("nameErr").innerHTML="Enter only alphabets";
document.getElementById("nameErr").style.color="red";
return false;
}
else
{
document.getElementById("nameErr").innerHTML="";
return true;
}
}


function isPassword()
{
var name=document.getElementById("password").value;


 if(name=="")
{
document.getElementById("passwordErr").innerHTML="password should minimum 6 digits";
document.getElementById("passwordErr").style.color="red";
return false;
}
 else
 {
 document.getElementById("passwordErr").innerHTML="";
 return true;
 }
 }


function isLoginPassword()
{
var name=document.getElementById("lpassword").value;


 if(name=="")
{
document.getElementById("lpasswordErr").innerHTML="please enter password";
document.getElementById("lpasswordErr").style.color="red";
return false;
}
 else
 {
 document.getElementById("lpasswordErr").innerHTML="";
 return true;
 }
 }

function isEmail()
{
var name=document.getElementById("email").value;


 if(name=="")
{
document.getElementById("emailErr").innerHTML="e-mail should be abc@def.xyz formatt";
document.getElementById("emailErr").style.color="red";
return false;
}
 else
 {
 document.getElementById("emailErr").innerHTML="";
 return true;
 }
 }




function isAddress()
{
var name=document.getElementById("address").value;


 if(name=="")
{
document.getElementById("addressErr").innerHTML="address is required field";
document.getElementById("addressErr").style.color="red";
return false;
}
 else
 {
 document.getElementById("addressErr").innerHTML="";
 return true;
 }
 }

function isPhone()
{
var name = document.getElementById("phone").value;
var patt=/^[0-9]*$/;
if(name=="")
{
	document.getElementById("phoneErr").innerHTML="Enter the valid Mobile Number";
	document.getElementById("phoneErr").style.color="red";
return false;
}
else if(!patt.test(name)){
	document.getElementById("phoneErr").innerHTML="Enter only digits";
	document.getElementById("phoneErr").style.color="red";
	return false;
	
}

else
{
	document.getElementById("phoneErr").innerHTML="";

return true;
}
}




function isHotelName()
{
var name=document.getElementById("hotelname").value;
var patt=/^[a-z]([a-z\s])*$/i;

 if(name=="")
{
document.getElementById("hotelnameErr").innerHTML="Please enter hotel name";
document.getElementById("hotelnameErr").style.color="red";
return false;
}
else if(!patt.test(name))
{
document.getElementById("hotelnameErr").innerHTML="Enter only alphabets";
document.getElementById("hotelnameErr").style.color="red";
return false;
}
else
{
document.getElementById("hotelnameErr").innerHTML="";
return true;
}
}


function isNumber()
{
var number=document.getElementById("rate").value;
var patt=/^[0-9]*$/;

 if(number=="")
{
document.getElementById("rateErr").innerHTML="Number should not be null";
document.getElementById("rateErr").style.color="red";
return false;
}
else if(!patt.test(number))
{
document.getElementById("rateErr").innerHTML="Enter only digits";
document.getElementById("rateErr").style.color="red";
return false;
}
else
{
document.getElementById("rateErr").innerHTML="";
return true;
}
}

function isNumber2()
{
var number=document.getElementById("rate2").value;
var patt=/^[0-9]*$/;

 if(number=="")
{
document.getElementById("rateErr2").innerHTML=" avg_per_night should not be null";
document.getElementById("rateErr2").style.color="red";
return false;
}
else if(!patt.test(number))
{
document.getElementById("rateErr2").innerHTML="Enter only digits";
document.getElementById("rateErr2").style.color="red";
return false;
}
else
{
document.getElementById("rateErr2").innerHTML="";
return true;
}
}

function isUserid()
{
var number=document.getElementById("userid").value;
var patt=/^[0-9]*$/;

 if(number=="")
{
document.getElementById("useridErr").innerHTML="userid should not be null";
document.getElementById("useridErr").style.color="red";
return false;
}
 else if(!patt.test(number)){
	 document.getElementById("useridErr").innerHTML="Enter only digits";
	 document.getElementById("useridErr").style.color="red";
	 return false;
 }
 
 
 
else
{
document.getElementById("useridErr").innerHTML="";
return true;
}
}







function isValidSal()
{
var number=document.getElementById("empsal").value;
var patt=/^[0-9]*$/;

 if(number=="")
{
document.getElementById("SalErr").innerHTML="Salary should not be null";
document.getElementById("SalErr").style.color="red";
return false;
}
else if(!patt.test(number))
{
document.getElementById("SalErr").innerHTML="Enter only digits";
document.getElementById("SalErr").style.color="red";
return false;
}
else
{
document.getElementById("SalErr").innerHTML="";
return true;
}
}

// function checkdate1()
// {
// var dateString = document.getElementById("Date1").value;
// var arr=dateString.split("/");
// var myDate=new Date(arr[2],arr[1]-1,arr[0],0,0,0);
// var today = new Date();
// //window.alert(today);
//     if (myDate<=today)
//    	 {
//    	
//    	 document.getElementById("dateErr1").innerHTML=" From Date should not be past date";
//    	 
//    	 document.getElementById("dateErr1").style.color="red";
//    	 return false;
//    	 }
//    	 
//    	 else
//    	 {
//    		 document.getElementById("dateErr1").innerHTML="";
//    	 return true;
//         }
// 
// }

 
 function checkdate1()
 {
 var dateString = document.getElementById("Date1").value;
 var arr=dateString.split("/");
 //alert(arr[0]);
 //alert(arr[1]);
 //alert(arr[2]);
 var myDate=new Date(arr[2],arr[0]-1,arr[1],0,0,0);
 var today = new Date();

 var milli_d1 = today.getTime();
 var milli_d2 = myDate.getTime();
 var diff = milli_d1 - milli_d2;
 var num_days = (((diff / 1000) / 60) / 60) / 24;

 //alert(num_days);



   //alert(today);
    //alert(myDate);
     if (num_days>1)
    	 {
    	
    	 document.getElementById("dateErr1").innerHTML=" From Date should not be past date";
    	 
    	 document.getElementById("dateErr1").style.color="red";
    	 return false;
    	 }
    	 
    	 else 
    	 {
    		 document.getElementById("dateErr1").innerHTML="";
    	 return true;
         }

 }
 
 
 
 
 
 
 
 
 

// function checkdate2()
// {
// var dateString = document.getElementById("Date2").value;
// var arr=dateString.split("/");
// var myDate=new Date(arr[2],arr[1]-1,arr[0],0,0,0);
// var today = new Date();
// //window.alert(today);
//     if (myDate<=today)
//    	 {
//    	
//    	 document.getElementById("dateErr2").innerHTML=" From Date should not be past date";
//    	 
//    	 document.getElementById("dateErr2").style.color="red";
//    	 return false;
//    	 }
//    	 
//    	 else
//    	 {
//    		 document.getElementById("dateErr2").innerHTML="";
//    	 return true;
//         }
// 
// }
// 
 
 
 
 function checkdate2()
 {
 var dateString = document.getElementById("Date2").value;
 var arr=dateString.split("/");
 var myDate=new Date(arr[2],arr[0]-1,arr[1],0,0,0);
 var today = new Date();
 //window.alert(today);

 var milli_d1 = today.getTime();
 var milli_d2 = myDate.getTime();
 var diff = milli_d1 - milli_d2;
 var num_days = (((diff / 1000) / 60) / 60) / 24;

     if (num_days>1)
    	 {
    	
    	 document.getElementById("dateErr2").innerHTML=" To Date should not be past date";
    	 
    	 document.getElementById("dateErr2").style.color="red";
    	 return false;
    	 }
    	 
    	 else
    	 {
    		 document.getElementById("dateErr2").innerHTML="";
    	 return true;
         }

 }

 
 
 
 
 
 
 
 
 
 function finalValidation()
 {
	var date1=document.getElementById("Date1").value;
	var date2=document.getElementById("Date2").value;
	
	
	if(date1==""){
		document.getElementById("dateErr1").innerHTML="enter from date";
		return false;
		}
	if(date2==""){
		document.getElementById("dateErr2").innerHTML="enter TO date";
		return false;
		}
	if(checkdate1() && checkdate2() && checkdate()){
	return true;
	}
	else {
		return false;
	}
}




function checkdate()
{
	var dateString1 = document.getElementById("Date1").value;
	var arr=dateString1.split("/");
	var myDate1=new Date(arr[2],arr[0]-1,arr[1],0,0,0);

	var dateString2 = document.getElementById("Date2").value;
	var arr=dateString2.split("/");
	var myDate2=new Date(arr[2],arr[0]-1,arr[1],0,0,0);
   //alert(myDate1);
  //alert(myDate2);
   if(myDate1 > myDate2)
    {
       alert("FROM date should be less than TO date, please enter again");
       return false; 
    }
    else {
    	return true;
    }

}


 

