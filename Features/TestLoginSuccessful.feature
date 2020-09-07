Feature: Test ingresando nombre de usuario y contraseña validos
Scenario: Verificacion de inicio de sesion ingresando credenciales
Given Abrir Chrome Login Successful
When Ingresar usuario "ivan" y contraseña "9213" validos
Then Inicio sesion satisfactiriamente