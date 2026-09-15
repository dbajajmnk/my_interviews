# Java 25 Commands / Preview Flags

## Version

```bash
java -version
javac -version
```

## Compile

```bash
javac Demo.java
```

## Run

```bash
java Demo
```

## Preview Compile

```bash
javac --enable-preview --release 25 Demo.java
```

## Preview Run

```bash
java --enable-preview Demo
```

## JFR

```bash
jcmd
jfr
```

Typical diagnostic ecosystem:

```text
jcmd
jstack
jmap
jstat
jfr
Java Mission Control
```

## Compact Headers

```bash
java -XX:+UseCompactObjectHeaders ...
```

## Rule

Do not copy JVM flags from older Java versions without validating them on Java 25.
