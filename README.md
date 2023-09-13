# Palindromos
Arturo Avalos, Lian Canio y Sebastian Llanos

Paso 1.1:

¿Qué hace el método?
Devuelve true o false si la palabra es un palíndromo
¿Cómo lo hace?
Crea una variable llamada resultado, y lo iguala a la string "cadena" pero al revés y hace una verificación estricta de si "resultado" y "cadena" son iguales dando como return un boolean que seria true o false dependiendo de la palabra que se utilice como "cadena".
¿Cómo lo uso?
Por ejemplo si pongo como "cadena" la palabra "radio", el código la separaria por letras quedando r,a,d,i,o  y luego invertiría el orden de las letras quedando o,i,d,a,r y eso lo juntaria dando "oidar" y lo igualará a "resultado", y si "oidar" es igual a "radio" devolverá como return true, pero como es falso devuelve false. (Haciendo un console.log(esPalindromo(radio)) daría como respuesta en consola un false.


Paso 4.2:

¿Qué consideraciones tomaron en cuenta?
Pruebas unitarias a considerar: string con espacios, vacio, mayusculas con minusculas mezcladas, string normal que sea palíndromo y string normal que no sea palíndromo
¿Qué mejoró en su método?
Hicimos que convierta toda la cadena en minúsculas para asi poder evitar que arroje false cuando solo varía en mayusculas o minusculas
¿Qué rol jugaron las pruebas en mejorar su código?
Nos permitió ver el tema de las mayusculas y minusculas que arrojaban false cuando debía ser true
