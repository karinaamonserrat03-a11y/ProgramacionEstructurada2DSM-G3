#Entrada de datos
calif3 = float(input("Introduce la calificación 3:")) 
calif1 = float(input("Introduce la calificación 1:"))
calif2 = float(input("Introduce la calificación 2:"))

#Proceso - Calcular el promedio
promedio = (calif1 +calif2 + calif3) / 3

#Estructura Selectiva Simple
if promedio >= 7.0:
    print("Aprobado")
else :
    print("No Aprobado")

