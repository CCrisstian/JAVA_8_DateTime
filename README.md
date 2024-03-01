<h1 align="center">Date Time</h1>

<p><b>'Date Time'</b> en Java se refiere a las clases y paquetes introducidos en Java 8 para manejar fechas y horas de manera más efectiva que las antiguas clases Date y Calendar</p>

<h3>Características:</h3>

- La API es muy clara, concisa y fácil de entender como la numeración de los campos

- Tiene muchas representaciones de tiempo diferentes, cada una adecuada para diferentes casos de uso

- Son inmutables

- seguridad del hilo

<h3>Representaciones de fecha y tiempo:</h3>

-  <b>Instant</b>: representa un punto en el tiempo (marca de tiempo)

-  <b>LocalDate</b>: representa una fecha (año, mes, día)

-  <b>LocalDateTime</b>: igual que LocalDate, pero incluye la hora con precisión en nanosegundos

-  <b>OffsetDateTime</b>: igual que LocalDateTime, pero con ajuste de zona horaria

-  <b>LocalTime</b>: hora con precisión de nanosegundos y sin información de fecha

-  <b>ZonedDateTime</b>: igual que OffsetDateTime, pero incluye un ID de zona horaria

-  <b>OffsetLocalTime</b>: igual que LocalTime, pero con ajuste de zona horaria

-  <b>MonthDay</b>: mes y día, sin año ni hora

-  <b>YearMonth</b>: mes y año, sin día ni hora

-  <b>Duration</b>: cantidad de tiempo representada en segundos, minutos y horas. Tiene precisión de nanosegundos

-  <b>Period</b>: cantidad de tiempo representada en días, meses y años

-  <b>DateTimeFormatter</b>: para dar formato a nuestras fechas.


<h2 align="center">'LocalDateTime', 'LocalDate', y 'LocalTime'</h2>

<p><b>'LocalDateTime'</b>, <b>'LocalDate'</b>, y <b>'LocalTime'</b> son clases pertenecientes al paquete java.time introducido en Java 8 para manejar fechas y horas de manera más efectiva que las clases Date y Calendar.</p>

<h3>LocalDateTime</h3>

-  <b>Descripción</b>: Representa una fecha y hora sin referencia a una zona horaria específica.
-  <b>Características</b>:
    -  Contiene información sobre año, mes, día, hora, minuto, segundo y fracción de segundo.
    -  Es inmutable, lo que significa que no se puede modificar una vez creado.
    -  Puede ser utilizado para representar fechas y horas en un contexto local sin preocuparse por la zona horaria.
-  <b>Ejemplo</b>:

```java
LocalDateTime ahora = LocalDateTime.now();
```

<h3>LocalDate</h3>

-  <b>Descripción</b>: Representa una fecha sin referencia a una zona horaria específica.
-  <b>Características</b>:
    -  Contiene información sobre año, mes y día.
    -  Es inmutable.
    -  Puede ser utilizado para representar solo la fecha, sin preocuparse por la hora y la zona horaria.
-  <b>Ejemplo</b>:

```java
LocalDate fechaActual = LocalDate.now();
```

<h3>LocalTime</h3>

-  <b>Descripción</b>: Representa una hora sin referencia a una zona horaria específica.
-  <b>Características</b>:
    -  Contiene información sobre hora, minuto, segundo y fracción de segundo.
    -  Es inmutable.
    -  Puede ser utilizado para representar solo la hora, sin preocuparse por la fecha y la zona horaria.
-  <b>Ejemplo</b>:

```java
LocalTime horaActual = LocalTime.now();
```

<p>Estas clases facilitan la manipulación y representación de fechas y horas en aplicaciones Java, proporcionando una API más moderna y flexible. Se pueden realizar operaciones como comparaciones, adiciones y sustracciones de tiempo de manera más intuitiva y sin preocuparse por la complejidad asociada con las clases antiguas Date y Calendar.</p>

<h2 align="center">'LocalDate.now()'</h2>

<p>El método <b>'LocalDate.now()'</b> en Java pertenece a la clase LocalDate del paquete java.time. Este método se utiliza para obtener la fecha actual del sistema en la zona horaria predeterminada.</p>

-    <b>Descripción</b>: Retorna una instancia de LocalDate que representa la fecha actual.

-    <b>Ejemplo</b>:

```java
LocalDate fechaActual = LocalDate.now();
System.out.println("Fecha actual: " + fechaActual);
```

-    <b>Características</b>:
        -    La fecha se obtiene en función del reloj del sistema y la zona horaria del sistema.
        -    La instancia LocalDate generada no tiene información sobre la hora específica del día, solo representa el año, mes y día.

<p>Este método es útil cuando se necesita trabajar con fechas y no se esta interesado en la información de la hora o la zona horaria. Proporciona una forma sencilla de obtener la fecha actual en el formato LocalDate para su posterior manipulación en tu programa.</p>

<h2 align="center">'LocalDate.of()'</h2>

<p>El método <b>'LocalDate.of(int año, int mes, int día)'</b> en Java pertenece a la clase LocalDate del paquete java.time. Este método se utiliza para crear una instancia de LocalDate con una fecha específica.</p>

-    <b>Descripción:</b> Crea una instancia de LocalDate con la fecha especificada.
-    <b>Parámetros:</b>
    -    <b>año</b>: El año deseado.
    -    <b>mes</b>: El mes deseado (1 para enero, 2 para febrero, etc.).
    -    <b>día</b>: El día deseado del mes.
-    <b>Ejemplo</b>:

```java
LocalDate fechaPersonalizada = LocalDate.of(2022, 2, 26);
System.out.println("Fecha personalizada: " + fechaPersonalizada);
```

<p>Este método es útil cuando se necesita trabajar con fechas específicas y se desea crear instancias de LocalDate con valores precisos para su posterior manipulación en tu programa.</p>

<h2 align="center">'LocalDate.parse()'</h2>

<p>El método <b>'LocalDate.parse(CharSequence texto)'</b> en Java pertenece a la clase LocalDate del paquete java.time. Este método se utiliza para crear una instancia de LocalDate a partir de una representación en formato de texto.</p>

-    <b>Descripción:</b> Convierte una cadena en un objeto LocalDate utilizando el formato ISO (yyyy-MM-dd).
-    <b>Parámetro:</b>
        -    <b>texto:</b> La cadena que representa la fecha en formato ISO.
-    <b>Ejemplo:</b>

```java
LocalDate fechaParseada = LocalDate.parse("2022-02-26");
System.out.println("Fecha parseada: " + fechaParseada);
```
<p>Este método es útil cuando se necesita obtener un objeto LocalDate a partir de una cadena que representa una fecha. Se debe asegurar de que la cadena de entrada esté en un formato válido para evitar excepciones durante el proceso de parseo.</p>

<h2 align="center">'LocalDate.now().plus'</h2>

<p>El método <b>'LocalDate.now().plus'</b> en Java permite agregar una cantidad específica de días, semanas, meses o años a la fecha actual obtenida mediante LocalDate.now().</p>

<h3>plusDays()</h3>
-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de días añadidos.
-    <b>Ejemplo</b>:

```java
LocalDate fechaFutura = LocalDate.now().plusDays(5);
System.out.println("Fecha futura: " + fechaFutura);
```

<h3>plusWeeks()</h3>
-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de semanas añadidas.
-    <b>Ejemplo</b>:

```java
LocalDate fechaFutura = LocalDate.now().plusWeeks(2);
System.out.println("Fecha futura: " + fechaFutura);
```

<h3>plusMonths()</h3>
<b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de meses añadidos.
<b>Ejemplo</b>:

```java
LocalDate fechaFutura = LocalDate.now().plusMonths(3);
System.out.println("Fecha futura: " + fechaFutura);
```

<h3>plusYears()</h3>
-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de años añadidos.
-    <b>Ejemplo</b>:

```java
LocalDate fechaFutura = LocalDate.now().plusYears(1);
System.out.println("Fecha futura: " + fechaFutura);
```

<p>Estos métodos  permiten manipular la fecha actual y obtener una nueva fecha ajustada según las necesidades específicas. Se puede ajustar la fecha agregando días, semanas, meses o años según el contexto de la aplicación.</p>
