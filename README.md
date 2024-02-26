# CVDS-LAB-5
## Integrantes
* **Nicolas Sebastian Achuri Macias**
* **Sara Katherin Castillo Garcia**
* **Tomas Suarez Piratova**

## Respuestas

### _PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC_ 

* ¿Por qué MVC obtiene ese nombre?

MVC, que significa Modelo-Vista-Controlador, obtiene su nombre de la estructura de diseño que separa una aplicación en tres componentes principales:

Modelo: Representa los datos y la lógica empresarial de la aplicación. El modelo maneja la lógica de la aplicación y la interacción con la base de datos, si es necesario.

Vista: Es la interfaz de usuario que presenta los datos al usuario y maneja la interacción del usuario, como la entrada de datos y los eventos del usuario.

Controlador: Actúa como intermediario entre el modelo y la vista. Responde a las solicitudes del usuario, realiza las operaciones necesarias en el modelo y selecciona la vista adecuada para mostrar los resultados al usuario.

* ¿Cuáles son las ventajas de usar MVC?

Separación de preocupaciones: MVC permite separar la lógica empresarial, la presentación y el control de la aplicación, lo que facilita la organización del código y la mantenibilidad del proyecto.

Reutilización de código: La separación de los componentes permite reutilizar fácilmente el código en diferentes partes de la aplicación o en otras aplicaciones.

Facilidad de desarrollo en equipo: Al dividir la aplicación en componentes claros y definidos, diferentes desarrolladores pueden trabajar en diferentes partes de la aplicación de manera independiente y coordinada.

Pruebas unitarias más sencillas: Al dividir la aplicación en componentes independientes, es más fácil escribir pruebas unitarias para cada componente, lo que facilita la detección y corrección de errores.

* ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?

La diferencia radica en la organización de los archivos y carpetas para seguir el patrón MVC, en un proyecto MVC, generalmente se encuentran carpetas separadas para los modelos, las vistas y los controladores. Esto puede resultar en una estructura de directorios más modular y organizada.

En Maven y Java EE, es posible encontrar una estructura de directorios más plana, donde todos los archivos y carpetas relacionados con la aplicación se encuentran en el mismo nivel o en estructuras jerárquicas más simples. La separación de preocupaciones no es tan evidente como en un proyecto MVC.

### _PARTE III. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful_ 

![Lab05](https://github.com/tomassuarez49/CVDS-LAB-5/assets/157759002/c62d307a-16e3-43df-aac6-f4c57d7156c4)

* ¿Qué es RESTful?

En un sistema RESTful, los recursos son representados por URLs (Uniform Resource Locators) y son accesibles a través de operaciones HTTP estándar, como GET, POST, PUT y DELETE. Estos recursos pueden ser cualquier cosa que pueda ser identificada de forma única, como documentos, imágenes, videos, usuarios, etc.

* Los principios clave de RESTful incluyen:

Recursos: Los recursos son la unidad central de un sistema RESTful y son identificados por URLs únicas. Cada recurso debe tener una representación, que puede ser en diferentes formatos como JSON, XML, HTML, etc.

Operaciones HTTP: Las operaciones CRUD (Crear, Leer, Actualizar, Borrar) se mapean a los métodos HTTP estándar: GET para leer, POST para crear, PUT para actualizar y DELETE para borrar recursos.

Sin estado: Cada solicitud HTTP debe contener toda la información necesaria para procesarla. El servidor no almacena ningún estado de sesión del cliente entre las solicitudes.

Interfaz uniforme: Los clientes y servidores se comunican a través de una interfaz uniforme estándar, lo que promueve la simplicidad, la escalabilidad y la independencia entre componentes.

Cliente-servidor: El cliente y el servidor son independientes entre sí y pueden evolucionar de forma independiente. Esto permite una mayor escalabilidad y modularidad del sistema.

Sistema sin caché: Las respuestas deben ser etiquetadas como cachéables o no-cachéables. Esto permite a los clientes almacenar en caché las respuestas para mejorar el rendimiento y la eficiencia de la red.

### _PARTE IV. - APLICACIÓN MVC JUEGO_ 

* ¿Qué pasa si abro el sitio de juegos en dos navegadores diferentes?

Si se abre el sitio de juegos en dos navegadores diferentes y se juega simultáneamente en ambos, cada navegador mantendrá su propio estado del juego. Esto significa que cada navegador tendrá su propio juego en curso, con su propio número a adivinar y su propio saldo. No habrá interferencia entre los dos juegos, ya que cada sesión del navegador es independiente.

* Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?

Si se quisiera que a cada jugador le aparecieran independientemente sus respectivos saldos, se tendría que implementar una funcionalidad de gestión de sesiones. Esto implicaría asignar una sesión única a cada jugador cuando ingresan al sitio y luego mantener la información específica de cada jugador asociada con su sesión. De esta manera, cada jugador tendría su propio saldo, independientemente de cuántas personas estén jugando al mismo tiempo en el sitio.







