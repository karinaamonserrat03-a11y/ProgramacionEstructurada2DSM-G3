# Actividad 3 — Configuración de un Entorno de Desarrollo Integrado (IDE)

**Alumno:** Ruiz Ortega Karina Monserrat  
**Grupo:**  2DSM-G3       
**Fecha:** 17 de enero de 2026   
**Unidad:** 1

## 1. IDE seleccionado
- IDE: IntelliJ IDEA Community Edition
- Versión: 2025.3.1.1
- Sistema operativo: Windows 11 

## 2. Justificación
- Criterio 1: Es un IDE gratuito y completo en el desarrollo en Java cuenta con herramientas profesionales para proyectos académicos.
- Criterio 2: Detecta errores en tiempo real.
- Criterio 3: IntelliJ IDEA permite modificar y reorganizar el código de una manera segura. 

## 3. Requisitos previos
- Requisito 1: Tener un sistema operativo como Windows 64 bits.
- Requisito 2: Tener suficiente RAM mínimo 2GB y 3.5 GB de espacio libre. 
- Permisos: Se ocupan permisos de administrador para instalar el software a nivel de sistema.

## 4. Instalación (paso a paso)
  1. Acceder al sitio oficial  https://www.jetbrains.com/idea/download/ para descargar IntelliJ IDEA y descargar para el sistema operativo
  2. Descargar e instalar el JDK 21 https://jdk.java.net/21/ 
  3. Ejecutar el instalador 
  4. Aceptar que la aplicación haga cambios 
  5. Se abre la aplicación y dar click en -Next 
  6. Seleccionar la opción "Create Desktop Shortcut"
  7. Asociar los archivos (.java, .kt, .gradle) 
  8. Selecionar la opción "Next" 
  9. Selecionar la opción "Install" 
  10. Selecionar "Run IntelliJ IDEA" y poner "Finish"

### 4.1 Verificación
- ¿Cómo comprobé que funciona?     
 Al abrir la aplicación, IntelliJ IDEA se ejecuta correctamente y no muestra errores en pantalla.

- Evidencia (captura o descripción):       
  En la imagen se observa la pantalla de inicio de IntelliJ IDEA Community 2025.2, donde se muestra el nombre del IDE y su versión, acompañado del logotipo de JetBrains IDEs. Esta pantalla aparece al ejecutar el programa después de la instalación, lo que confirma que el IDE fue instalado correctamente y se inicia sin presentar errores.

## 5. Configuración inicial
### 5.1 Ajustes básicos
- Se puede cambiar el tema visual de IntelliJ IDEA.
File > Settings > Darcula
- Se configura Git en VCS > Enable Version Control Integration > Git

### 5.2 Extensiones / plugins

| Extensión/Plugin | Función | Por qué |
|---|---|---|
| Git | Control de versiones | Permite gestionar versiones del proyecto |
| GitHub | Repositorios remotos | Facilita la subida y sincronización de archivos de manera automática|
| Lombok | Reducción de código | Simplifica la escritura de clases  |


### 5.3 Herramientas adicionales (si aplica)
- Compilador/intérprete:
Se ocupa el OpenJDK 21 para que funcione Java.
- Prueba: Se creó una clase Java con el método main y se ejecutó correctamente mostrando la salida en la consola.
New > Java Class > Run

### 5.4 Configuración de Git y Repositorio

**Instalación de Git**

1. Descargar Git desde el sitio oficial
2. Se ejecuta el instalador y aceptar los permisos
3. Abrir Git Bash 
4. Verificamos la versión de Git con **git --version**

**Configuración de datos del usuario**

5. Configuramos el usuario **Karina03**
6. Configuramos el correo **karinaamonserrat03@gmail.com**

**Creación del proyecto en IntelliJ IDEA**

7. Abrimos IntelliJ IDEA
8. Seleccionamos New Project 
9. Elegimos Java 
10. Seleccionamos el JDK 21
11. Crear proyecto 

**Iniciar el repositorio en Git**

12. En la carpeta del proyecto del repositorio local usamos **git init**

**Git en IntelliJ IDEA**

13. Entramos a IntelliJ nos dirigimos al menú VCS
14. Seleccionamos Enable Versión Control Integration
15. Seleccionamos Git 

**Archivos a Stage**

16. En Git Bash ponemos **git add .**

**Realizar commit**  

17. Creamos un commit **git commit -m "Config IDE"**

**Repositorio en GitHub**  

18. Entramos a GitHub e iniciamos sesión o creamos cuenta 
19. Creamos un nuevo repositorio damos click en el **+**
20. Le asignamos un nombre al repositorio
21. Agregamos una descripción
22. Configuramos el repositorio como público 
23. Le damos click en crear repositorio 

**Vinculación del Repositorio**  

24. Viculamos el repositorio local con GitHub **git remote add origin https://github.com/karina03/reposi.git**
25. Subimos el proyecto a GitHub **git branch -M main**
26. Finalmente usamos **git push -u origin main**

## 6. Prueba final (mini-ejercicio)
```txt
package mx.edu.uttt.estructurasdecontrol;

public class MiniEjercicio {
    public static void main (String[] args){

        int x=2, suma;
        suma = 2 + 5;
        System.out.println("El resultado es: "+ suma);
    }
}
```
La salida es: "El resultado es: 7"



## 7. Conclusiones
- IntelliJ IDEA es muy adecuado para el ámbito académico, ya que es eficiente en el desarrollo en Java. Además es muy fácil interactuar con dicho IDE.
- El IDE se configuró correctamente y ya se pueden hacer proyectos. 
- Usa Git y GitHub para trabajar en colaboración.
