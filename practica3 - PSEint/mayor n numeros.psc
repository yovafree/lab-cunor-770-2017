Algoritmo sin_titulo
	Escribir 'Ingrese la cantidad de números a comparar: ';
	Leer n;
	el_mayor = 0;
	
	Para numero1 <-1 Hasta n Con Paso 1 Hacer
		Escribir 'Ingrese el número a comparar: ';
		Leer num_nuevo;
		
		Si num_nuevo > el_mayor Entonces
			el_mayor = num_nuevo;
		Fin Si
	Fin Para
	
	Escribir 'El mayor es: ', el_mayor;
FinAlgoritmo
