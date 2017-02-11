Algoritmo sin_titulo
	num1 = 103;
	num2 = 1044;
	num3 = 16;
	num4 = 9;
	num5 = 91;
	
	Si (num1 > num2) y (num1 > num3) y (num1 > num4) y num1>num5 Entonces
		Escribir 'El mayor es: ', num1;
	Sino
		Si (num2 > num3) y (num2 > num4) y (num2 > num5) Entonces
			Escribir 'El mayor es: ', num2;
		Sino
			Si (num3 > num4) y (num3 > num5) Entonces
				Escribir 'El mayor es: ', num3;
			Sino
				Si num4>num5 Entonces
					Escribir 'El mayor es: ', num4;
				Sino
					Escribir 'El mayor es: ', num5;
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
