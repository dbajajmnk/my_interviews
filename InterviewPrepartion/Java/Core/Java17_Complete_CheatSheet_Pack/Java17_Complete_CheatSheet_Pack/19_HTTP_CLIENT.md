# Modern HTTP Client

## Package

```java
java.net.http
```

## Client

```java
HttpClient client =
    HttpClient.newHttpClient();
```

## Request

```java
HttpRequest request =
    HttpRequest.newBuilder()
        .uri(URI.create("https://example.com"))
        .GET()
        .build();
```

## Sync

```java
HttpResponse<String> response =
    client.send(
        request,
        HttpResponse.BodyHandlers.ofString()
    );
```

## Async

```java
client.sendAsync(
        request,
        HttpResponse.BodyHandlers.ofString()
    )
    .thenApply(HttpResponse::body)
    .thenAccept(System.out::println);
```

## Supports

```text
HTTP/1.1
HTTP/2
Synchronous
Asynchronous
WebSocket APIs
```

## Production Rule

Configure:

```text
timeouts
authentication
error mapping
retry policy
connection behavior
observability
```
