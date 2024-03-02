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

-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de meses añadidos.
  
-    <b>Ejemplo</b>:

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

<h2>'LocalDate.now().minus'</h2>

<p>El método <b>'LocalDate.now().minus'</b> en Java permite restar una cantidad específica de días, semanas, meses o años a la fecha actual obtenida mediante LocalDate.now().</p>

<h3>minusDays()</h3>

-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de días restados.

-    <b>Ejemplo</b>:

```java
LocalDate fechaPasada = LocalDate.now().minusDays(5);
System.out.println("Fecha pasada: " + fechaPasada);
```

<h3>minusWeeks()</h3>

-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de semanas restadas.

-    <b>Ejemplo</b>:

```java
LocalDate fechaPasada = LocalDate.now().minusWeeks(2);
System.out.println("Fecha pasada: " + fechaPasada);
```

<h3>minusMonths()</h3>

-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de meses restados.

-    <b>Ejemplo:</b>

```java
LocalDate fechaPasada = LocalDate.now().minusMonths(3);
System.out.println("Fecha pasada: " + fechaPasada);
```

<h3>minusYears()</h3>

-    <b>Descripción</b>: Retorna una copia de la fecha actual con la cantidad especificada de años restados.

-    <b>Ejemplo:</b>

```java
LocalDate fechaPasada = LocalDate.now().minusYears(1);
System.out.println("Fecha pasada: " + fechaPasada);
```

<p>Estos métodos permiten manipular la fecha actual y obtener una nueva fecha ajustada restando días, semanas, meses o años según necesidades específicas. Se puede utilizarlos para calcular fechas en el pasado.</p>

<h2 align="center">'LocalDate.__.get'</h2>

<p>La clase LocalDate en Java proporciona métodos para obtener diferentes componentes de una fecha.</p>

<h3>getYear()</h3>

-    <b>Descripción</b>: Devuelve el año de la fecha.

-    <b>Ejemplo:</b>

```java
int año = LocalDate.now().getYear();
```

<h3>getMonth()</h3>

-    <b>Descripción</b>: Devuelve el mes de la fecha como un objeto Month.

-    <b>Ejemplo:</b>

```java
Month mes = LocalDate.now().getMonth();
```

<h3>getDayOfMonth()</h3>

-    <b>Descripción</b>: Devuelve el día del mes.

-    <b>Ejemplo:</b>

```java
int dia = LocalDate.now().getDayOfMonth();
```

<h3>getDayOfWeek()</h3>

-    <b>Descripción</b>: Devuelve el día de la semana como un objeto DayOfWeek.

-    <b>Ejemplo:</b>

```java
DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
```

<h3>getDayOfYear()</h3>

-    <b>Descripción</b>: Devuelve el día del año.

-    <b>Ejemplo:</b>

```java
int diaAño = LocalDate.now().getDayOfYear();
```

<p>Estos métodos permiten obtener información específica sobre la fecha actual o cualquier otra fecha que se esté manipulando en el programa. Se puede utilizar estos valores para realizar operaciones o mostrar información sobre las fechas en la aplicación.</p>

<h2 align="center">'LocalDate.__.is'</h2>

<p>La clase LocalDate en Java proporciona varios métodos que permiten realizar comparaciones y verificar propiedades de una fecha específica.</p>

<h3 align="center">Métodos de Comparación de Fechas:</h3>

<h3>isEqual()</h3>

-    <b>Descripción</b>: Compara si la fecha es igual a otra fecha.
  
-    <b>Ejemplo:</b>

```java
LocalDate fechaActual = LocalDate.now();
LocalDate otraFecha = LocalDate.of(2022, 2, 26);
boolean esIgual = fechaActual.isEqual(otraFecha);
```

<h3>isBefore()</h3>

-    <b>Descripción</b>: Compara si la fecha es anterior a otra fecha.

-    <b>Ejemplo:</b>

```java
LocalDate fechaActual = LocalDate.now();
LocalDate otraFecha = LocalDate.of(2022, 2, 26);
boolean esAntes = fechaActual.isBefore(otraFecha);
```

<h3>isAfter()</h3>

-    <b>Descripción</b>: Compara si la fecha es posterior a otra fecha.

-    <b>Ejemplo:</b>

```java
LocalDate fechaActual = LocalDate.now();
LocalDate otraFecha = LocalDate.of(2022, 2, 26);
boolean esDespues = fechaActual.isAfter(otraFecha);
```

<h3 align="center">Métodos de Verificación de Propiedades de Fecha:</h3>

<h3>isLeapYear()</h3>

-    <b>Descripción</b>: Verifica si el año de la fecha es un año bisiesto.

-    <b>Ejemplo:</b>

```java
boolean esBisiesto = LocalDate.now().isLeapYear();
```

<p>Estos métodos <b>'is'</b> son útiles para realizar comparaciones y verificar propiedades específicas de las fechas en el programa. Se puede utilizar según las necesidades de la aplicación para tomar decisiones basadas en la relación temporal entre diferentes fechas.</p>

<h2 align="center">'Month' y 'Year'</h2>

<h2>'Month'</h2>
<p>La clase <b>'Month'</b> representa un mes del año.</p>

<h3>Valores Constantes:</h3>

-    <b>Month:</b> tiene un conjunto fijo de instancias predefinidas para cada mes del año (desde JANUARY hasta DECEMBER).

-    Se puede acceder a estas instancias utilizando las constantes de la clase, como Month.JANUARY, Month.FEBRUARY, etc.
-    
<h3>Métodos Útiles:</h3>

-    <b>getDisplayName(TextStyle style, Locale locale):</b> Devuelve el nombre del mes en el estilo y el idioma especificados.

-    <b>getValue():</b> Devuelve el valor numérico del mes (1 para enero, 2 para febrero, etc.).

-    <b>of(int month):</b> Obtiene una instancia de Month a partir del valor numérico del mes.

<b>Ejemplo:</b>

```java
Month mesActual = Month.FEBRUARY;
int valorNumerico = mesActual.getValue(); // Devuelve 2
String nombreMes = mesActual.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Devuelve "febrero"
```

<h2>'Year'</h2>
<p>La clase <b>'Year'</b> representa un año completo.</p>

<h3>Creación de Instancias:</h3>

-    Se puede crear instancias de Year mediante su constructor, por ejemplo, Year.of(2022).

 <h3>Métodos Útiles:</h3> 

-    <b>getValue():</b> Devuelve el valor numérico del año.

-    <b>isLeap():</b> Verifica si el año es bisiesto.

-   <b>plusYears(long years):</b> Retorna una copia del año con la cantidad especificada de años añadidos.

-    <b>minusYears(long years):</b> Retorna una copia del año con la cantidad especificada de años restados.

<b>Ejemplo:</b>

```java
Year añoActual = Year.now();
int valorNumericoAño = añoActual.getValue(); // Devuelve el año actual
boolean esBisiesto = añoActual.isLeap(); // Devuelve true o false
Year añoFuturo = añoActual.plusYears(5); // Retorna el año actual + 5
```

<p>Estas clases son parte del paquete java.time introducido en Java 8 para manejar de manera más eficiente operaciones relacionadas con el tiempo y fechas. Proporcionan métodos útiles y tipos seguros para trabajar con meses y años.</p>

<h2 align="center">'DayOfWeek()'</h2>
<p>En Java, <b>'DayOfWeek'</b> es una enumeración que representa los días de la semana. Cada día de la semana tiene un valor numérico asociado, comenzando desde el lunes (que tiene un valor de 1) hasta el domingo (que tiene un valor de 7).</p>

<h3>Creación de Instancias:</h3>
<p>Se puede obtener instancias de DayOfWeek utilizando las constantes predefinidas de la enumeración:</p>

```java
DayOfWeek lunes = DayOfWeek.MONDAY;
DayOfWeek domingo = DayOfWeek.SUNDAY;
```

<h3>Métodos Útiles:</h3>

-    <b>getValue()</b>: Devuelve el valor numérico asociado al día de la semana (1 para lunes, 2 para martes, ..., 7 para domingo).
```java
int valorNumerico = DayOfWeek.TUESDAY.getValue(); // Devuelve 2
```
-    <b>plus(long days) y minus(long days)</b>: Estos métodos permiten agregar o restar una cantidad específica de días al día de la semana actual.
```java
DayOfWeek proximoMartes = DayOfWeek.TUESDAY.plus(7); // Devuelve el próximo martes
```
-    <b>getDisplayName(TextStyle style, Locale locale)</b>: Devuelve el nombre del día de la semana en el estilo y el idioma especificados.
```java
String nombreLunes = DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Devuelve el nombre completo del lunes en el idioma predeterminado
```

<h3>Ejemplo de Uso:</h3>

```java
DayOfWeek diaActual = DayOfWeek.SATURDAY;
int valorNumerico = diaActual.getValue(); // Devuelve 6
String nombreDia = diaActual.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Devuelve "sábado"
```

<p><b>'DayOfWeek'</b> es útil cuando se necesita representar y trabajar con días específicos de la semana en programas Java, y proporciona métodos que facilitan la manipulación y obtención de información sobre los días de la semana.</p>

<h2 align="center">'LocalTime'</h2>
<p>La clase <b>'LocalTime'</b> en Java, parte del paquete java.time, representa una hora del día sin considerar la fecha ni la zona horaria.</p>

<h3>Creación de Instancias:</h3>

-    <b>Por valores explícitos:</b>
```java
LocalTime hora = LocalTime.of(12, 30, 45); // 12:30:45
```

-    <b>Parseo de una cadena:</b>
```java
LocalTime horaParseada = LocalTime.parse("15:20:30"); // 15:20:30
```

-    <b>Obtener la hora actual:</b>
```java
LocalTime horaActual = LocalTime.now();
```

<h3>Métodos Útiles:</h3>

-    <b>getHour()</b>
-    <b>getMinute()</b>
-    <b>getSecond()</b>
-    <b>getNano()</b>

Devuelven respectivamente la hora, el minuto, el segundo y el componente de nano segundos de la hora actual.
```java
int hora = horaActual.getHour(); // Devuelve la hora actual
int minuto = horaActual.getMinute(); // Devuelve el minuto actual
```

-    <b>plusHours(long hours)</b>
-    <b>minusHours(long hours)</b>
-    <b>plusMinutes(long minutes)</b>
-    <b>minusMinutes(long minutes)</b>
-    <b>plusSeconds(long seconds)</b>
-    <b>minusSeconds(long seconds)</b>
-    <b>plusNanos(long nanos)</b>
-    <b>minusNanos(long nanos)</b>

Permiten agregar o restar una cantidad específica de horas, minutos, segundos o nano segundos a la hora actual.
```java
LocalTime horaFutura = horaActual.plusHours(3); // Hora actual + 3 horas
LocalTime horaPasada = horaActual.minusMinutes(15); // Hora actual - 15 minutos
```

-    <b>isBefore(LocalTime other)</b>
-    <b>isAfter(LocalTime other)</b>

Comprueban si la hora actual es antes o después de otra hora especificada.
```java
boolean esAntes = horaActual.isBefore(LocalTime.NOON); // Comprueba si la hora actual es antes del mediodía
```

-    <b>withHour(int hour)</b>
-    <b>withMinute(int minute)</b>
-    <b>withSecond(int second)</b>
-    <b>withNano(int nanoOfSecond)</b>

Devuelven una copia de la hora actual con el componente de hora, minuto, segundo o nano segundos ajustado al valor especificado.
```java
LocalTime nuevaHora = horaActual.withHour(18); // Hora actual con la hora ajustada a las 18:00
```

<h3>Ejemplo de Uso:</h3>

```java
LocalTime horaActual = LocalTime.now();
System.out.println("Hora actual: " + horaActual);

LocalTime nuevaHora = horaActual.plusHours(2).minusMinutes(30);
System.out.println("Nueva hora: " + nuevaHora);
```

<p>Este ejemplo crea una instancia de LocalTime representando la hora actual, y luego crea una nueva hora ajustando dos horas hacia adelante y restando 30 minutos. LocalTime proporciona métodos convenientes para manipular y trabajar con horas sin preocuparse por la fecha ni la zona horaria.</p>

<h3>'LocalTime.MAX' y 'LocalTime.MIN'</h3>
<p><b>'LocalTime.MAX'</b> y <b>'LocalTime.MIN'</b> son constantes predefinidas en la clase LocalTime de Java y representan respectivamente el tiempo máximo y mínimo posible en un día.</p>

<h3><b>'LocalTime.MAX'</b></h3>

-    <b>Descripción</b>: Representa el tiempo máximo posible en un día. Es equivalente a las 23:59:59.999999999.
  
-    <b>Uso:</b>

```java
LocalTime tiempoMaximo = LocalTime.MAX;
```

<h3><b>'LocalTime.MIN'</b></h3>

-    <b>Descripción</b>: Representa el tiempo mínimo posible en un día. Es equivalente a las 00:00:00.000000000.
  
-    <b>Uso:</b>

```java
LocalTime tiempoMinimo = LocalTime.MIN;
```
<p>Estas constantes son útiles en situaciones donde se necesita representar límites de tiempo. Por ejemplo, se està trabajando con un rango de tiempo y se desea establecer un límite superior o inferior, se puede usar LocalTime.MAX o LocalTime.MIN respectivamente.</p>

<b>Ejemplo:</b>
```java
LocalTime tiempoMaximo = LocalTime.MAX;
LocalTime tiempoMinimo = LocalTime.MIN;

System.out.println("Tiempo máximo: " + tiempoMaximo); // Imprime 23:59:59.999999999
System.out.println("Tiempo mínimo: " + tiempoMinimo); // Imprime 00:00:00.000000000
```

<p>Se debe tener en cuenta que estas constantes están en el contexto de un día específico, y su uso es especialmente útil cuando se necesita representar extremos temporales en un rango de fechas sin preocuparse por la fecha completa.</p>

<h2 align="center">'DateTimeFormatter'</h2>

<p><b>'DateTimeFormatter'</b> en Java es una clase que proporciona un conjunto de patrones predefinidos y personalizables para formatear y analizar fechas y horas en objetos Temporal (como LocalDate, LocalTime, LocalDateTime, etc.). Permite convertir entre representaciones de texto y objetos Temporal.</p>

<h3>Creación de Instancias:</h3>

-    <b>ofPattern(String pattern)</b>: Crea un formateador utilizando un patrón de formato específico.
        -    <b>y</b>: año
        -    <b>M</b>: mes
        -    <b>d</b>: día del mes
        -    <b>H</b>: hora (formato de 24 horas)
        -    <b>m</b>: minuto
        -    <b>s</b>: segundo
  ```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
```

Por ejemplo:
        -    "dd/MM/yyyy": formato de fecha "15/02/2022"
        -    "HH:mm:ss": formato de hora "10:30:00"
        -    "dd/MM/yyyy HH:mm:ss": formato de fecha y hora "15/02/2022 10:30:00"

-    <b>Patrones Predefinidos</b>: Utiliza patrones predefinidos que cubren formatos comunes.
  ```java
DateTimeFormatter isoDateFormatter = DateTimeFormatter.ISO_DATE;
```
