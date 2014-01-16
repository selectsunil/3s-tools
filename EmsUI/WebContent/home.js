
//jQuery commands are loaded (do your magic)
	var userExpenceDailyList=[{"#":1,"Name":"Stalin","Price":400},{"#":2,"Name":"Sunil","Price":1500},{"#":3,"Name":"Akshy","Price":1400},{"#":4,"Name":"Amitabh","Price":1300}];
	var userExpenceMonthlyList=[{"#":1,"Name":"Stalin","Price":1500},{"#":2,"Name":"Sunil","Price":1600},{"#":3,"Name":"Akshy","Price":1400}];
	var messExpenceDailyList=[{"#":1,"Date":"1st Nov","Price":300},{"#":2,"Date":"2nd Nov","Price":400}];
	var messExpenceMonthlyList=[{"#":1,"Month":"Jan","Price":1500},{"#":2,"Month":"Feb","Price":3200},{"#":3,"Name":"Akshy","Price":1400}];



document.getElementById("col1").innerHTML = myPanel("User Expence:Daily",
		userExpenceDailyList,2,1);
document.getElementById("col2").innerHTML = myPanel("User Expence:Monthly",
		userExpenceMonthlyList,2,2);
document.getElementById("col3").innerHTML = myPanel("Mess Expence:Daily ",
		messExpenceDailyList,2,3);
document.getElementById("col4").innerHTML = myPanel("Mess Expence:Monthly",
		messExpenceMonthlyList,2,4);



//var Anchor = document.getElementById("dotRow1");
//Anchor.addEventListener("click", expandTable1, false);

//alert("hey");

function expandTable1()
{
	document.getElementById("col1").innerHTML = myPanel("User Expence:Daily",
			userExpenceDailyList,0,1);	
	
}

function expandTable2()
{
	document.getElementById("col2").innerHTML = myPanel("User Expence:Monthly",
			userExpenceMonthlyList,0,2);
	
	
}
function expandTable3()
{
	document.getElementById("col3").innerHTML = myPanel("Mess Expence:Daily ",
			messExpenceDailyList,0,3);
		
	
}
function expandTable4()
{
	document.getElementById("col4").innerHTML = myPanel("Mess Expence:Monthly",
			messExpenceMonthlyList,0,4);
	
}

var Anchor;

for(var i=1;i<=4;i++)
	{
	Anchor = document.getElementById("dotRow"+i);		
	if(i==1)
		Anchor.addEventListener("click", expandTable1, false);
	else if(i==2)
		Anchor.addEventListener("click", expandTable2, false);
		else if(i==3)
			Anchor.addEventListener("click", expandTable3, false);
			else if(i==4)
				Anchor.addEventListener("click", expandTable4, false);
	
	}








$(".dropdown").hide();

function buttonCall() {
	// alert("hey");
	// $(".collapse").collapse('toggle');
	// var p=document.getElementById("col3").;

	// alert(""+);

}

/*$(document).ready(function() {
	$("#submitBtn")..click(function() {
		// alert("pooo");
		var li = $(".panel").add("table").add("tr");

	});
});*/

function myPanel(title, expList,rows,panelNumber) {
	var panel = "<div id='"
			+ title
			+ "' class='panel panel-info' ><div class='panel-heading'><h3 class='panel-title'>"
			+ title
			+ "</h3></div><div class='panel-body'>";

	panel += myGrid(expList,rows,panelNumber);
	panel += "</div></div>";
	//panel+="</div></div><div class='panel-footer'>I am footer</div></div>";
	return panel;
}

function myGrid(expList,rows,panelNumber) {
	var grid = "<div class='table-responsive'><table class='table table-hover'  >";
	var sum = 0;
	
	if(rows==0)
		rows=expList.length;
	
	for (var i = 0; i <rows ; i++) {
		
		
		if (i == 0) {
			grid += "<thead><tr>";
			$.each(expList[i], function(k, v) {

				grid += "<th>" + k + "</th>";
			});
			grid += "</tr></thead>";
		}

		grid += "<tr>";
		$.each(expList[i], function(k, v) {
			//display the key and value pair
			//alert(k + ' is ' + v);
			if (k == "Price") {
				v = "Rs " + v;
			}

			grid += "<td>" + v + "</td>";
			
			

		});

		grid += "</tr>";

		//grid+="<tr><td>"+expList[i].expId+"</td><td>"+expList[i].expItemName+"</td><td>Rs "+expList[i].expPrice+"</td></tr>";
		sum += expList[i].Price;
	}
	
	if(rows==2)
		grid += "<tr id='dotRow"+panelNumber+"' ><td>...</td><td>...</td><td>...</td></tr>";
		
		
	grid += "<tfoot><tr><td></td><td>Total</td><td><font color='red'>Rs " + sum
			+ "</font></td></tr></tfoot>" + "</tbody>";
	grid += "</table></div>";
	return grid;
};




