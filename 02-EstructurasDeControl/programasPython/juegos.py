# Es un juego de preguntas donde se responde si o no, gana quien responda correctamente las 3 preguntas. Sí se responde mal a cuelquiera de ellas ya no se pregunta la siguiente y termina el juego.

print("Bienvenido al juego!!")

# Pregunta 1
r1 = input("¿El Agua de Horchata es color blanca? (Si/No): ")
if r1.lower() != "si":
    print("Game Over!!")
    exit()

# Pregunta 2
r2 = input("¿El planeta es redondo? (Si/No): ")
if r2.lower() != "si":
    print("Game Over!!")
    exit()

# Pregunta 3
r3 = input("¿La canción (I Just) Died In Your Arms es del grupo Cutting Crew? (Si/No): ")
if r3.lower() != "si":
    print("Game Over!!")
    exit()

print("Ganaste")
