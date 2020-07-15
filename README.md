# MyPlace
Proyecto programación de dispositivos moviles con el nombre my place el cual consiste en un buscador de terrenos

## Getting Started
Estas instruciones son para ejecutar el proyecto en tu maquina local para desarrollo y prueba

### Prerequisites
Software que nesecitaras para ejecutar el proyecto 

```
AndroidStudio
PostMan
```

###  Installation
```
Para instalar la esta API en un entorno de desarrollo debes hacer lo siguiente:

Debes usar git clone <link repository>, esto clonado el repositorio en tu ruta deseada

-Ejecuta el comando "npm install" dentro de la carpeta del repositorio clonado para intalar las dependencias necesarias 

-Ejecuta el comando "npm run start" para inniciar con la ejecucion del servidor en modo desarrollo

-Ingresa a la URL http://localhost:3000/<ruta> para la funcionalidades de cada una de las rutas

La API consta de las siguientes rutas:
-register:"/api/register" en POST
-login:"/api/login" en POST
-customers: "/api/customers/ en GET,POST,PUT,DELETE
-places: "/api/places" en GET
-addplace: "/api/addplace" en POST

Para iniciar sesión solo es posible en roles "admin" y "cliente" los cuales puedes accesar hemos creado las siguientes credenciales de prueba:

"admin"
email: admin@myplace.com
password: admin1234

"cliente"
email: cliente@myplace.com
password: cliente1234

No es posible registrar un usuario con un rol diferente a cliente o admin...

Al loguear el usuario registrado recibirá como respuesta el acceso correcto y un token con el cual dará autorización para acceder a las rutas de customers y places

El administrador tiene el control de las peticiones POST,PUT,DELETE a otros clientes o terrenos en cuestion, el usuario cliente solo puede realizar la peticiones GET de estos mismos
```
## Authors

* Rodrigo Díaz [ShadowWolf29](https://github.com/ShadowWolf29)
* Ricardo Miranda [RicardoM1randa](https://github.com/RicardoM1randa)
* Victor Mendoza [Vicctor123](https://github.com/Vicctor123)
* Nelson  [Nels4UCA](https://github.com/Nels4UCA)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
