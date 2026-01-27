# Fruteria en Python

# Declaración de variables
numkilos = float(input("Introduce el número de kilos: "))
precio = float(input("Introduce el precio: "))

# Operación
if numkilos > 0.0:
    subtotal = numkilos * precio

    if numkilos <= 2.0:
        descuento = 0.0
        total = subtotal
        porcentaje = "0%"
    elif 2.01 <= numkilos <= 5.0:
        descuento = subtotal * 0.10
        total = subtotal - descuento
        porcentaje = "10%"
    elif 5.01 <= numkilos <= 10.0:
        descuento = subtotal * 0.15
        total = subtotal - descuento
        porcentaje = "15%"
    else:
        descuento = subtotal * 0.20
        total = subtotal - descuento
        porcentaje = "20%"

    print("Subtotal:", subtotal)
    print("Descuento:", descuento)
    print("Porcentaje:", porcentaje)
    print("Total:", total)

else:
    print("Los kilos no pueden ser negativos")
