# Respuestas sobre Pruebas Unitarias en Java

Este documento responde algunas preguntas clave basadas en el ejemplo de pruebas unitarias usando Mockito para simular dependencias.

---

## 1. ¿Qué te ayudaron a identificar las pruebas unitarias?

Las pruebas unitarias me ayudaron a identificar errores y comportamientos incorrectos en la lógica de negocio de forma temprana, especialmente en el cálculo del total con descuentos y costos de envío. Además, detectan regresiones cuando se modifica el código sin querer afectar funcionalidades existentes.

---

## 2. ¿Cuál fue el beneficio de usar un mock para simular una dependencia?

El uso de mocks permitió aislar el componente que estaba probando (`PedidoService`) sin depender de la implementación real del repositorio de descuentos. Esto facilita pruebas rápidas, deterministas y controladas, además de evitar dependencias externas o bases de datos durante la ejecución de las pruebas.

---

## 3. ¿Qué pasaría si se modifica la lógica de descuentos sin actualizar las pruebas?

Si se modifica la lógica sin actualizar las pruebas, las pruebas podrían fallar alertando sobre el cambio inesperado, o peor aún, si las pruebas no cubren todos los casos, podrían pasar cambios erróneos a producción sin ser detectados, causando fallos o comportamientos inesperados en el sistema.

---

## 4. ¿Cómo escalamos esta estrategia para un sistema más grande?

Para un sistema más grande, esta estrategia se escala creando pruebas unitarias para cada módulo o componente crítico, utilizando mocks para aislar dependencias complejas. Se integran pruebas de integración y de sistema para validar el comportamiento conjunto, y se automatiza la ejecución de pruebas en pipelines CI/CD para garantizar calidad continua.

