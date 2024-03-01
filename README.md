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
