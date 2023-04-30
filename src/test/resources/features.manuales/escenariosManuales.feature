#language: es

@Manual
  Escenario: Buscar un articulo en la barra de busqueda
  Dado que Isabel esta en la pagina de Falabella
  Cuando Isabel escribe el nombre de un articulo en la barra de busqueda
  Entonces Isabel debe encontrar el producto

@Manual
  Escenario: Ver el estado actual de un pedido
  Dado que Isabel busca el estado de un producto
  Cuando Isabel ingresa a "mis pedidos"
  Entonces Isabel debe ver el estado del pedido

@Manual
  Escenario: Iniciar sesion en la pagina de Falabella
  Dado que Isabel inicia sesion en Falabella
  Cuando Isabel ingresa sus credenciales
  Entonces Isabel debe iniciar sesion exitosamente

@Manual
  Escenario: Filtrar los precios en la pagina de Falabella
  Dado que Isabel filtra el precio de un articulo
  Cuando Isabel seleccione la categoria de precios y seleccione el filtrado por precio
  Entonces Isabel debe ver los productos filtrados por precio

@Manual
  Escenario: Solicitar el formulario para una devolucion
  Dado que Isabel necesita realizar una devolucion
  Cuando Isabel selecciona el apartado mis pedidos y luego solicitar devolucion
  Entonces Isabel debe ver el formulario para realizar una devolucion

