Algoritmo sin_titulo
	//Uso del Ciclo Mientras
	m=1;
	aux = 0;
	Mientras m=0 Hacer
		Escribir "Progra 1, :D";
		// Se aumenta el valor de la variable aux en 1
		aux = aux +1;
		Si aux = 10 Entonces
			m=1;
		Fin Si
	Fin Mientras
	
	//Uso del Ciclo Repetir hasta (Do While)
	m = 0;
	aux = 0;
	Repetir
		Escribir "Lero lero";
		aux = aux +1;
		si aux = 10 Entonces
			m = 1;
		FinSi
	Hasta Que m != 0
	
	n = 0;
	
	Repetir
		Escribir "1) Opción 1";
		Escribir "2) Opción 2";
		Escribir "3) Opción 3";
		Escribir "4) Salir";
		
		Escribir "Elija la opción: ";
		Leer n;
		
		Segun n Hacer
			1:
				Escribir "Opción 1";
			2:
				Escribir "Opción 2";
			3:
				Escribir "Opción 3";
			De Otro Modo:
				Escribir "Ninguno";
		Fin Segun
	
	Hasta Que n = 4
FinAlgoritmo
