
 var cars={
		Honda:['Civic','Accord','CR-V'],
		BMW:['M3 Sedan','M2 Coupe','i3'],
		Audi:['Q5 Sportback','e-TRON','A1'],
		Nissan:['Sentra','Altima','Rogue'],
		Ford:['Ranger','Mustang','Bronco']
}

var carBrand=document.getElementById('car_brand');
var carModel=document.getElementById('car_model');

carBrand.addEventListener('change',function(){
	var selected_option=cars[this.value];
	while(carModel.options.length>0){
		carModel.options.remove(0);
	}
	Array.from(selected_option).forEach(function(el){
		let option=new Option(el,el);
		carModel.appendChild(option);
	});
});