//var ClickOnBut = document.getElementById('submitID');
function testF(Num, Name, Pass){
	'use strict';
	$('.newIndex').html(Num);
	$('.newName').html(Name);
	$('.newNum').html(Pass);
}
function StartMes(){
	'use strict';
	//alert('Номер паспорта: ' + document.getElementById('PassportNumber').value + ' Имя: ' + document.getElementById('Name').value);
	if (document.getElementById('Name').value !== ""){
		if (document.getElementById('PassportNumber').value !== ""){
			alert(document.location.host + '/add?name=' + document.getElementById('Name').value + '&passportNumber=' + document.getElementById('PassportNumber').value);
		}
	}
}