<h1 align="center">Date Time</h1>
<p>`Date Time` en Java se refiere a las clases y paquetes introducidos en Java 8 para manejar fechas y horas de manera más efectiva que las antiguas clases Date y Calendar</p>
<h3>Características:</h3>

- La API es muy clara, concisa y fácil de entender como la numeración de los campos
- Tiene muchas representaciones de tiempo diferentes, cada una adecuada para diferentes casos de uso
- Son inmutables
- seguridad del hilo

<h3>LocalDateTime</h3>

-    Representa una fecha y hora sin referencia a una zona horaria específica.
-  Contiene información sobre año, mes, día, hora, minuto, segundo y fracción de segundo.
-  Es inmutable, lo que significa que no se puede modificar una vez creado.
-  Puede ser utilizado para representar fechas y horas en un contexto local sin preocuparse por la zona horaria.
```java
LocalDateTime ahora = LocalDateTime.now();
```
<h3>LocalDate</h3>

-    Representa una fecha sin referencia a una zona horaria específica.
-  Contiene información sobre año, mes y día.
-  Es inmutable.
-  Puede ser utilizado para representar solo la fecha, sin preocuparse por la hora y la zona horaria.
```java
LocalDate fechaActual = LocalDate.now();
```
<h3>LocalTime</h3>

-    Representa una hora sin referencia a una zona horaria específica.
-  Contiene información sobre hora, minuto, segundo y fracción de segundo.
-  Es inmutable.
-  Puede ser utilizado para representar solo la hora, sin preocuparse por la fecha y la zona horaria.
```java
LocalTime horaActual = LocalTime.now();
```
<p>Estas clases facilitan la manipulación y representación de fechas y horas en aplicaciones Java, proporcionando una API más moderna y flexible. Se pueden realizar operaciones como comparaciones, adiciones y sustracciones de tiempo de manera más intuitiva y sin preocuparse por la complejidad asociada con las clases antiguas Date y Calendar.</p>
<h2 align="center">'LocalDate.now()'</h2>
<p>El método <b>'LocalDate.now()'</b> en Java pertenece a la clase LocalDate del paquete java.time. Este método se utiliza para obtener la fecha actual del sistema en la zona horaria predeterminada.</p>

-    <b>Ejemplo</b>:
```java
LocalDate fechaActual = LocalDate.now();
System.out.println("Fecha actual: " + fechaActual);
```
-    <b>Características</b>:
        -    La fecha se obtiene en función del reloj del sistema y la zona horaria del sistema.
        -    La instancia LocalDate generada no tiene información sobre la hora específica del día, solo representa el año, mes y día.

<h2 align="center">'LocalDate.of()'</h2>
<p>El método `LocalDate.of(int año, int mes, int día)` en Java pertenece a la clase LocalDate del paquete java.time. Este método se utiliza para crear una instancia de LocalDate con una fecha específica.</p>

-    <b>Parámetros:</b>
        -    <b>año</b>: El año deseado.
        -    <b>mes</b>: El mes deseado (1 para enero, 2 para febrero, etc.).
        -    <b>día</b>: El día deseado del mes.
-    <b>Ejemplo</b>:
```java
LocalDate fechaPersonalizada = LocalDate.of(2022, 2, 26);
System.out.println("Fecha personalizada: " + fechaPersonalizada);
```
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

`plusDays()`: Retorna una copia de la fecha actual con la cantidad especificada de días añadidos.
-    <b>Ejemplo</b>:
```java
LocalDate fechaFutura = LocalDate.now().plusDays(5);
System.out.println("Fecha futura: " + fechaFutura);
```
`plusWeeks()`: Retorna una copia de la fecha actual con la cantidad especificada de semanas añadidas.
-    <b>Ejemplo</b>:
```java
LocalDate fechaFutura = LocalDate.now().plusWeeks(2);
System.out.println("Fecha futura: " + fechaFutura);
```
`plusMonths()`: Retorna una copia de la fecha actual con la cantidad especificada de meses añadidos.
-    <b>Ejemplo</b>:
```java
LocalDate fechaFutura = LocalDate.now().plusMonths(3);
System.out.println("Fecha futura: " + fechaFutura);
```
`plusYears()`: Retorna una copia de la fecha actual con la cantidad especificada de años añadidos.
-    <b>Ejemplo</b>:
```java
LocalDate fechaFutura = LocalDate.now().plusYears(1);
System.out.println("Fecha futura: " + fechaFutura);
```
<h2 align="center">'LocalDate.now().minus'</h2>
<p>El método <b>'LocalDate.now().minus'</b> en Java permite restar una cantidad específica de días, semanas, meses o años a la fecha actual obtenida mediante LocalDate.now().</p>

-    `minusDays()`: Retorna una copia de la fecha actual con la cantidad especificada de días restados.
```java
LocalDate fechaPasada = LocalDate.now().minusDays(5);
System.out.println("Fecha pasada: " + fechaPasada);
```
-    `minusWeeks()`: Retorna una copia de la fecha actual con la cantidad especificada de semanas restadas.
```java
LocalDate fechaPasada = LocalDate.now().minusWeeks(2);
System.out.println("Fecha pasada: " + fechaPasada);
```
-    `minusMonths()`: Retorna una copia de la fecha actual con la cantidad especificada de meses restados.
```java
LocalDate fechaPasada = LocalDate.now().minusMonths(3);
System.out.println("Fecha pasada: " + fechaPasada);
```
-    `minusYears()`: Retorna una copia de la fecha actual con la cantidad especificada de años restados.
```java
LocalDate fechaPasada = LocalDate.now().minusYears(1);
System.out.println("Fecha pasada: " + fechaPasada);
```
<p>Estos métodos permiten manipular la fecha actual y obtener una nueva fecha ajustada restando días, semanas, meses o años según necesidades específicas. Se puede utilizarlos para calcular fechas en el pasado.</p>
<h2 align="center">'LocalDate.__.get'</h2>
<p>La clase LocalDate en Java proporciona métodos para obtener diferentes componentes de una fecha.</p>

-    `getYear()`: Devuelve el año de la fecha.
```java
int año = LocalDate.now().getYear();
```
-    `getMonth()`: Devuelve el mes de la fecha como un objeto Month.
```java
Month mes = LocalDate.now().getMonth();
```
-    `getDayOfMonth()`: Devuelve el día del mes.
```java
int dia = LocalDate.now().getDayOfMonth();
```
-    `getDayOfWeek()`: Devuelve el día de la semana como un objeto DayOfWeek.
```java
DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
```
-    `getDayOfYear()`: Devuelve el día del año.
```java
int diaAño = LocalDate.now().getDayOfYear();
```
<p>Estos métodos permiten obtener información específica sobre la fecha actual o cualquier otra fecha que se esté manipulando en el programa. Se puede utilizar estos valores para realizar operaciones o mostrar información sobre las fechas en la aplicación.</p>
<h2 align="center">'LocalDate.__.is'</h2>
<p>La clase LocalDate en Java proporciona varios métodos que permiten realizar comparaciones y verificar propiedades de una fecha específica.</p>
<h3 align="center">Métodos de Comparación de Fechas:</h3>

-    `isEqual()`: Compara si la fecha es igual a otra fecha.
```java
LocalDate fechaActual = LocalDate.now();
LocalDate otraFecha = LocalDate.of(2022, 2, 26);
boolean esIgual = fechaActual.isEqual(otraFecha);
```
-    `isBefore()`: Compara si la fecha es anterior a otra fecha.
```java
LocalDate fechaActual = LocalDate.now();
LocalDate otraFecha = LocalDate.of(2022, 2, 26);
boolean esAntes = fechaActual.isBefore(otraFecha);
```
-    `isAfter()`: Compara si la fecha es posterior a otra fecha.
```java
LocalDate fechaActual = LocalDate.now();
LocalDate otraFecha = LocalDate.of(2022, 2, 26);
boolean esDespues = fechaActual.isAfter(otraFecha);
```
<h3 align="center">Métodos de Verificación de Propiedades de Fecha:</h3>

`isLeapYear()`: Verifica si el año de la fecha es un año bisiesto.
```java
boolean esBisiesto = LocalDate.now().isLeapYear();
```
<p>Estos métodos `is` son útiles para realizar comparaciones y verificar propiedades específicas de las fechas en el programa. Se puede utilizar según las necesidades de la aplicación para tomar decisiones basadas en la relación temporal entre diferentes fechas.</p>
<h2 align="center">'Month' y 'Year'</h2>
<h2>'Month'</h2>
<p>La clase <b>'Month'</b> representa un mes del año.</p>
<h3>Valores Constantes:</h3>

-    `Month`: tiene un conjunto fijo de instancias predefinidas para cada mes del año (desde JANUARY hasta DECEMBER).
-    Se puede acceder a estas instancias utilizando las constantes de la clase, como Month.JANUARY, Month.FEBRUARY, etc.
  
<h3>Métodos Útiles:</h3>

-    `getDisplayName(TextStyle style, Locale locale)`: Devuelve el nombre del mes en el estilo y el idioma especificados.
-    `getValue()`: Devuelve el valor numérico del mes (1 para enero, 2 para febrero, etc.).
-    `of(int month)`: Obtiene una instancia de Month a partir del valor numérico del mes.
```java
Month mesActual = Month.FEBRUARY;
int valorNumerico = mesActual.getValue(); // Devuelve 2
String nombreMes = mesActual.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Devuelve "febrero"
```
<h2>'Year'</h2>
<p>La clase <b>'Year'</b> representa un año completo.</p>
<h3>Creación de Instancias:</h3>

-    Se puede crear instancias de Year mediante su constructor, por ejemplo, `Year.of`(2022).

 <h3>Métodos Útiles:</h3> 

-    `getValue()`: Devuelve el valor numérico del año.
-    `isLeap()`:Verifica si el año es bisiesto.
-   `plusYears(long years)`:Retorna una copia del año con la cantidad especificada de años añadidos.
-    `minusYears(long years)`:Retorna una copia del año con la cantidad especificada de años restados.
```java
Year añoActual = Year.now();
int valorNumericoAño = añoActual.getValue(); // Devuelve el año actual
boolean esBisiesto = añoActual.isLeap(); // Devuelve true o false
Year añoFuturo = añoActual.plusYears(5); // Retorna el año actual + 5
```
<p>Estas clases son parte del paquete java.time introducido en Java 8 para manejar de manera más eficiente operaciones relacionadas con el tiempo y fechas. Proporcionan métodos útiles y tipos seguros para trabajar con meses y años.</p>
<h2 align="center">'DayOfWeek()'</h2>
<p>En Java, `DayOfWeek` es una enumeración que representa los días de la semana. Cada día de la semana tiene un valor numérico asociado, comenzando desde el lunes (que tiene un valor de 1) hasta el domingo (que tiene un valor de 7).</p>
<h3>Creación de Instancias:</h3>
<p>Se puede obtener instancias de DayOfWeek utilizando las constantes predefinidas de la enumeración:</p>

```java
DayOfWeek lunes = DayOfWeek.MONDAY;
DayOfWeek domingo = DayOfWeek.SUNDAY;
```
<h3>Métodos Útiles:</h3>

-    `getValue()`: Devuelve el valor numérico asociado al día de la semana (1 para lunes, 2 para martes, ..., 7 para domingo).
```java
int valorNumerico = DayOfWeek.TUESDAY.getValue(); // Devuelve 2
```
-    `plus(long days) y minus(long days)`: Estos métodos permiten agregar o restar una cantidad específica de días al día de la semana actual.
```java
DayOfWeek proximoMartes = DayOfWeek.TUESDAY.plus(7); // Devuelve el próximo martes
```
-    `getDisplayName(TextStyle style, Locale locale)`: Devuelve el nombre del día de la semana en el estilo y el idioma especificados.
```java
String nombreLunes = DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Devuelve el nombre completo del lunes en el idioma predeterminado
```
<h3>Ejemplo de Uso:</h3>

```java
DayOfWeek diaActual = DayOfWeek.SATURDAY;
int valorNumerico = diaActual.getValue(); // Devuelve 6
String nombreDia = diaActual.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Devuelve "sábado"
```
<p>`DayOfWeek` es útil cuando se necesita representar y trabajar con días específicos de la semana en programas Java, y proporciona métodos que facilitan la manipulación y obtención de información sobre los días de la semana.</p>
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
<h3>'LocalTime.MAX' y 'LocalTime.MIN'</h3>
<p><b>'LocalTime.MAX'</b> y <b>'LocalTime.MIN'</b> son constantes predefinidas en la clase LocalTime de Java y representan respectivamente el tiempo máximo y mínimo posible en un día.</p>

`LocalTime.MAX`: Representa el tiempo máximo posible en un día. Es equivalente a las 23:59:59.999999999.
```java
LocalTime tiempoMaximo = LocalTime.MAX;
```
`LocalTime.MIN`: Representa el tiempo mínimo posible en un día. Es equivalente a las 00:00:00.000000000.
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
<h2 align="center">'DateTimeFormatter'</h2>
<p>`DateTimeFormatter` en Java es una clase que proporciona un conjunto de patrones predefinidos y personalizables para formatear y analizar fechas y horas en objetos Temporal (como LocalDate, LocalTime, LocalDateTime, etc.). Permite convertir entre representaciones de texto y objetos Temporal.</p>
<h3>Creación de Instancias:</h3>

-    `ofPattern(String pattern)`: Crea un formateador utilizando un patrón de formato específico.
        -    <b>y</b>: año
        -    <b>M</b>: mes
        -    <b>d</b>: día del mes
        -    <b>H</b>: hora (formato de 24 horas)
        -    <b>m</b>: minuto
        -    <b>s</b>: segundo
Por ejemplo:
-    `"dd/MM/yyyy"`: formato de fecha "15/02/2022" 
-    `"HH:mm:ss"`: formato de hora "10:30:00"
-    `"dd/MM/yyyy HH:mm:ss"`: formato de fecha y hora "15/02/2022 10:30:00"
  ```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
```
-    <b>Patrones Predefinidos</b>: Utiliza patrones predefinidos que cubren formatos comunes.
        -    `BASIC_ISO_DATE`: Representa la fecha en formato básico ISO 8601 (sin separadores), como "yyyyMMdd". Ejemplo: "20220226" para el 26 de febrero de 2022.
        -    `ISO_DATE`: Representa la fecha en formato ISO 8601, como "yyyy-MM-dd". Ejemplo: "2022-02-26" para el 26 de febrero de 2022.
        -    `ISO_INSTANT`: Representa una marca de tiempo instantáneo en formato ISO 8601, incluyendo la fecha, hora y zona horaria en UTC. Ejemplo: "2022-02-26T14:30:00Z".
        -    `ISO_LOCAL_DATE`: Representa la fecha sin zona horaria en formato ISO 8601, como "yyyy-MM-dd". Ejemplo: "2022-02-26" para el 26 de febrero de 2022.
        -    `ISO_LOCAL_DATE_TIME`: Representa la fecha y hora sin zona horaria en formato ISO 8601, como "yyyy-MM-ddTHH:mm:ss". Ejemplo: "2022-02-26T14:30:00" para el 26 de febrero de 2022 a las 14:30.
        -    `ISO_LOCAL_TIME`: Representa la hora sin fecha ni zona horaria en formato ISO 8601, como "HH:mm:ss". Ejemplo: "14:30:00" para las 14:30.
        -    `ISO_OFFSET_DATE`: Representa la fecha con compensación de zona horaria en formato ISO 8601, como "yyyy-MM-ddZZ". Ejemplo: "2022-02-26+05:00" para el 26 de febrero de 2022 con una compensación de +5 horas.
        -    `ISO_OFFSET_DATE_TIME`: Representa la fecha y hora con compensación de zona horaria en formato ISO 8601, como "yyyy-MM-ddTHH:mm:ssZZ". Ejemplo: "2022-02-26T14:30:00+05:00" para el 26 de febrero de 2022 a las 14:30 con una compensación de +5 horas.
        -    `ISO_OFFSET_TIME`: Representa la hora con compensación de zona horaria en formato ISO 8601, como "HH:mm:ssZZ". Ejemplo: "14:30:00+05:00" para las 14:30 con una compensación de +5 horas.
        -    `ISO_ORDINAL_DATE`: Representa la fecha en formato ordinal ISO 8601, como "yyyy-DDD". Ejemplo: "2022-057" para el día 57 de 2022 (26 de febrero).
        -    `ISO_TIME`: Representa la hora con zona horaria en formato ISO 8601, como "HH:mm:ssZZ". Ejemplo: "14:30:00+00:00" para las 14:30 en UTC.
        -    `ISO_WEEK_DATE`: Representa la fecha en formato ISO 8601 con número de semana, como "yyyy-'W'ww-E". Ejemplo: "2022-W08-6" para el sexto día (sábado) de la semana 8 de 2022.
        -    `ISO_ZONED_DATE_TIME`: Representa la fecha y hora con información de zona horaria en formato ISO 8601. Ejemplo: "2022-02-26T14:30:00+05:00[Asia/Kolkata]".
```java
DateTimeFormatter isoDateFormatter = DateTimeFormatter.ISO_DATE;
```
<h3>Métodos Útiles:</h3>

-    `format(Temporal temporal)`: Convierte un objeto Temporal en una cadena utilizando el formato especificado por el formateador.
```java
LocalDateTime ahora = LocalDateTime.now();
String cadenaFormateada = formatter.format(ahora);
```
-    `parse(CharSequence text)`: Convierte una cadena en un objeto Temporal utilizando el formato especificado por el formateador.
 ```java
String cadenaFecha = "2022-02-26 14:30:00";
LocalDateTime fechaParseada = formatter.parse(cadenaFecha, LocalDateTime::from);
```
-    `withLocale(Locale locale)` y `withZone(ZoneId zone)`: Permite especificar el idioma y la zona horaria a utilizar en el formateo y análisis.
```java
DateTimeFormatter formatterConLocale = formatter.withLocale(Locale.FRENCH);
```
Ejemplo de Uso:
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
LocalDateTime ahora = LocalDateTime.now();

// Formatear fecha y hora
String cadenaFormateada = formatter.format(ahora);
System.out.println("Fecha y hora formateadas: " + cadenaFormateada);

// Parsear cadena a objeto LocalDateTime
String cadenaFecha = "2022-02-26 14:30:00";
LocalDateTime fechaParseada = formatter.parse(cadenaFecha, LocalDateTime::from);
System.out.println("Fecha parseada: " + fechaParseada);
```
<p>Este ejemplo muestra cómo formatear una fecha y hora actual a una cadena y cómo parsear una cadena en un objeto LocalDateTime.</p>
<h2 align="center">'LocalDateTime'</h2>
<p>`LocalDateTime` en Java, perteneciente al paquete java.time, es una clase que representa una fecha y hora sin zona horaria. Combina la fecha y la hora en un único objeto, permitiéndote trabajar con instancias que contienen ambos aspectos del tiempo.</p>
<h3>Creación de Instancias:</h3>

-    `of(int year, int month, int dayOfMonth, int hour, int minute)`: Crea una instancia con valores específicos para año, mes, día, hora y minuto.
```java
LocalDateTime fechaHora = LocalDateTime.of(2022, 2, 26, 14, 30);
```
-    `of(LocalDate date, LocalTime time)`: Combina una instancia de LocalDate y LocalTime en un LocalDateTime.
```java
LocalDate fecha = LocalDate.of(2022, 2, 26);
LocalTime hora = LocalTime.of(14, 30);
LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);
```
-    `now()`: Obtiene la fecha y hora actuales.
```java
LocalDateTime ahora = LocalDateTime.now();
```
<h2 align="center">'ZonedDateTime'</h2>
<p>`ZonedDateTime` en Java, perteneciente al paquete java.time, es una clase que representa una fecha y hora en un contexto de zona horaria específico. Combina la información de LocalDateTime con la información de la zona horaria para proporcionar una representación completa del tiempo</p>
<h3>Creación de Instancias:</h3>

-    `of(LocalDateTime localDateTime, ZoneId zone)`: Combina una instancia de LocalDateTime con una ZoneId para crear un ZonedDateTime.
```java
LocalDateTime fechaHoraLocal = LocalDateTime.of(2022, 2, 26, 14, 30);
ZoneId zonaHoraria = ZoneId.of("America/New_York");
ZonedDateTime fechaHoraZonificada = ZonedDateTime.of(fechaHoraLocal, zonaHoraria);
```

-    `ofInstant(Instant instant, ZoneId zone)`: Crea una instancia de ZonedDateTime a partir de un Instant y una ZoneId.
```java
Instant instante = Instant.now();
ZoneId zonaHoraria = ZoneId.of("Europe/Paris");
ZonedDateTime fechaHoraZonificada = ZonedDateTime.ofInstant(instante, zonaHoraria);
```

-   `now()`: Obtiene la fecha y hora actuales en el contexto de la zona horaria predeterminada del sistema.
```java
ZonedDateTime ahora = ZonedDateTime.now();
```

<h3>Métodos Útiles:</h3>

-    `toLocalDateTime()`: Devuelve una instancia de LocalDateTime que representa la fecha y hora sin la información de la zona horaria.
```java
LocalDateTime fechaHoraLocal = fechaHoraZonificada.toLocalDateTime();
```
-    `withZoneSameInstant(ZoneId zone)`: Devuelve una nueva instancia de ZonedDateTime con la misma fecha y hora, pero en una zona horaria diferente.
```java
ZoneId nuevaZonaHoraria = ZoneId.of("Asia/Tokyo");
ZonedDateTime fechaHoraEnTokyo = fechaHoraZonificada.withZoneSameInstant(nuevaZonaHoraria);
```
-    `withZoneSameLocal(ZoneId zone)`: Devuelve una nueva instancia de ZonedDateTime con la misma fecha y hora local, pero en una zona horaria diferente.
```java
ZoneId nuevaZonaHoraria = ZoneId.of("Australia/Sydney");
ZonedDateTime fechaHoraEnSydney = fechaHoraZonificada.withZoneSameLocal(nuevaZonaHoraria);
```
-    `atZone`: se utiliza para convertir un objeto Temporal en un ZonedDateTime al agregar información de zona horaria. Este método toma como argumento una instancia de ZoneId, que representa la zona horaria a la que se desea agregar el objeto Temporal.
```java
LocalDateTime localDateTime = LocalDateTime.of(2022, 2, 26, 14, 30);
ZoneId zonaHoraria = ZoneId.of("America/New_York");

ZonedDateTime zonedDateTime = localDateTime.atZone(zonaHoraria);
```
<h2 align="center">'Duration', 'Instant' y 'Period'</h2>
<p>En Java, las clases `Duration`, `Instant` y `Period` están relacionadas con la representación y manipulación de intervalos de tiempo, puntos específicos en el tiempo y períodos entre fechas respectivamente. </p>

<h3>Duration</h3>
Representa un intervalo de tiempo con precisión en términos de horas, minutos, segundos y nanosegundos. Se utiliza para medir la duración entre dos instantes.

```java
Instant inicio = Instant.now();
Instant fin = Instant.now().plusSeconds(60);

Duration duracion = Duration.between(inicio, fin);
System.out.println("Duración: " + duracion);
```
-    `of` y `ofDays`, `ofHours`, `ofMinutes`, `ofSeconds`, `ofMillis`, `ofNanos`: Métodos estáticos para crear instancias de Duration.
-    `between`: Método estático para calcular la duración entre dos instantes.
-    `plus` y `minus`: Para agregar o restar una duración a un instante.
-    `toDays`, `toHours`, `toMinutes`, `toSeconds`, `toMillis`, `toNanos`: Métodos para obtener la duración en diferentes unidades.

<h3>Instant</h3>
Representa un punto específico en el tiempo en UTC, sin información de zona horaria ni fecha. Se utiliza para obtener marcas de tiempo exactas y comparar instantes en el tiempo.

```java
Instant ahora = Instant.now();
System.out.println("Instante actual: " + ahora);
```
-    `now`: Método estático para obtener la marca de tiempo actual.
-    `plus` y `minus`: Para agregar o restar una duración a un instante.
-    `isBefore` y `isAfter`: Para comparar instantes.
-    `atZone`: Para convertir un Instant a un ZonedDateTime en una zona horaria específica.
<h3>Period</h3>
Representa un período de tiempo con precisión en términos de años, meses y días. Se utiliza para medir la diferencia entre dos fechas sin tener en cuenta las horas, minutos y segundos.

```java
LocalDate fechaInicio = LocalDate.of(2022, 2, 26);
LocalDate fechaFin = LocalDate.of(2022, 3, 5);

Period periodo = Period.between(fechaInicio, fechaFin);
System.out.println("Período: " + periodo);
```
-    `of` y `ofYears`, `ofMonths`, `ofDays`: Métodos estáticos para crear instancias de `Period`.
-    `between`: Método estático para calcular el período entre dos fechas.
-    `plus` y `minus`: Para agregar o restar un período a una fecha.
-    `getYears`, `getMonths`, `getDays`: Métodos para obtener los componentes del período.
