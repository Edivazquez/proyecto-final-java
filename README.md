# Proyecto final primera semana
# Autor Edgar Vazquez Ramirez.

# 🎯 Objetivo
* instala y aprender el buen funcionamiento de Android Studio
* Entender que es Github
* Aplicar lo aprendido

# Sesiones 
- Sesion 1: Fundamentos Android

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

- Sesion 2: # Pilares del Pensamiento Lógico Computacional
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

- Sesion 3: Instalacion y Entorno de desarrollo.
Descripcion de la instalacion
Android Studio es el entorno de desarrollo integrado (IDE) oficial para el desarrollo de apps para Android creado y distribuido por Google.
Un IDE contiene herramientas que permiten a los desarrolladores de software diseñar, compilar, ejecutar y probar software.
En este caso, apps para la plataforma de Android.

![Instalar-Android-Studio-en-Windows-10-001](https://github.com/user-attachments/assets/2d22c568-2069-4265-af24-fc3db4b127a1)

![android](https://github.com/user-attachments/assets/ea7856e3-19e9-425c-978a-da09f3d0e726)

- Sesion 4: # Control de Versiones
   
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

- Sesion 5: GitHub y Archivo Readme
   
Git es un sistema de control de versiones distribuido que se ha convertido en el estándar para el desarrollo de software.

GitHub es una plataforma donde puedes almacenar, compartir y trabajar junto con otros usuarios para escribir código
Con Github puedes almacenar tu código pero también tienes las siguientes ventajas.
Presentar o compartir el trabajo.
Seguir y administrar los cambios en el código a lo largo del tiempo.
Dejar que otros usuarios revisen el código y realicen sugerencias para mejorarlo.
Colaborar en un proyecto compartido, sin preocuparse de que los cambios afectarán al trabajo de los colaboradores antes de que esté listo para integrarlos.
El trabajo colaborativo, una de las características fundamentales de GitHub, es posible gracias al software de código abierto Git, en el que se basa GitHub.

Haga clic en Create repository (Crear repositorio).

![image](https://github.com/user-attachments/assets/4d7e8bb9-9574-4b0f-b26b-cabc6a32bff3)


Encima de la barra lateral derecha, haga clic en Edit README.

El archivo de README que se ha generado está pre-llenado con una plantilla para que te inspires en completarlo.

Para obtener un resumen de todos los emojis disponibles y sus códigos, consulte "Hoja de referencia rápida de emoji".

## Eliminar un README de perfil
El LÉAME de perfil se eliminará de su perfil GitHub si sucede cualquiera de los siguientes escenarios:

El archivo LÉAME se elimina o se vacía.
El repositorio se convierte en privado.
El nombre del repositorio ya no coincide con el nombre de usuario debido a un cambio en uno o ambos nombres.

- Sesion 6: Codificacion
Realizamos algunos ejercicios  en Android Studio

ejercicio uno
```sql
fun main() {
    val diaSemana = 5

    when (diaSemana) {

    1 -> println("lunes")
    2 -> println("Martes")
    3 -> println("Miercoles")
    4 -> println("Jueves")
    5 -> println("Viernes")
    else -> println("fin de Semana")

}
}
Ejercicio dos

fun main (){

val javon= 50.50
val huevo = 10.00
val salchichas = 30.55
val queso =1.00
val total = (3*javon) + (10*huevo) + (20*salchichas) + (25*queso)

    println("el total es $total")

}

ejercicio tres

fun main()
    (parametro: Array<String>) {
     print("Ingrese el sueldo del empleado:")
      val sueldo = readln().toDouble()
      if (sueldo > 3000) {
          println("Debe pagar impuestos")
      }
}
```

- Sesion 7: Manejo de Errores
Resolvimos algunos errores de Android Studio que se nos presentó al momento de codificación
![Imagen de WhatsApp 2024-07-10 a las 20 40 43_3f14d1f2](https://github.com/user-attachments/assets/c070e507-3550-4755-8945-460520518c7b)

- Sesion 8: Activity

```sql
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/mario1"
    tools:context=".MainActivity2">

    <Button
        android:id="@+id/button"
        android:layout_width="145dp"
        android:layout_height="67dp"
        android:text="Button"
        tools:layout_editor_absoluteX="193dp"
        tools:layout_editor_absoluteY="519dp" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="104dp"
        android:layout_height="99dp"
        app:srcCompat="@mipmap/ic_launcher"
        tools:layout_editor_absoluteX="140dp"
        tools:layout_editor_absoluteY="228dp" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="85dp"
        android:layout_height="74dp"
        app:srcCompat="?android:attr/fingerprintAuthDrawable"
        tools:layout_editor_absoluteX="68dp"
        tools:layout_editor_absoluteY="519dp" />

    <com.google.android.material.chip.ChipGroup
        android:layout_width="249dp"
        android:layout_height="49dp"
        tools:layout_editor_absoluteX="81dp"
        tools:layout_editor_absoluteY="419dp">

        <com.google.android.material.chip.ChipGroup
            android:layout_width="249dp"
            android:layout_height="49dp"
            tools:layout_editor_absoluteX="68dp"
            tools:layout_editor_absoluteY="316dp">

        </com.google.android.material.chip.ChipGroup>
    </com.google.android.material.chip.ChipGroup>

    <CheckBox
        android:id="@+id/checkBox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CheckBox"
        tools:layout_editor_absoluteX="244dp"
        tools:layout_editor_absoluteY="468dp" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="166dp"
        android:layout_height="54dp"
        android:text="BIENVENIDO EDI"
        android:textColor="#C17171"
        android:textColorHighlight="#E0D9D9"
        android:textColorHint="#BF1818"
        tools:layout_editor_absoluteX="139dp"
        tools:layout_editor_absoluteY="74dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

![image](https://github.com/user-attachments/assets/78b096eb-7f8f-4627-914c-efdd30cbebea)


