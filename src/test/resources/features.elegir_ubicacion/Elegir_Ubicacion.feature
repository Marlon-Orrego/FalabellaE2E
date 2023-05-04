# language: es
Característica: Elegir ubicación de entrega

  Escenario: Ver la ubicacion de entrega seleccionada
    Dado Valeria se dirige a elegir ubicacion
    Cuando Valeria elige como departamento "Antioquia", ciudad "Medellín", y barrio "Medellín"
    Entonces Valeria visualiza que se "Entrega en Medellín"

