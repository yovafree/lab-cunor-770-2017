Algoritmo mayor_2_numeros
	
	num1 = 4;
	num2 = 7;
	num3 = 5;
	Escribir 'Ingrese el primer n�mero: ';
	Leer num1;
	Escribir 'Ingrese el segundo n�mero: ';
	Leer num2;
	Escribir 'Ingrese el tercer n�mero: ';
	Leer num3;
	
	Si num1 > num2 Entonces
		Si num1 > num3 Entonces
			Escribir 'El mayor es: ', num1;
		Sino
			Escribir 'El mayor es: ', num3;
		Fin Si
	Sino
		Si num2 > num3 Entonces
			Escribir 'El mayor es: ', num2;
		Sino
			Escribir 'El mayor es: ', num3;
		Fin Si
	Fin Si
	
FinAlgoritmo
