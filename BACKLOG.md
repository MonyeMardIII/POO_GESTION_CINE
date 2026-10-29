# Backlog - POO_GESTION_CINE

## Descripción
Este backlog reúne los requisitos y tareas del proyecto de gestión de funciones de cine, organizados por tipo y prioridad.

## Prioridad
- Alta: requisitos core del sistema y negocio principal
- Media: mejoras funcionales y validaciones
- Baja: mejoras de mantenimiento y calidad no funcional

## Backlog

### Alta prioridad

- [ ] [Historia de usuario] Registro y Gestión Base de Función de Cine (#1)
  - Registrar una función con título de película, sala y datos base.
- [ ] [Historia de usuario] Gestión de Funciones de Estreno (Herencia) (#2)
  - Soportar la lógica de recargo para funciones de estreno.
- [ ] [Historia de usuario] Gestión de Funciones Normales (Herencia) (#3)
  - Aplicar tarifa base sin recargos para funciones normales.
- [ ] [Funcional] Registrar función con título y sala (#16)
  - Definir el flujo de creación de una función con información mínima válida.
- [ ] [Funcional] Validar título de película y sala (#14)
  - Evitar valores nulos o vacíos en los datos esenciales.
- [ ] [Funcional] Gestionar capacidad y disponibilidad de asientos (#13)
  - Mantener consistencia entre ocupados, disponibles y capacidad.
- [ ] [Funcional] Vender entradas con validación (#12)
  - Validar cantidad positiva y disponibilidad de asientos.
- [ ] [Funcional] Calcular recaudación por tipo de función (#11)
  - Diferenciar cálculo entre funciones normales y de estreno.
- [ ] [Funcional] Mostrar resumen final de funciones (#10)
  - Presentar el cierre del estado final de la función.

### Media prioridad

- [ ] [Historia de usuario] Registrar una función de cine (#9)
  - Permitir que el administrador registre una nueva función desde la consola.
- [ ] [Historia de usuario] Vender entradas con validación (#8)
  - Controlar la venta segura de entradas según la disponibilidad.
- [ ] [Historia de usuario] Consultar la recaudación de la función (#7)
  - Mostrar resultados económicos para evaluar el rendimiento.
- [ ] [Funcional] Gestionar capacidad y disponibilidad de asientos (#13)
  - Revisión y validación del estado interno de la función.

### Baja prioridad

- [ ] [No funcional] Mejorar validación de entradas por consola (#6)
  - Mejorar mensajes de error y robustez ante entradas inválidas.
- [ ] [No funcional] Mantener el código extensible y bien diseñado (#15)
  - Asegurar claridad, separación de responsabilidades y escalabilidad del diseño.

## Observaciones
- Los issues #1, #2 y #3 son historias de usuario relacionadas con el dominio de la solución.
- Los issues #6 y #15 corresponden a requisitos no funcionales.
- Los demás elementos representan requisitos funcionales o mejoras del flujo del sistema.
- Este archivo puede editarse para ajustar prioridades, subtareas, estimaciones y estados.

## Estado sugerido
- To do
- In progress
- Done

## Sugerencia de organización futura
- Agregar etiquetas por tipo: `Funcional`, `Historia de Usuario`, `No Funcional`, `Dominio`.
- Separar tareas por sprint.
- Incluir estimaciones (ej. 1, 2, 3 días) si se desea planning.
