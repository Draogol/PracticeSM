//var ClickOnBut = document.getElementById('submitID');
function testF(Num, Name, Pass){
	'use strict';
	$('.newIndex').html(Num);
	$('.newName').html(Name);
	$('.newNum').html(Pass);
}
async function StartMes(){
	'use strict';
	//alert('Номер паспорта: ' + document.getElementById('PassportNumber').value + ' Имя: ' + document.getElementById('Name').value);
	if (document.getElementById('Name').value !== ""){
		if (document.getElementById('PassportNumber').value !== ""){
		    let response = await fetch('/add?name=' + document.getElementById('Name').value + '&passportNumber=' + document.getElementById('PassportNumber').value);
		    var json = await response.json()
		    console.log(json)
			for(let row of json) {
			    testF(row.id, row.name, row.passportNumber)
			}
			//alert(document.location.host + '/add?name=' + document.getElementById('Name').value + '&passportNumber=' + document.getElementById('PassportNumber').value);
		}
	}
}