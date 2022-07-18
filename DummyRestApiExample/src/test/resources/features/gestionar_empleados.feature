#language:es
@E2E
Característica: Gestionar empleados del sistema
  Yo como usuario funcional
  Quiero que se apliquen las acciones necesarias
  Para gestionar los empleados del sistema

  Antecedentes:
    Dado que "Brandon" consume el dummy rest para gestionar empleados

  @Get
  Escenario: Obtener empleados del sistema
    Cuando Brandon consulta todos los empleados en el sistema
    Entonces el verifica que el status code es 200 en la respuesta de la peticion
    Y el observa que los empleados son consultados exitosamente "Successfully! All records has been fetched."

  @Crear
  Escenario: Crear empleado en el sistema
    Cuando Brandon realiza la creacion de un empleado
      | name    | salary  | age |
      | Brandon | 8000000 | 29  |
    Entonces el verifica que el status code es 200 en la respuesta de la peticion
    Y el observa que el status es "success"

  @Consultar
  Escenario: Consultar un empleado del sistema
    Cuando Brandon consulta un empleado en el sistema con id "1"
    Entonces el verifica que el status code es 200 en la respuesta de la peticion
    Y el observa que el status es "success"

  @Delete
  Escenario: Eliminar un empleado del sistema
    Cuando Brandon elimina un empleado en el sistema
    Entonces el verifica que el status code es 200 en la respuesta de la peticion
    Y el observa que el mensaje es "Successfully! Record has been deleted"