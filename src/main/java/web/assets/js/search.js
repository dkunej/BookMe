
window.writeValues = function(form) {
  var destination = form.destination.value;
  var stars = form.stars.value;
  var Anumber = form.Anumber.value;
  var Cnumber = form.Cnumber.value;
  var stars = form.stars.value;
  var checkIn = document.getElementById("checkIn").value;
  var checkOut = document.getElementById("checkOut").value;

  var select = document.getElementById("roomType");
  var roomType = select.options[select.selectedIndex].value;

    var msg2=[];
  for (var i=0;i< document.getElementsByName("checkbox").length;i++){
     if ( document.getElementsByName("checkbox")[i].checked) {
      msg2.push(document.getElementsByName("checkbox")[i].value);
      }
  }

  document.getElementById('output').innerHTML = "<b>Destination: </b>" + destination + ' </br><b>Check in: </b>' +checkIn + '      <b>Check out: </b>' +checkOut +
   '</br> <b>Hotel stars: </b>' + stars + ' </br> <b>Room Type:</b> ' + roomType + ' </br> <b>Adults: </b>' + Anumber + '      <b>Children: </b>'+ Cnumber + '</br> <b>Requirements: </b>' +msg2.toString();

   document.getElementById("bookingForm").reset();


   if (destination == 'Los Angeles' && stars ==3) {
       document.getElementById("image").innerHTML = "<img src='assets/img/LosAngeles.jpg'>";
       document.getElementById("info").innerHTML = "<a href='hotels.html/#LosAngeles'>Los Angeles...</a>";
   }
   if (destination == 'Los Angeles' && stars ==2) {
          document.getElementById("image").innerHTML = "<img src='assets/img/losAngeles2.jpg'>";
          document.getElementById("info").innerHTML = "<a href='hotels.html/#LosAngeles'>Los Angeles...</a>";
          document.getElementById("image").innerHTML = "<img src='assets/img/losAngeles3.jpg'>";
          document.getElementById("info").innerHTML = "<a href='hotels.html/#LosAngeles'>Los Angeles...</a>";
      }
   if (destination == 'New York') {
          document.getElementById("image").innerHTML = "<img src='assets/img/NewYork.jpg'>";
          document.getElementById("info").innerHTML = "<a href='hotels.html/#NewYork'>NewYork...</a>";
      }
   if (destination == 'Paris') {
             document.getElementById("image").innerHTML = "<img src='assets/img/Paris.jpg'>";
             document.getElementById("info").innerHTML = "<a href='hotels.html/#Paris'>Paris...</a>";
         }
}
