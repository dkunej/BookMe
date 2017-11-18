function validate(){
	var counter = 0;
	if(destination() == false)
	{
		counter++;
	}
	else if(checkIn() == false)
	{
		counter++;
	}
	else if(checkOut() == false)
	{
		counter++;
	}
	else if(numberAdults() == false)
	{
		counter++;
	}
	else if(numberChildren() == false)
	{
		counter++;
	}

	

	
	if(counter == 0)
	{
		return true;
	}
	else
	{
		return false;
	}

		
}

function destination()
{
	var x = document.forms["booking_form"]["destination"].value;
	if(x == null || x == "" || !alphabetic(x)) 
	{
		document.getElementById("error_destination").style.display = "inline";
		document.forms["booking_form"]["destination"].style.border = "3px solid red";
		document.forms["booking_form"]["destination"].style.backgroundColor = "rgba(206, 22, 22, 0.36)";
		
		return false;
	}	
}

function checkIn()
{
	var x = document.forms["booking_form"]["checkIn"].value;
	if(x == null || x == "" || !date(x))
	{
		document.getElementById("error_checkIn").style.display = "inline";
		document.forms["booking_form"]["checkIn"].style.border = "3px solid red";
		document.forms["booking_form"]["checkIn"].style.backgroundColor = "rgba(206, 22, 22, 0.36)";
		
		return false;
	}	
}

function checkOut()
{
	var x = document.forms["booking_form"]["checkOut"].value;
	if(x == null || x == "" || !date(x))
	{
		document.getElementById("error_checkOut").style.display = "inline";
		document.forms["booking_form"]["checkOut"].style.border = "3px solid red";
		document.forms["booking_form"]["checkOut"].style.backgroundColor = "rgba(206, 22, 22, 0.36)";
		
		return false;
	}	
}

function numberAdults()
{
	var x = document.forms["booking_form"]["phoneNum"].value;
	if(x == null || x == "" || !phoneNum(x)) 
	{
		document.getElementById("error_Adults").style.display = "inline";
		document.forms["booking_form"]["Anumber"].style.border = "3px solid red";
		document.forms["booking_form"]["Anumber"].style.backgroundColor = "rgba(206, 22, 22, 0.36)";
		
		return false;
	}	
}

function numberChildren()
{
	var x = document.forms["booking_form"]["Cnumber"].value;
	if(x == null || x == "" || !alphabetic(x)) 
	{
		document.getElementById("error_children").style.display = "inline";
		document.forms["booking_form"]["Cnumber"].style.border = "3px solid red";
		document.forms["booking_form"]["Cnumber"].style.backgroundColor = "rgba(206, 22, 22, 0.36)";
		
		return false;
	}	
}



function alphabetic(value) {
	var reg = /^[A-Za-z ]+$/;
	return value.match(reg);
}

function date(dateString)
{
    if(!/^\d{1,2}\/\d{1,2}\/\d{4}$/.test(dateString))
        return false;

    var parts = dateString.split("/");
    var day = parseInt(parts[1], 10);
    var month = parseInt(parts[0], 10);
    var year = parseInt(parts[2], 10);

    if(year < 1000 || year > 3000 || month == 0 || month > 12)
        return false;

    var monthLength = [ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];

    if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
        monthLength[1] = 29;

    return day > 0 && day <= monthLength[month - 1];
}


