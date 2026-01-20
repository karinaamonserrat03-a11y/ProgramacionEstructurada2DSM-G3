# Actividad 2 — Reporte de Buenas Prácticas y Documentación de Código

**Alumno:** Ruiz Ortega Karina Monserrat  
**Grupo:** 2DSM-G3  
**Fecha:** 14 de enero de 2026  
**Unidad:** 1

## 1. Objetivo del reporte
- Implementar metodologías y estándares técnicos que garanticen la aplicación de buenas prácticas de programación y una documentación exhaustiva del código fuente.
- Establecer lineamientos  uniformes que moderen la incidencia de deuda técnica y optimicen los procesos de mantenimiento. 

## 2. Buenas prácticas de codificación
### 2.1 Nombres de variables
- Reglas: No se deben de usar espacios, ni caracteres especiales, deben de tener nombres sencillos
- Ejemplo: int edad = 18; 

### 2.2 Comentarios
- Cuándo comentar: Usa comentarios para explicar partes del código que sean difíciles de comprender.  
- Qué evitar: El comentar el código que ya es obvio. 

### 2.3 Estructura del código
- Indentación: Es una técnica de agregar un espacio inicial al principio de las líneas de código, que ayuda a delimitar visualmente los bloques y estructuras de control.
- Modularidad: Consiste en dividir un programa en partes más pequeñas e independientes
- Evitar duplicidad: Se produce cuando se almacena información sobre la misma entidad varias veces, en lugar de actualizar un único registro.

## 3. Documentación del código
### 3.1 Estándares
- Estándar elegido:  Javadoc, es el estandar oficial de Java que permite documentar clases, metodos y parámetros. 
- Elementos recomendados: El @param se ocupa para los parámetros,  mientras que el @return nos indica los valores y @throws son para los errores.
 


### 3.2 Herramientas / enfoque
- README / generadores / extensiones:
 Genera sitios web estáticos e integra IDEs como lo es IntelliJ

- Ventajas: 
    * Generación automática de documentación técnica profesional en formato HTML y navegación estructurada por clases y métodos.

## 4. Ejemplos prácticos
### 4.1 Antes / Después (Ejemplo 1)
**Antes:**
```txt
public int fn(int a, int b) {
    // suma a y b
    return a + b;
}
```

**Después**
```txt
public int calcularSumaTotal(int primerSumando, int segundoSumando) {
    return primerSumando + segundoSumando;
}
```

### 4.2 Antes / Después (Ejemplo 2)

**Antes:**
```txt
public void procesar() {
    System.out.println("Validando...");
    // lógica de validación de 20 líneas
    System.out.println("Guardando...");
    // lógica de guardado de 20 líneas
}
```

**Después**
```txt
public boolean esValido(String dato) {
    return dato != null && dato.length() > 0;
}

public void guardarEnBaseDatos(String dato) {
    // Lógica específica de persistencia
}
```

### 4.3 Ejemplo de documentación

```txt
/**
 * Calcula el monto final a pagar aplicando un cupón de descuento.
 * * @param subtotal El costo de los servicios seleccionados.
 * @param montoDescuento El valor en dinero a restar del total.
 * @return El precio final después de aplicar la promoción.
 */
public double aplicarCuponDescuento(double subtotal, double montoDescuento) {
    if (montoDescuento > subtotal) {
        return 0.0;
    }
    return subtotal - montoDescuento;
}
```

## 5. Recomendaciones finales

- Sempre hay que incluir validaciones, esto evita que haya errores.
- Cuando  el código tengas demasiadas líneas, debemos de dividir el código en métodos.
-  Si realizas comentarios en el código pero son ya no son de utilidad debemos depurar. 

## 6. Fuentes consultadas

1. El Camino. (s.f.). Reglas para nombrar variables en programación. https://elcamino.dev/reglas-para-nombrar-variables-en-programacion/

1. Llamas, L. (s.f.). ¿Cómo comentar correctamente el código?. Luis Llamas (Escuela de desarrollo). https://www.luisllamas.es/programacion-comentarios/

1. Llamas, L. (s.f.). ¿Qué es la indentación y por qué es importante?. Luis Llamas (Escuela de desarrollo). https://www.luisllamas.es/programacion-indentacion/

1. Arango, Y. (s.f.). Programación modular: Cómo mejora el desarrollo de software. https://arangoya.org/programacion-modular-como-mejora-el-desarrollo-de-software/

1. Data Ladder. (s.f.). ¿Por qué existen los duplicados y cómo deshacerse de ellos? https://dataladder.com/es/por-que-existen-los-duplicados-y-como-deshacerse-de-ellos/

1. Oracle. (2025). Javadoc documentation comment specification. En Java SE 22. https://docs.oracle.com/en/java/javase/22/docs/specs/javadoc/doc-comment-spec.html

1. Backdrop CMS. (s.f.). Documentation standards. https://docs.backdropcms.org/doc-standards