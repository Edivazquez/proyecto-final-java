# Proyecto final primera semana
## Autor Edgar Vazquez Ramirez.

🎯 Objetivo
* instala y aprender el buen funcionamiento de Android Studio
* Entender que es Github
* Aplicar lo aprendido

# Sesiones 
1. Sesion 1: Fundamentos Android

  Fundamentos de las aplicaciones
Las aplicaciones Android están escritas en el lenguaje de programación Java. El SDK de android compila todo el código con todos los datos y archivos de recursos en un paquete Android, un archivo de extensión .apk. Todo el código dentro de un archivo .apk se considera una aplicación y es lo que usan los dispositívos para instalar dicha aplicación

Una vez instalada en el dispositivo, cada aplicación corre bajo su própia área de seguridad:

El sistema operativo Android es un sistema Linux multi-usuario en el cual cada aplicación se considera un usuario diferente.
Por defecto, el sistama asigna a cada aplicación un único ID de usuario Linux (El Id lo usa solo el sistema y la aplicación no lo conoce). El sistema asigna permisos para todos los archivos de la aplicación para que sólo el ID de usuario asignado a esa aplicación tenga acceso a ellos.
Cada proceso tiene su propia máquina Virtual (MV), por lo que el código de una aplicación se ejecuta de forma aislada de otras aplicaciones.
Por defecto, cada aplicación se ejecuta en su propio proceso Linux. Android inicia el proceso cuando cualquiera de los componentes de la aplicación necesite ser ejecutado, a continuación finaliza el proceso cuando ya no sea necesario que siga en ejecución o cuando el sistema necesite recuperar la memoria para otras aplicaciones.
De este modo, el sistema Android implementa el principio del mínimo privilegio. Que significa; cada aplicación, por defecto, tiene acceso solo a los componentes que necesite para ejecutarse, a ninguno más. Esto crea un entorno muy seguro en el cual una aplicación no puede acceder a partes del sistema a las que no se le haya dado permiso.

Sin embargo, existen formas de que una aplicación comparta datos con otra y que pueda tener acceso a servicios del sistema.

Es posible que dos aplicaciones compartan el mismo ID de usuario Linux, en tal caso podrán acceder a los archivos de la otra aplicación. Para conservar los recursos del sistema, las aplicaciones con el mismo ID pueden ejecutarse en el mismo proceso y compartir la misma MV (También deben estar firmadas con el mismo certificado).
Una aplicación puede solicitar permisos para acceder a datos del dispositivo como los contactos, SMS, la tarjeta SD, cámara, bluetooth y más. Los permisos de la aplicación se conceden en el instalación de la misma, y los otorga el usuario.



3. Sesion 2: # Pilares del Pensamiento Lógico Computacional
El pensamiento lógico es una habilidad mental que permite analizar y resolver problemas de manera sistemática y lógica.
El pensamiento lógico tiene cuatro puntos importantes los cuales son:

1. Descomposición:
 - El cual vamos a partir un problema en partes más pequeñas.
2. Reconocimiento de patrones:
 - Vamos a ver similitudes que se comparten
3. Abstracción:
 - Veamos en la parte más importante de un problema.
4. Algoritmos:
 - conjunto de pasos para resolver un problema

3. Sesion 3: Instalacion y Entorno de desarrollo.
Descripcion de la instalacion
Android Studio es el entorno de desarrollo integrado (IDE) oficial para el desarrollo de apps para Android creado y distribuido por Google.
Un IDE contiene herramientas que permiten a los desarrolladores de software diseñar, compilar, ejecutar y probar software.
En este caso, apps para la plataforma de Android.

![Instalar-Android-Studio-en-Windows-10-001](https://github.com/user-attachments/assets/2d22c568-2069-4265-af24-fc3db4b127a1)

![android](https://github.com/user-attachments/assets/ea7856e3-19e9-425c-978a-da09f3d0e726)

5. # Control de Versiones
   
 * Septiembre 2008, PRIMERA VERSIÓN ESTABLE, servicio de marcar, enviar mensajes.
 * Abril 2009, se lanzó la versión 1.5, a partir de esta fecha se agregaron más características, los widgets nos traen información en tiempo real o de forma directa, (giroscopio tecnología que sirve para darle forma a las cosas, funciona con los 4 ejes, sensor electrónico que nos permite) 
 * Septiembre 2009, la versión 1.6, búsqueda rápida, Android market renovado, adaptado a más formqatos de pantalla, sintetizador de voz, mejoras en cámara y galería, soporte para CDMA y VPN(puerto de enlace para conexiones seguras).
 * Octubre 2009, versión 2.0, rutas en maps, soporte para varias cuentas, live wallpapers, soporte para flash y zoom, mejoras en la apps preinstaladas como maps, navegador o calendario. 
 * Octubre 2009 sistema operativo FROYO, 
 * Diciembre 2010. Gingerbread versión 2.3/2.3.7 API para juegos, NFC, primer easter egg, cambios de diseño en los iconos, soporte para resolución WXGA y superiores, Seleccionar antes de copiar, soporte para  * varias cámaras, soporte para giroscopio y barómetro, videollamadas en Hangouts.
 * Febrero 2011. HoneyComb, adaptado para tablets, system Bar, ajustes rápidos, pestañas en el navegador, aceleración por hadware, soporte para USB OTG.
 * Octubre 2011, Ice Cream Sandwich, Interfaz Holo, barra de navegación, carpetas, tipografía Roboto, Capturas de pantalla, desbloqueo facial, descartar notificaciones una a una.
 * Julio 2012, JellyBean, Google Now, Movimientos más suave, Ajuste rápidos, mejores de accesibilidad, Widgets
 * Noviembre 2014, Android 5.0 Lollipop. Material Design,
 * Agosto 2016, mejoras en el Doze, compilador JIT, VR daydream, 
 * Agosto 2017 oreo, bienestar digital.
 * Agosto 2019 Android 10; modo oscuro
 * Agosto 2022, Android 13 se personaliza cada aplicación

   <img width="893" alt="linea de tiempo" src="https://github.com/user-attachments/assets/58960c11-04a5-4563-b465-6c791a669c0a">

7. GitHub y Archivo Readme
Git es un sistema de control de versiones distribuido que se ha convertido en el estándar para el desarrollo de software.

A diferencia de sistemas anteriores en Git cada copia de trabajo del código es también un repositorio completo. Esto permite trabajar sin conexión o de forma remota con facilidad.
Git está optimizado para confirmar cambios, crear ramas, fusionar y comparar versiones anteriores.Con Git puedes trabajar de manera colaborativa.
No se basa en los nombres de archivos, sino en el contenido real de los archivos.Tendrás un listado de los cambios(commits) y podemos volver a cualquiera de esos cambios o commits.

En la esquina superior derecha de cualquier página, selecciona  y luego haz clic en Nuevo repositorio.

Captura de pantalla del menú desplegable GitHub que muestra las opciones para crear nuevos elementos. El elemento de menú "New repository" está resaltado en naranja oscuro.
Debajo de "Nombre de repositorio", teclea un nombre de repositorio que empate con tu nombre de usuario de GitHub. Por ejemplo, si tu nombre de usuario es "octocat", el nombre de repositorio debe ser "octocat".

Opcionalmente, en el campo de "Descripción", escriba una descripción del repositorio. Por ejemplo, "Mi repositorio personal".

Seleccione Público.

Seleccione Initialize this repository with a README (Inicializar este repositorio con un archivo Léame).

Haga clic en Create repository (Crear repositorio).


Encima de la barra lateral derecha, haga clic en Edit README.

El archivo de README que se ha generado está pre-llenado con una plantilla para que te inspires en completarlo.

Para obtener un resumen de todos los emojis disponibles y sus códigos, consulte "Hoja de referencia rápida de emoji".

## Eliminar un README de perfil
El LÉAME de perfil se eliminará de su perfil GitHub si sucede cualquiera de los siguientes escenarios:

El archivo LÉAME se elimina o se vacía.
El repositorio se convierte en privado.
El nombre del repositorio ya no coincide con el nombre de usuario debido a un cambio en uno o ambos nombres.



8. Codificacion
9. Manejo de Errores
10. Activity
